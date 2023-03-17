import java.util.Scanner;

public class HOCSINH extends NHANSU {
    private String lop;
    private float diemToan, diemVan;

    
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}
	public float getDiemVan() {
		return diemVan;
	}
	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}
    public void nhapHS(){
        super.nhapNS();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap LOP: ");
        setLop(sc.nextLine());
        System.out.print("Nhap DIEM TOAN: ");
        setDiemToan(sc.nextFloat());
        System.out.print("Nhap DIEM VAN: ");
        setDiemVan(sc.nextFloat());
        
    }

    public void xuatHS(){
        super.inNS();
        System.out.printf("%7s", getLop());
        System.out.printf("%5.1f", getDiemToan());
        System.out.printf("%5.1f", getDiemVan());
    }

    public float tinhDiemTB(){
        return (float)(getDiemToan()+ getDiemVan())/2;
    }
}
