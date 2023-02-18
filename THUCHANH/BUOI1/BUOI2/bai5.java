import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("Nhap so CONG NHAN: ");
            n = sc.nextInt();
        } while (n < 0  ||  n  > 20);

        CONGNHAN.lcd = 11500;
        CONGNHAN[] cn = new CONGNHAN [n];
        for (int i=0; i<n; i++){
            cn[i] = new CONGNHAN ();
            System.out.print("NHAP HO VA TEN:");
            String c=sc.nextLine();
            String ten = sc.nextLine();
            cn[i].setHoten(ten);
            System.out.print("Nhap HSl:");
            float hsLuong = sc.nextFloat();
            cn[i].setHsl(hsLuong); 
        }

        for (int i=0;i<n;i++){
            System.out.println("HO TEN CN:" + cn[i].getHoten());
            System.out.println("HSL: "+cn[i].getHsl() );
            System.out.println("LUONG: "+ cn[i].tinhLuong());
        }
    }
}
