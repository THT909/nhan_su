package bh2;

import java.util.Scanner;

public class NhanSu {
    private int ma;
    private String hoTen;
    private Ngay vaoLam;
    private Ngay ngaySinh;
    private double hesoLuong;
    private String chucVu;
    
    public NhanSu(int ma, String hoTen, Ngay vaoLam, Ngay ngaySinh, double hesoLuong, String chucVu) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.vaoLam = vaoLam;
        this.ngaySinh = ngaySinh;
        this.hesoLuong = hesoLuong;
        this.chucVu = chucVu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Ngay getVaoLam() {
        return vaoLam;
    }

    public void setVaoLam(Ngay vaoLam) {
        this.vaoLam = vaoLam;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getHesoLuong() {
        return hesoLuong;
    }

    public void setHesoLuong(double hesoLuong) {
        this.hesoLuong = hesoLuong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    Scanner in =new Scanner(System.in);
    public void nhap() {
        System.out.print("nhap ma so nhan vien");
        ma =in.nextInt();
        System.out.println("nhap ten nhan vien");
        hoTen= in.nextLine();
        System.out.println("nhap ngay vao lam");
        // vaoLam=in.nextInt();




    }



}

     