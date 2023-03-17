import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class DIEM extends SINHVIEN {
    private float diemCC, diemGK, diemThi;

    public DIEM(){

    }
    public void setDiemCC(float diemCC) {
        this.diemCC = diemCC;
    }
    public float getDiemCC() {
        return diemCC;
    }
    public void setDiemGK(float diemGK) {
        this.diemGK = diemGK;
    }
    public float getDiemGK() {
        return diemGK;
    }
    public void setDiemThi(float diemThi) {
        this.diemThi = diemThi;
    }
    public float getDiemThi() {
        return diemThi;
    }

    public void nhapDiem(){
        super.nhapSV();
        Scanner sc = new Scanner(System.in);
        System.out.print("DIEM CK: ");
        setDiemCC(sc.nextFloat());
        System.out.print("DIEM GIUA KI: ");
        setDiemGK(sc.nextFloat());
        System.out.print("DIEM THI: ");
        setDiemThi(sc.nextFloat());
    }

    public void xuatDiem(){
        super.xuatSV();
        System.out.printf("%5.1f", getDiemCC());
        System.out.printf("%5.1f", getDiemGK());
        System.out.printf("%5.1f", getDiemThi());
    }

    public float tinhDIemHP(){
        return (getDiemCC()*0.1f + getDiemGK()*0.2f + getDiemThi()*0.7f );
    }

    public void ghiFileDiem(){
        File f  = new File("DIEM.dat");
        FileOutputStream fout = new FileOutputStream(f);
        ObjectOutputStream objout = new ObjectOutputStream(fout);
        objout.writeObject(x);
        objout.close();
        fout.close();
    }

    public static DIEM docFileDiem(){
        DIEM x  = new DIEM();
        File f = new File("DIEM.date");
        FileOutputStream fin = new FileOutputStream(f);
        ObjectOutputStream objin = new ObjectOutputStream(fin);
        x = (DIEM)objin.readObject();
        objin.close();
        fin.close();
        return x;
    }
}
