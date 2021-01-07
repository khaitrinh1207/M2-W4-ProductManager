package Manager;

import model.Product;
import storage.WriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> list ;

    public ProductManager() {
        list = new ArrayList<>();
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(List<Product> list) {
        this.list = list;
    }

    public void themSanPham(Product p){
        list.add(p);
        WriteFile.write(list);
    }

    public void suaSanPham(int index,Product p){
        list.set(index,p);
        WriteFile.write(list);
    }


    public void hienThiSanPham(){
        for (Product i: list) {
            System.out.println(i);
        }
    }

    public void timKiemSanPham(String tenSanPham){
        for (Product i:list) {
            if(tenSanPham.equalsIgnoreCase(i.getTenSanPham()))
                System.out.println(i);
            else
                System.out.println("Sản phẩm không tồn tại");
        }
    }
}
