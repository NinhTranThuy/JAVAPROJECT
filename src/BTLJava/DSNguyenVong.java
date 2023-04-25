
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSNguyenVong {
    ArrayList<NguyenVong> lstNV;
    static final String fname = "DSNguyenVong.dat";

    public DSNguyenVong() {
        lstNV = new ArrayList<NguyenVong>();
    }

    public void nhapDS(){
        System.out.print("NHAP SO LUONG NGUYEN VONG:");
        int n = new Scanner(System.in).nextInt();
        for (int i=0; i<n;i++){
            NguyenVong nv = new NguyenVong();
            nv.nhap();
            lstNV.add(nv);
        }
    }

    public void xuatDS(){
        for (NguyenVong nv:lstNV){
            nv.xuat();
            System.out.println("___________________________________________\n");
        }
    }

    public void ghiFile() 
        throws ClassNotFoundException, IOException{
        FileOutputStream fout = null;
        ObjectOutputStream objout = null;
        
        try {
            fout = new FileOutputStream(fname);
            objout = new ObjectOutputStream(fout);
            objout.writeInt(lstNV.size());
            for (NguyenVong nv:lstNV){
                objout.writeObject(nv);
            }
        } finally {
            // TODO: handle exception
            if (fout != null) fout.close();
            if (objout != null) objout.close();
        }
    }

    public ArrayList<NguyenVong> docFile()
    throws ClassNotFoundException, IOException{
        ArrayList<NguyenVong> ds = new ArrayList<NguyenVong>();
        FileInputStream fin = null;
        ObjectInputStream objin = null;
        try {
            fin = new FileInputStream(fname);
            objin = new ObjectInputStream(fin);
            int sl = objin.readInt();
        } finally {
            // TODO: handle exception
            if (fin != null) fin.close();
            if (objin != null) objin.close();
        }
        return ds; 
    }

    public void hienDS()
        throws ClassNotFoundException, IOException{
        ArrayList<NguyenVong> lstNV = docFile();
        System.out.println("------DANH SACH NGUYEN VONG------");
        for (NguyenVong nv:lstNV){
            nv.xuat();
        }

    }
    public int demNV() {
		return lstNV.size();
	}
    
}
