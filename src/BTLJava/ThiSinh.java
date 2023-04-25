
import java.io.Serializable;
import java.util.Scanner;

public class ThiSinh extends Nguoi implements Serializable{
    private String SBD;
	private String khuVuc;
	private float diemUuTien;
	private String tenTruongC3;
	
	
	public ThiSinh() {
	}
	public String getSBD() {
		return SBD;
	}
	public void setSBD(String sBD) {
		SBD = sBD;
	}
	public String getKhuVuc() {
		return khuVuc;
	}
	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}
	public float getDiemUuTien() {
		return diemUuTien;
	}
	public void setDiemUuTien(float diemUuTien) {
		this.diemUuTien = diemUuTien;
	}
	public String getTenTruongC3() {
		return tenTruongC3;
	}
	public void setTenTruongC3(String tenTruongC3) {
		this.tenTruongC3 = tenTruongC3;
	}
	public void nhap(){
    	super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("SBD: ");
        setSBD(sc.nextLine());
        System.out.print("Khu vuc: ");
        setKhuVuc(sc.nextLine());
        System.out.print("Diem UT: ");
        setDiemUuTien(sc.nextFloat());
		String c = sc.nextLine();
        System.out.print("Truong C3: ");
        setTenTruongC3(sc.nextLine());
    }

    public void xuat(){
    	super.xuat();
        System.out.printf("%15s",getSBD());
        System.out.printf("%15s",getKhuVuc());
        System.out.printf("%15f",getDiemUuTien());
        System.out.printf("%10s",getTenTruongC3());
    }
}
