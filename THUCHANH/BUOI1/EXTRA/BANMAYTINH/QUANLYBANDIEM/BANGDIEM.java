import java.util.ArrayList;
import java.util.Scanner;

public class BANGDIEM {
    private String maLop, monHoc,hocKy, ngayThi, GV;
    private int namHoc;
    ArrayList<DIEM> lst;
    
    public BANGDIEM(){

    }
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }
    public String getMaLop() {
        return maLop;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }
    public String getHocKy() {
        return hocKy;
    }
    public void setNgayThi(String ngayThi) {
        this.ngayThi = ngayThi;
    }
    public String getNgayThi() {
        return ngayThi;
    }
    public void setGV(String gV) {
        GV = gV;
    }
    public String getGV() {
        return GV;
    }
    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }
    public int getNamHoc() {
        return namHoc;
    }
    
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("MA LOP: ");
        setMaLop(sc.nextLine());
        System.out.print("MON HOC: ");
        setMonHoc(sc.nextLine());
        System.out.print("HOC KY: ");
        setHocKy(sc.nextLine());
        System.out.print("NGAY THI: ");
        setNgayThi(sc.nextLine());
        System.out.print("GIAO VIEN: ");
        setGV(sc.nextLine());
        System.out.print("NAM HOC: ");
        setNamHoc(sc.nextInt());
        System.out.println("NHAP SO LUONG SINH VIEN:");
        int n = sc.nextInt();
        lst = new ArrayList<DIEM>();
        for (int i=0;i<n;i++){
            DIEM d= new DIEM();
            lst.add(d);
        }
    }
    public void xuatDS(){
        System.out.printf("\nMA LOP: %6s - MON HOC: %15S", getMaLop(),getMonHoc());
        System.out.printf("\nHOC KY: %4s - NGAY THI: %8S", getHocKy(),getNgayThi());
        System.out.printf("\nGIAO VIEN: %10s - NAM HOC: %6S", getGV(),getNamHoc());
        for (DIEM d:lst){
            d.xuatDiem();
        }
    }

    public void tenSVHocLai(){
        System.out.println("DANH SACH TEN SINH VIEN HOC LAI: "+ maLop);
        for (DIEM d:lst){
            if (d.tinhDIemHP() < 5.0){
                System.out.println("\n"+ d.getHoTen());
            }
        }
    }
    public int demSVHocLai(){
        int count = 0;
        System.out.println("DEM SINH VIEN HOC LAI:");
        for (DIEM d:lst){
            if (d.tinhDIemHP() < 5){
                count++;
            }
        }
        return count;
    }

}
