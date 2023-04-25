import java.io.Serializable;
import java.util.Scanner;

public class KhachHang implements Serializable{
    private int maKH;
    private String tenKH;
    private String kieuKH;
    public KhachHang() {
    }
    public int getMaKH() {
        return maKH;
    }
    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    public String getTenKH() {
        return tenKH;
    }
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }
    public String getKieuKH() {
        return kieuKH;
    }
    public void setKieuKH(String kieuKH) {
        this.kieuKH = kieuKH;
    }

    public void nhapKH(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----NHAP THONG TIN KHACH HANG----");
        System.out.print("MA KHACH HANG: ");
        setMaKH(sc.nextInt());
        String c = sc.nextLine();
        System.out.print("TEN KHACH HANG:");
        setTenKH(sc.nextLine());
        int choice = 0;
        do {
            System.out.println("KIEU KHACH HANG: ");
            System.out.println("1 - CA NHAN");
            System.out.println("2 - TAP THE");;
            System.out.println("NHAP TU 1-2");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    kieuKH = IKieuKH.KIEU_KH[0];
                    break;
                case 2:
                    kieuKH = IKieuKH.KIEU_KH[1];
                    break;
                default:
                    break;
            }
        } while (choice <1 || choice >2);
        
    }

    public void xuatKH(){
        System.out.printf("%10d",getMaKH());
        System.out.printf("%10s",getTenKH());
        System.out.printf("%20s",getKieuKH());
    }
}
