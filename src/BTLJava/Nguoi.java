
import java.util.Scanner;

public class Nguoi {
    private String hoTen,queQuan,gioiTinh;
	private int namSinh;
	private String CCCD, SDT;

    
    public Nguoi() {
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    public String getCCCD() {
        return CCCD;
    }
    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }
    public String getSDT() {
        return SDT;
    }
    public void setSDT(String sDT) {
        SDT = sDT;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Que quan: ");
        setQueQuan(sc.nextLine());
        System.out.print("Gioi tinh(Nam/Nu): ");
        setGioiTinh(sc.nextLine());
        System.out.print("Nam sinh: ");
        setNamSinh(sc.nextInt());
        String c = sc.nextLine();
        // System.out.print("CCCD: ");
        // setCCCD(sc.nextLine());
        System.out.print("SDT: ");
        setSDT(sc.nextLine());
    }

    public void xuat(){
        System.out.printf("%15s",getHoTen());
        System.out.printf("%10s",getQueQuan());
        System.out.printf("%10s",getGioiTinh());
        System.out.printf("%10d",getNamSinh());
        System.out.printf("%15s",getCCCD());
        System.out.printf("%15s",getSDT());
    }
}
