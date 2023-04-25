import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DSPhieuDkiNV {
    static final String fname = "DSPhieuDkiNV.dat";
    ArrayList<PhieuDkiNV> dsPhieu;

    public DSPhieuDkiNV(){
        dsPhieu = new ArrayList<PhieuDkiNV>();
    }

    public void nhapDS(){
        System.out.print("NHAP SO LUONG PHIEU DANG KY:");
        int n = new Scanner(System.in).nextInt();
        for (int i=0; i<n;i++){
            PhieuDkiNV phieu = new PhieuDkiNV();
            phieu.nhap();
            dsPhieu.add(phieu);
        }
    }

    public void xuatDS(){
        for (PhieuDkiNV phieu:dsPhieu){
            phieu.xuat();
        }
    }
    public void ghiFile() 
        throws ClassNotFoundException, IOException, FileNotFoundException{
        FileOutputStream fout = null;
        ObjectOutputStream objout = null;
        
        try {
            fout = new FileOutputStream(fname);
            objout = new ObjectOutputStream(fout);
            objout.writeInt(dsPhieu.size());
            for (PhieuDkiNV ds:dsPhieu){
                objout.writeObject(ds);
            }
        } finally {
            if (fout != null) fout.close();
            if (objout != null) objout.close();
        }
    }

    public ArrayList<PhieuDkiNV> docFile()
    throws ClassNotFoundException, IOException, FileNotFoundException{
        ArrayList<PhieuDkiNV> ds = new ArrayList<PhieuDkiNV>();
        FileInputStream fin = null;
        ObjectInputStream objin = null;
        try {
            fin = new FileInputStream(fname);
            objin = new ObjectInputStream(fin);
            int sl = objin.readInt();
			while(true){
				PhieuDkiNV phieu = (PhieuDkiNV)objin.readObject();
				ds.add(phieu);
				sl--;
				if (sl==0){
					break;
				}
			}
        } finally {
            if (fin != null) fin.close();
            if (objin != null) objin.close();
        }
        return ds; 
    }

    public void hienDS()
        throws ClassNotFoundException, IOException, FileNotFoundException{
        ArrayList<PhieuDkiNV> dsPhieu = docFile();
        System.out.println("------DANH SACH PHIEU DANG KI------");
        if (dsPhieu != null){
			for (PhieuDkiNV ds:dsPhieu){
				ds.xuat();
			}
		}
    }

    public void themPhieuVaoDS() {
		PhieuDkiNV phieu = new PhieuDkiNV();
		phieu.nhap();
		
		dsPhieu.add(phieu);
		
		System.out.println("\nDanh sach phieu dang ki sau khi them la:");
		for(int i=0;i<dsPhieu.size();i++) {
			dsPhieu.get(i).xuat();
		}
	}
    public void xoaPhieuTheoMa() {
		Scanner sc= new Scanner(System.in);
		System.out.println("\nNhap ma phieu can xoa: ");
		String maPhieu= sc.nextLine();
		for(int i=0;i<dsPhieu.size();i++) {
			if(dsPhieu.get(i).getMaPhieu().equals(maPhieu)) {
				dsPhieu.remove(i);
				break;
			}
		}
		System.out.println("\nDanh sach cac phieu sau khi xoa la: ");
		for(int i=0;i<dsPhieu.size();i++) {
			dsPhieu.get(i).xuat();
		}
	}	
	public void xoaTatCaPhieu() {
		System.out.println("Xoa tat ca cac phieu thanh cong!!!");
		dsPhieu.removeAll(dsPhieu);
	}
    public void searchForPhieuDkiNV(){

    }

    public void inDsTheoTen() {
		Scanner sc = new Scanner(System.in);
		System.out.println("NHAP TEN THI SINH CAN TIM KIEM: ");
		String Ten = sc.nextLine();
		System.out.println("\t\t\tDANH SACH PHIEU DANG KI THEO TEN THI SINH:\t\t\t");
		for(PhieuDkiNV phieu: dsPhieu) {
			if(phieu.getTs().getHoTen().equals(Ten)==true) {
				phieu.xuat();
			}
		}
	}
    public void inDsTheoMaPhieu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("NHAP MA PHIEU CAN TIM KIEM: ");
		String maPhieu = sc.nextLine();
		System.out.println("\t\t\tDANH SACH PHIEU DANG KI THEO TEN MA:\t\t\t");
		for(PhieuDkiNV phieu: dsPhieu) {
			if(phieu.getMaPhieu().equals(maPhieu)==true) {
				phieu.xuat();
			}
		}
	}
    public int demSoPhieu() {
		return dsPhieu.size();
	}
	
	public void sapXepGiamDiemUT() {
		System.out.println("\nDS phieu dang ki sau khi sap xep giam dan theo diem uu tien la:");
		Collections.sort(dsPhieu, new Comparator_DiemUT());
		xuatDS();
	}
	
	public void sapXepTangTheoTen() {
		System.out.println("\nDS phieu dang ki sau khi sap xep tang dan theo ten: ");
		Collections.sort(dsPhieu, new Comparator_TenTS());
		xuatDS();
	}

    public void TScoNVongMax() {
		int max=dsPhieu.get(0).dsnv.demNV();
		for(int i=0;i<dsPhieu.size();i++) {
			if(max<dsPhieu.get(i).dsnv.demNV()) {
				max=dsPhieu.get(i).dsnv.demNV();
			}
		}
		System.out.println("\nThong tin cua thi sinh có nguyen vong max la:");
		for(int i=0;i<dsPhieu.size();i++) {
			if(max==dsPhieu.get(i).dsnv.demNV()) {
				dsPhieu.get(i).xuat();
			}
		}
	}
	
	public void TScoNVongMin() {
		int min=dsPhieu.get(0).dsnv.demNV();
		for(int i=0;i<dsPhieu.size();i++) {
			if(min>dsPhieu.get(i).dsnv.demNV()) {
				min=dsPhieu.get(i).dsnv.demNV();
			}
		}
		System.out.println("\nThong tin cua thi sinh có nguyen vong min la:");
		for(int i=0;i<dsPhieu.size();i++) {
			if(min==dsPhieu.get(i).dsnv.demNV()) {
				dsPhieu.get(i).xuat();
			}
		}
	}
    public void suaThongTin() {
    }
}
