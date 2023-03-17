import java.util.Scanner;

public class SINHVIEN {
    private String maSV, hoTen, ns, lop;

    public SINHVIEN (){

    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setNs(String ns) {
        this.ns = ns;
    }
    public String getNs() {
        return ns;
    }
    public void setLop(String lop) {
        this.lop = lop;
    }
    public String getLop() {
        return lop;
    }

    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________");
        System.out.print("MA SV: ");
        setMaSV(sc.nextLine());
        System.out.print("HO VA TEN: ");
        setHoTen(sc.nextLine());
        System.out.print("NGAY SINH: ");
        setNs(sc.nextLine());
        System.out.print("LOP: ");
        setLop(sc.nextLine());
        sc.close();
    }
    public void xuatSV(){
        System.out.printf("%8s", getMaSV());
        System.out.printf("%15s", getHoTen());
        System.out.printf("%10s", getNs());
        System.out.printf("%5s", getLop());
    }
    public static SINHVIEN docFileSV(){
        SINHVIEN x  = new SINHVIEN();
        File f = new File("SINHVIEN.date");
        FileOutputStream fin = new FileOutputStream(f);
        ObjectOutputStream objin = new ObjectOutputStream(fin);
        x = (DIEM)objin.readObject();
        objin.close();
        fin.close();
        return x;
    }
}
