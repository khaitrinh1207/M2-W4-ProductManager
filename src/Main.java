import Manager.ProductManager;
import model.Product;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.themSanPham(new Product("t14","thinkpad","lenovo",20000,"rất tốt"));
        productManager.hienThiSanPham();
        productManager.timKiemSanPham("thinkpad");
    }
}
