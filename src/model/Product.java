package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private double gia;
    private String moTa;

    public Product() {
    }

    public Product(String maSanPham, String tenSanPham, String hangSanXuat, double gia, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHanSanXuat() {
        return hangSanXuat;
    }

    public void setHanSanXuat(String hanSanXuat) {
        this.hangSanXuat = hanSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Sản phẩm ["+
                " mã sản phẩm : "+ maSanPham+
                ", tên sản phẩm : " + tenSanPham+
                ", hãng sản xuất : " + hangSanXuat +
                ", giá : " + gia +
                ", mô tả : " + moTa+
                " ]";
    }
}
