package Bai18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Nguoi {
	ArrayList<Nguoi> dsNhanSu = new ArrayList<Nguoi>();
	static final String fname = "DSNHANSU.dat";
	static final double luongCB = 450000;
	private String hoTen,cccd, chucVu;
	private int namCongTac, namSinh;
	private double hsl;
	private double phuCap;
	
	public void Nguoi() {
		
	}
	public String getHoTen() {
		return hoTen;
	}
	public static double getLuongCB() {
		return luongCB;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public String getCccd() {
		return cccd;
	}
	public void setCccd(String cccd) {
		this.cccd = cccd;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public int getNamCongTac() {
		return namCongTac;
	}
	public void setNamCongTac(int namCongTac) {
		this.namCongTac = namCongTac;
	}
	public double getHsl() {
		return hsl;
	}
	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("NHAP SO LUONG NHAN SU: ");
		int n = sc.nextInt();
		for (int i=0 ; i<n; i++) {
		System.out.print("HO TEN: ");
		setHoTen(sc.nextLine());
		System.out.print("Nam sinh: ");
		setNamSinh(sc.nextInt());
		setNamSinh(2023-getNamSinh()); 
		System.out.print("CCCD: ");
		System.out.print("NAM CONG TAC: ");
		setNamCongTac(sc.nextInt());
		int choice = 0;
		do {
			System.out.print("CHUC VU (1.Ki Su - 2.Cong nhan - 3.Dien vien) ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				KiSu ks = new KiSu();
				setChucVu(IChucVu.CHUCVU[0]);
				setHsl(2.34);
				ks.nhap();
				dsNhanSu.add(ks);
				
				break;
			}
			case 2: {
				Nguoi cn = new Nguoi();
				setChucVu(IChucVu.CHUCVU[1]);
				setHsl(1.92);
				cn.nhap();
				dsNhanSu.add(cn);
				break;
				
			}
			case 3: {
				DienVien dv = new DienVien();
				setChucVu(IChucVu.CHUCVU[2]);
				setHsl(3.2);
				dv.nhap();
				dsNhanSu.add(dv);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice == 0);
	}
		
		
		
	}
	public void xuat() {
		
		System.out.printf("\n%-20s",getHoTen());
		System.out.printf("%-10s",getNamSinh());
		System.out.printf("%-20s",getCccd());
		System.out.printf("%-15s",getChucVu());
		System.out.printf("%-13d",getNamCongTac());
	}
	
		
}
