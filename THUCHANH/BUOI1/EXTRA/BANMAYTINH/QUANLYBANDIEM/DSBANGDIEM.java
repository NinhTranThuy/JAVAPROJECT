import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DSBANGDIEM {
    ArrayList<BANGDIEM> dsBD;

    public DSBANGDIEM(){

    }
    public void nhapDSBD(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP SO LUONG BANG DIEM:");
        int n = sc.nextInt();
        dsBD = new ArrayList<BANGDIEM>();
        for (int i=0;i<n;i++){
            BANGDIEM bd = new BANGDIEM();
            bd.nhapDS();
            dsBD.add(bd);
        }
    }

    public void xuatDSBD(){
        System.out.println("DANH SACH CAC BANG DIEM");
        for (BANGDIEM lst:dsBD){
            lst.xuatDS();
            System.out.println("\n=============================================================================");

        }
    }

    public void inBDMaLop(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP TEN MA LOP CAN XUAT BANG DIEM: ");
        String name = sc.nextLine();
        System.out.println("BANG DIEM LOP "+name);
        for (BANGDIEM lst:dsBD){
            if (lst.getMaLop().equalsIgnoreCase(name) == true){
                lst.xuatDS();
            }
        }
    }

    public void tenSVHocLaiLop(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP MA LOP CAN IN:");
        String name = sc.nextLine();
        for (BANGDIEM lst:dsBD){
            if (lst.getMaLop().equalsIgnoreCase(name) == true){
                lst.tenSVHocLai();
            }
        }
    }

    public void tenSVHocLai(){
        for (BANGDIEM lst:dsBD){
            lst.tenSVHocLai();
        }
    }
    public void lopSVHocLaiMax(){
        int max = 0;
        String lopMax = "";
        for (BANGDIEM lst:dsBD){
            if (lst.demSVHocLai() > max){
                max  = lst.demSVHocLai();
            }
        }
        for (BANGDIEM lst:dsBD){
            if (lst.demSVHocLai()==max){
                System.out.println("\n"+ lst.getMaLop());
            }
        }
    }
    public void doiTenGV(){
        System.out.println("NHAP MA LOP:");
        Scanner sc = new Scanner(System.in);
        String maLop  = sc.nextLine();
        for (BANGDIEM lst:dsBD){
            if (lst.getMaLop().equalsIgnoreCase(maLop) == true){
                System.out.println("NHAP TEN GIA VIEN MOI:");
                lst.setGV(sc.nextLine());
            }
        }
    }

    public void ghiFileDSDiem(){
        File f  = new File("DSDIEM.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(lstDiem);
        objout.close();
        fout.close();
    }

    public void docFileDSDiem(){
        lstDiem = new ArrayList<DIEM>();
        File f = new File("DSDIEM.date");
        FileOutputStream fin = new FileOutputStream(f);
        ObjectOutputStream objin = new ObjectOutputStream(fin);
        lstDiem = (ArrayList)objin.readObject();
        objin.close();
        fin.close();
    }
}
