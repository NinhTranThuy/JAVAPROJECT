package Bai18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
	ArrayList<Nguoi> lstNguoi;
	static final String fname = "lstNguoi.dat";
	
	public void nhapDS() {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong nhan su: ");
		n=sc.nextInt();
		lstNguoi = new ArrayList<Nguoi>();
		
		for(int i=0;i<n;i++) {
			int chon=0;
			System.out.println("Nhap (1-Cong nhan), (2-Ki su), (3-Dien Vien): ");
			chon=sc.nextInt();
			if(chon==1) {
				CongNhan cn= new CongNhan();
				cn.nhap();
				lstNguoi.add(cn);
			}else if(chon==2) {
				KiSu ks= new KiSu();
				ks.nhap();
				lstNguoi.add(ks);
			}else if(chon==3) {
				DienVien dv= new DienVien();
				dv.nhap();
				lstNguoi.add(dv);
			}else {
				System.out.println("Nhap sai lua chon!! Yeu cau nhap lai!!");
			}
		}
		ghiFile();
	}
	public void ghiFile()
			throws ClassNotFoundException, IOException{
			FileOutputStream fout = null;
			ObjectOutputStream objout = null;
			
			try {
				fout = new FileOutputStream(fname);
				objout = new ObjectOutputStream(fout);
				objout.writeInt(lstNguoi.size());
				for (Nguoi ks:lstNguoi) {
					objout.writeObject(ks);
				}
			} finally {
				// TODO: handle finally clause
				if (fout != null ) fout.close();
				if (objout != null) objout.close();
			}
		}
		
	public ArrayList<Nguoi> docFile() 
		        throws IOException, ClassNotFoundException, FileNotFoundException{
		        FileInputStream fin = null;
		        ObjectInputStream objin = null;
		        ArrayList<Nguoi> lst = new ArrayList<Nguoi>();
		        try {
		            int n = objin.readInt();
		            while (true){
		                Nguoi dt = (Nguoi) objin.readObject();
		                lst.add(dt);
		                n--;
		                if (n == 0){
		                    break;
		                }
		            }
		        } finally {
		            // TODO: handle exception
		            if (fin != null) fin.close();
		            if (objin != null) objin.close();
		        }
		        return lst;
		    }

	public void hienDSDTour() 
		   throws IOException, FileNotFoundException, ClassNotFoundException{
		    	ArrayList<Nguoi> kq = docFile();
		    	if (kq != null){
		            for (Nguoi ks:kq){
		                ks.xuat();
		            }
		    	}
	}
	
	
	public void LuongMax() {
		double maxLuong = lstNguoi.get(0).getLuong();
		for (Nguoi ng:lstNguoi) {
			if ()
		}
	}
}
