package Bai18;

import java.io.Serializable;

public class DienVien extends Nguoi implements Serializable{
	private double luong;
	public double getLuong() {
		return luong;
	}

	public void setLuong() {
		this.luong = super.getLuongCB() * super.getHsl();
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
