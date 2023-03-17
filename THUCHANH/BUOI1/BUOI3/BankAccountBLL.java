import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BankAccountBLL {
    ArrayList<BankAccount> dstk;
    public BankAccountBLL(){

    }   
    public void nhapDSTK(){
        Scanner sc  = new Scanner(System.in);
        dstk = new ArrayList<BankAccount>();
        System.out.println("NHAP SO LUONG TAI KHOAN:");
        int n= sc.nextInt();


        for (int i=0; i<n; i++){
            BankAccount ba = new BankAccount();
            ba.nhap();
            dstk.add(ba);
        }
    }

    public void hienDSTK(){
        for (BankAccount ba: dstk){
            ba.hien();
        }
    }

    public boolean checkMaPin(String pin, String stk){
        for (BankAccount ba: dstk){
            if (ba.getSoPin().equals(pin)==true && ba.getSoTaiKhoan().equals(stk) ){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public BankAccount searchBankAccount(String tenTK, String pin){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP TEN TAI KHOAN CAN TIM:");
        String tentk = sc.nextLine();
        System.out.print("NHAP MA PIN CAN TIM");
        String mapin= sc.nextLine();
        for (BankAccount ba: dstk){
            if (ba.getTenTaiKhoan().equals(tentk)==true && ba.getSoPin().equals(mapin) ){
                return ba;
            } else {
                return null;
            } 
        }     
        return null;
    }
    public void sapXepTheoSoDu(){
        Collections.sort(dstk, new TKCompare_SoDu());
    }
}
