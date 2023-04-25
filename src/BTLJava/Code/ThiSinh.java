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
		this.tenTruongC3 = "THPT " + tenTruongC3;
	}
	public void nhap(){
    	super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("SBD: ");
        setSBD(sc.nextLine());
        System.out.print("Khu vuc: 1-KV1; 2-KV2; 3-KV2-NT; 4-KV3: ");
		int kv = sc.nextInt();
		switch (kv) {
			case 1:
				setKhuVuc("KV1");
				break;
			case 2:
				setKhuVuc("KV2");
				break;
			case 3:
				setKhuVuc("KV2-NT");
				break;
			case 4:
				setKhuVuc("KV3");
				break;
			default:
				break;
		}

        switch (getKhuVuc()) {
			case "KV1":
				System.out.println("DIEM KHU VUC 1: 0.75");
				setDiemUuTien((float) 0.75);
				break;
			case "KV2":
				System.out.println("DIEM KHU VUC 2: 0.25");
				setDiemUuTien((float) 0.25);
				break;
			case "KV2-NT":
				System.out.println("DIEM KHU VUC 2-NT: 0.5");
				setDiemUuTien((float) 0.5);
				break;
			case "KV3":
				System.out.println("DIEM KHU VUC 3: KHONG DC UT");
				setDiemUuTien((float) 0);
				break;
		}
		String c = sc.nextLine();
        System.out.print("Truong C3: THPT ");
        setTenTruongC3(sc.nextLine());
    }

    public void xuat(){
    	super.xuat();
        System.out.printf("%10s",getSBD());
        System.out.printf("%10s",getKhuVuc());
        System.out.printf("%10f",getDiemUuTien());
        System.out.printf("%15s",getTenTruongC3());
    }
}
