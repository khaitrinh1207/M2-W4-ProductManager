package storage;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static storage.WriteFile.PRODUCT_FILE_NAME;

public class ReadFile {
    public List<Product> read(){
        List<Product> list = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(PRODUCT_FILE_NAME));
            ois = new ObjectInputStream(fis);
            list = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
