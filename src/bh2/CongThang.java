package bh2;

public class CongThang{
    private int thang;
    private int ngayCong;
    private int nghiPhep;

    
    public CongThang(int thang, int ngayCong, int nghiPhep) {
        this.thang = thang;
        this.ngayCong = ngayCong;
        this.nghiPhep = nghiPhep;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNgayCong() {
        return ngayCong;
    }
    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
    public int getNghiPhep() {
        return nghiPhep;
    }
    public void setNghiPhep(int nghiPhep) {
        this.nghiPhep = nghiPhep;
    }
}