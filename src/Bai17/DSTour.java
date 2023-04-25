
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class DSTour {
    ArrayList<Tour> lstTour;
    static final String fname = "Tour.dat";
    public DSTour (){
        lstTour = new ArrayList<Tour>();
    }

    public void nhapDSTour(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG TOUR: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            Tour t  = new Tour();
            t.nhapTour();;
            lstTour.add(t);
        }
    }

    public void xuatDSTour(){
        for (Tour t:lstTour){
            t.xuatTour();
            System.out.println("\n ");
        }
    }

    public void ghiFileT() throws IOException{
        FileOutputStream fout = null;
        ObjectOutputStream objout = null;
        try {
            fout = new FileOutputStream(fname);
            objout = new ObjectOutputStream(fout);
            objout.writeInt(lstTour.size());
            for (Tour t:lstTour){
                objout.writeObject(t);
            }
            System.out.println("--GHI FILE THANH CONG!!--");
        } finally {
            if (fout != null) fout.close();
            if (objout != null) objout.close();
        }
    }

    public ArrayList<Tour> docFileT() 
        throws IOException, ClassNotFoundException, FileNotFoundException{
        FileInputStream fin = null;
        ObjectInputStream objin = null;
        ArrayList<Tour> lst = new ArrayList<Tour>();
        try {
            fin = new FileInputStream(fname);
            objin = new ObjectInputStream(fin);
            int n = objin.readInt();
            while (true){
                Tour t = (Tour) objin.readObject();
                lst.add(t);
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

    public void hienDSTour() 
        throws IOException, FileNotFoundException, ClassNotFoundException{
        ArrayList<Tour> kq = docFileT();
        if (kq != null){
            for (Tour t:kq){
                t.xuatTour();
                System.out.println("\n");
            }
        }
    }

    public Tour timMaTour(int id) 
        throws IOException,ClassNotFoundException{
        ArrayList<Tour> lstTour = docFileT();
        for (Tour t:lstTour){
            if (t.getMaTour() == id){
                return t;
            }
        }
        return null;
    }
}
