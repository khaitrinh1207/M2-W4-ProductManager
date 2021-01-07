package storage;

import model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {
    public static final String PRODUCT_FILE_NAME = "product.dat";

    public static void write(List<Product> list){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(new File(PRODUCT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
