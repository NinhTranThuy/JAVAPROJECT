import java.io.Serializable;
import java.util.Scanner;

public class Tour implements Serializable {
    private int maTour;
    private String kieuTour;
    private String thongtinTour;
    private double donGia;

    public Tour() {
    }
    public int getMaTour() {
        return maTour;
    }
    public void setMaTour(int maTour) {
        this.maTour = maTour;
    }
    public String getKieuTour() {
        return kieuTour;
    }
    public void setKieuTour(String kieuTour) {
        this.kieuTour = kieuTour;
    }
    public String getThongtinTour() {
        return thongtinTour;
    }
    public void setThongtinTour(String thongtinTour) {
        this.thongtinTour = thongtinTour;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    public void nhapTour(){
        Scanner sc = new Scanner(System.in);
        System.out.println("-----NHAP THONG TIN TOUR----");
        System.out.print("MA TOUR: ");
        setMaTour(sc.nextInt());
        int choice = 0;
        do {
            System.out.println("KIEU TOUR: ");
            System.out.println("1 - MOT NGAY");
            System.out.println("2 - DUOI 5 NGAY");
            System.out.println("3 - DUOI 7 NGAY");
            System.out.println("4 - DAI NGAY");
            System.out.println("NHAP TU 1-4");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    kieuTour = IKieuTour.KIEU_TOUR[0];
                    break;
                case 2:
                    kieuTour = IKieuTour.KIEU_TOUR[1];
                    break;
                case 3:
                    kieuTour = IKieuTour.KIEU_TOUR[2];
                    break;
                case 4:
                    kieuTour = IKieuTour.KIEU_TOUR[3];
                    break;
                default:
                    break;
            }
            
        } while (choice <1 || choice >4);
        String c = sc.nextLine();
        System.out.print("THONG TIN TOUR:");
        setThongtinTour(sc.nextLine());
        System.out.print("DON GIA:");
        setDonGia(sc.nextDouble());
    }

    public void xuatTour(){
        System.out.printf("%10d",getMaTour());
        System.out.printf("%10s",getKieuTour());
        System.out.printf("%20s",getThongtinTour());
        System.out.printf("%10f",getDonGia());
    }
}
