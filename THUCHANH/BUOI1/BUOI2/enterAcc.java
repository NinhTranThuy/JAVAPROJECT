import java.util.Scanner;

public class enterAcc {
    taikhoan acc  = new taikhoan();
    Scanner sc = new Scanner(System.in);
    void enterInfo(){
        System.out.println("-----NHAP THONG TIN KHACH HANG-----");
        System.out.print("NHAP ID: ");
        acc.setId(sc.nextLine());
        System.out.print("NHAP TEN KHACH HANG: ");
        acc.setName(sc.nextLine());
        System.out.print("NHAP TUOI KH: ");
        acc.setAge(sc.nextInt());
        System.out.print("NHAP DIA CHI KH: ");
        acc.setAddress(sc.nextLine());
        System.out.print("NHAP GIOI TINH: ");
        acc.setGender(sc.nextBoolean());
    }
}
