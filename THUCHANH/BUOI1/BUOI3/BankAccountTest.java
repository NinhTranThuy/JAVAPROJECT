import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountBLL BankList = new BankAccountBLL();
        enterChoice();

    }

    public static void menu(){   
            System.out.println("______________MENU_______________");
            System.out.println("1: NHAP THONG TIN TAI KHOAN");
            System.out.println("2: HIEN THONG TIN TAI KHOAN");
            System.out.println("3: GUI TIEN TAI KHOAN");
            System.out.println("4: RUT TIEN TAI KHOAN");
            System.out.println("5: DOI MA PIN TAI KHOAN");
            System.out.println("6: CHUYEN KHOAN THEO STK");
            System.out.println("7: NHAP DSTK");
            System.out.println("8: HIEN DSTK");
            System.out.println("9: SAP XEP DSTK");
            System.out.println("10: EXIT");
            System.out.println("________________________________");
            System.out.print("ENTER YOUR CHOICE: ");
    }

    public static void enterChoice(){
        BankAccount b = new BankAccount();
        BankAccountBLL bl =  new BankAccountBLL();
        Scanner sc = new Scanner(System.in);
        do {
            int choice;
            menu();
            switch (choice) {
                case 1:
                    
                    b.nhap();
                    break;
            
                case 2:
                    b.hien();
                    break;
                case 3:
                    
                    System.out.print("NHAP SO TIEN GUI:");
                    double tien = sc.nextDouble();
                    if (b.guiTien(tien) == true){
                        System.out.println("GUI TIEN THANH CONG");
                    } else {
                        System.out.println("GUI TIEN KHONG THANH CONG");
                    }
                    break;
                case 4:
                    System.out.print("NHAP TEN TAI KHOAN CAN RUT:");
                    String ten = sc.nextLine();
                    System.out.print("NHAP MA PIN");
                    String Pin = sc.nextLine();
                    ba = dstk.searchBankAccount(ten,Pin);
                    if (ba != null) {
                        System.out.print("NHAP SO TIEN RUT:");
                        double tiengui = sc.nextDouble();
                        if (b.rutTien(tien) == true){
                        System.out.println("RUT TIEN THANH CONG");
                        } else {
                            System.out.println("RUT TIEN KHONG THANH CONG");
                        }
                    }
                    
                    break;
                    
                case 5:
                    System.out.print("NHAP MA PIN MOI:");
                    String  pin = sc.nextLine();
                    if (b.doiMaPin(pin) == true){
                        System.out.println("DOI MA PIN THANH CONG");
                    } else {
                        System.out.println("DOI MA PIN THAT BAI");
                    }
                    break;
                case 6:
                    System.out.print("NHAP SO TIEN CHUYEN KHOAN:");
                    double ck = sc.nextDouble();
                    if (b.chuyenKhoan(ck) == true){
                        System.out.println("CHUYEN KHOAN THANH CONG");
                    } else {
                        System.out.println("CHUYEN KHOAN THAT BAI");
                    }
                    break;
                case 7:
                    System.out.println("NHAP DANH SACH TAI KHOAN");
                    bl.nhapDSTK();
                    break;
                case 8:
                    System.out.println("HIEN DANH SACH TAI KHOAN");
                    bl.hienDSTK();
                    break;
                case 9:
                    System.out.println("SAP XEP DANH SACH TAI KHOAN");
                    bl.sapXepTheoSoDu();
                    break;

                case 10:
                    System.exit(choice);
                
            }
            
        } while (choice > 0 && choice <= 10); 
    }
}
