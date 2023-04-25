
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSKhachHang {
    ArrayList<KhachHang> lstKH;
    static final String fname = "KH.dat";
    public DSKhachHang (){
        lstKH = new ArrayList<KhachHang>();
    }

    public void nhapDSKH(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG KHACH HANG: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            KhachHang kh = new KhachHang();
            kh.nhapKH();
            lstKH.add(kh);
        }
    }

    public void xuatDSKH(){
        for (KhachHang kh:lstKH){
            kh.xuatKH();
            System.out.println("\n ");
        }
    }

    public void ghiFileKH() throws IOException{
        FileOutputStream fout = null;
        ObjectOutputStream objout = null;
        try {
            fout = new FileOutputStream(fname);
            objout = new ObjectOutputStream(fout);
            objout.writeInt(lstKH.size());
            for (KhachHang kh:lstKH){
                objout.writeObject(kh);
            }
            System.out.println("--GHI FILE THANH CONG!!--");
        } finally {
            if (fout != null) fout.close();
            if (objout != null) objout.close();
        }
    }

    public ArrayList<KhachHang> docFileKH() 
        throws IOException, ClassNotFoundException, FileNotFoundException{
        FileInputStream fin = null;
        ObjectInputStream objin = null;
        ArrayList<KhachHang> lst = new ArrayList<KhachHang>();
        try {
            fin = new FileInputStream(fname);
            objin = new ObjectInputStream(fin);
            int n = objin.readInt();
            while (true){
                KhachHang kh = (KhachHang) objin.readObject();
                lst.add(kh);
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

    public void hienDSKH() 
        throws IOException, FileNotFoundException, ClassNotFoundException{
        ghiFileKH();
        ArrayList<KhachHang> kq = docFileKH();
        if (kq != null){
            for (KhachHang kh:kq){
                kh.xuatKH();
                System.out.println("\n");
            }
        }
    }

    public KhachHang timKhachHang(int id)
        throws IOException, ClassNotFoundException{
        ArrayList<KhachHang> lstKH = docFileKH();
        for (KhachHang kh:lstKH){
            if (kh.getMaKH() == id){
                return kh;
            }
        }
        return null;
    }

}
