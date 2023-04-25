
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class DatTour implements Serializable {
    KhachHang kh;
    Tour tour;

    private String ngayDat;
    private int slTour;
    public DatTour() {
        kh = new KhachHang();
        tour = new Tour();
    }
    public String getNgayDat() {
        return ngayDat;
    }
    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }
    public int getSlTour() {
        return slTour;
    }
    public void setSlTour(int slTour) {
        this.slTour = slTour;
    }

    
    // public boolean checkDate(String date){
    //     for (DatTour dt:dsDatTour){
    //         if (date.equalsIgnoreCase(dt.getNgayDat())){
    //             System.out.println("BI TRUNG NGAY DAT!");
    //             System.out.println("NHAP LAI!!");
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public void nhapDatTour() 
        throws IOException, ClassNotFoundException{
        Scanner sc = new Scanner(System.in);
        KhachHang kh;
        Tour t;
        DSKhachHang dsKH = new DSKhachHang();
        DSTour dsTour = new DSTour();

        while (true){
            System.out.print("Nhap MA KHACH HANG: ");
            kh = dsKH.timKhachHang(sc.nextInt());
            if (kh != null){
                break;
            }
        }

        while (true){
            System.out.print("Nhap MA TOUR:");
            t = dsTour.timMaTour(sc.nextInt());
            String c = sc.nextLine();
            if (t != null){
                break;
            }
        }

        System.out.println("-----NHAP THONG TIN DAT TOUR----");
        System.out.print("NHAP NGAY DAT TOUR dd/mm/yyyy: ");
        setNgayDat(sc.nextLine());
            
        if (kh.getKieuKH().equals("Ca nhan")){
            slTour = 1;
        }  else {
            System.out.print("NHAP SO LUONG TOUR: ");
            setSlTour(sc.nextInt());
            String cc = sc.nextLine();
        }
    }
    public void xuatDatTour(){
        System.out.printf("%10s",getNgayDat());
        System.out.printf("%10d",getSlTour());
    }

}
