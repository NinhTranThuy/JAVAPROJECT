package Bai18;

import java.io.Serializable;
import java.util.Scanner;

public class CongNhan extends Nguoi implements Serializable {
	private double luong;

	public CongNhan() {
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong() {
		this.luong = super.getLuongCB() * super.getHsl();
	}
	
	@Override
	public double tinhPhuCap() {
		return((0.3*)*super.getNamCongTac());
	}
	public void nhap() {
		setLuong();
	}
	public void xuat() {
		super.xuat();
		System.out.printf("%10f",getHsl());
		System.out.printf("%15f",getLuong());
	}
	
	
	
	
	
}
