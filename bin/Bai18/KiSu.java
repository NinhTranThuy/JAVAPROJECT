package Bai18;

import java.io.Serializable;
import java.util.Scanner;

public class KiSu extends Nguoi implements Serializable{
	private String toCongTac;
	private double luong;
	public KiSu() {
		super();
	}
	public String getToCongTac() {
		return toCongTac;
	}
	public void setToCongTac(String toCongTac) {
		this.toCongTac = toCongTac;
	}
	public double getLuong() {
		return luong;
	}
	public void setLuong(double luong) {
		this.luong = super.getLuongCB() * super.getHsl();
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("TO CONG TAC: ");
		setToCongTac(sc.nextLine());
	}
	
	public void xuat() {
		super.xuat();
		System.out.printf("%10s",getToCongTac());
		System.out.printf("%10f",getHsl());
		System.out.printf("%15f",getLuong());
	}
	
}
