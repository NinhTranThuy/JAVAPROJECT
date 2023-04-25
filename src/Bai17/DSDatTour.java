
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DSDatTour {
    static final String fname = "DATTOUR.dat";
    ArrayList<DatTour> lstDT;
    public DSDatTour (){
        lstDT = new ArrayList<DatTour>();
    }


    public void nhapDSDatTour()
        throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG DAT TOUR: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            DatTour dt = new DatTour();
            dt.nhapDatTour();
            lstDT.add(dt);
        }
    }

    public void xuatDSDatTour(){
        for (DatTour dt:lstDT){
            dt.xuatDatTour();
            System.out.println("\n ");
        }
    }

    public void ghiFileDT() throws IOException{
        FileOutputStream fout = null;
        ObjectOutputStream objout = null;
        try {
            fout = new FileOutputStream(fname);
            objout = new ObjectOutputStream(fout);
            objout.writeInt(lstDT.size());
            for (DatTour dt:lstDT){
                objout.writeObject(dt);
            }
            System.out.println("--GHI FILE THANH CONG!!--");
        } finally {
            if (fout != null) fout.close();
            if (objout != null) objout.close();
        }
    }

    public ArrayList<DatTour> docFileDatTour() 
        throws IOException, ClassNotFoundException, FileNotFoundException{
        ghiFileDT();
        FileInputStream fin = null;
        ObjectInputStream objin = null;
        ArrayList<DatTour> lst = new ArrayList<DatTour>();
        try {
            int n = objin.readInt();
            while (true){
                DatTour dt = (DatTour) objin.readObject();
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
        ArrayList<DatTour> kq = docFileDatTour();
        if (kq != null){
            for (DatTour dt:kq){
                dt.xuatDatTour();
            }
        }
    }

    public void sapxepTheoKieuTour()
        throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<DatTour> list = docFileDatTour();
        if (list != null){
            Collections.sort(list, new Comparator<DatTour>() {
                @Override
                public int compare(DatTour o1, DatTour o2){
                    return o1.tour.getKieuTour().compareTo(o2.tour.getKieuTour());
                }
            });
        }

    }

    public void sapXepTheoKieuKH()
        throws IOException, ClassNotFoundException, FileNotFoundException{
        ArrayList<DatTour> list = docFileDatTour();
        if (list != null){
            Collections.sort(list, new Comparator<DatTour>() {
                @Override
                public int compare(DatTour o1, DatTour o2){
                    return o1.kh.getKieuKH().compareTo(o2.kh.getKieuKH());
                }
            });
        }

    }
}
