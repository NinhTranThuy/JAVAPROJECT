import java.io.Serializable;
import java.util.Scanner;

public class NguyenVong implements Serializable {
    private String khoiThi;
	private float diemM1, diemM2, diemM3;
	private String tenTruongThi;
	private String nganh;

    
    public NguyenVong() {
    }
    public String getKhoiThi() {
        return khoiThi;
    }
    public void setKhoiThi(String khoiThi) {
        this.khoiThi = khoiThi;
    }
    public float getDiemM1() {
        return diemM1;
    }
    public void setDiemM1(float diemM1) {
        this.diemM1 = diemM1;
    }
    public float getDiemM2() {
        return diemM2;
    }
    public void setDiemM2(float diemM2) {
        this.diemM2 = diemM2;
    }
    public float getDiemM3() {
        return diemM3;
    }
    public void setDiemM3(float diemM3) {
        this.diemM3 = diemM3;
    }
    public String getTenTruongThi() {
        return tenTruongThi;
    }
    public void setTenTruongThi(String tenTruongThi) {
        this.tenTruongThi = tenTruongThi;
    }
    public String getNganh() {
        return nganh;
    }
    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("KHOI THI (A00 - A01 - D00): ");
        setKhoiThi(sc.nextLine());
        System.out.print("DIEM MON 1: ");
        setDiemM1(sc.nextFloat());
        System.out.print("DIEM MON 2: ");
        setDiemM2(sc.nextFloat());
        System.out.print("DIEM MON 3: ");
        setDiemM3(sc.nextFloat());
        String c = sc.nextLine();
        System.out.print("TEN TRUONG THI: ");
        setTenTruongThi(sc.nextLine());
        System.out.print("NGANH THI: ");
        setNganh(sc.nextLine());
    }

    public void xuat(){
        System.out.println("\n");
        System.out.printf("%10s",getKhoiThi());
        System.out.printf("%10f",getDiemM1());
        System.out.printf("%10f",getDiemM2());
        System.out.printf("%10f",getDiemM3());
        System.out.printf("%15s",getNganh());
        System.out.printf("%10s",getTenTruongThi());
    }

    public float tinhDiem(){
        ThiSinh ts = new ThiSinh();
        return getDiemM1()+getDiemM2()+getDiemM3()+ts.getDiemUuTien();
    }
}
