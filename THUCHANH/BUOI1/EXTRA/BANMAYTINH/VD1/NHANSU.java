import java.util.Scanner;
import java.util.*;
public class NHANSU {
    private String Hoten, GioiTinh, DiaChi;
    private int tuoi;

    public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		Hoten = hoten;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
    
    public void nhapNS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap HO TEN: ");
        setHoten(sc.nextLine());
        System.out.print("Nhap TUOI: ");
        setTuoi(sc.nextInt());
        String c=sc.nextLine();
        System.out.print("Nhap GIOI TINH: ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nhap DIA CHI: ");
        setDiaChi(sc.nextLine());
    }
    public void inNS(){
        System.out.printf("%10s", getHoten());
        System.out.printf("%5d", getTuoi());
        System.out.printf("%5s", getGioiTinh());
        System.out.printf("%10s", getDiaChi());
    }

}
