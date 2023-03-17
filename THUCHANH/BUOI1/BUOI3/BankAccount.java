import java.util.Scanner;

public class BankAccount {
    private String soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;
    private String soPin;


    public BankAccount(String soTaiKhoan, String tenTaiKhoan, double soTien, String soPin) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
        this.soPin = soPin;
    }
    public BankAccount(){
        soTaiKhoan = "NULL";
        tenTaiKhoan = "NULL";
        soTien = 0;
        soPin = "NULL";

    }
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }
    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }
    public double getSoTien() {
        return soTien;
    }
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    public String getSoPin() {
        return soPin;
    }
    public void setSoPin(String soPin) {
        this.soPin = soPin;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________");
        System.out.print("SO TAI KHOAN: ");
        setSoTaiKhoan(sc.nextLine());
        System.out.print("TEN TAI KHOAN: ");
        setTenTaiKhoan(sc.nextLine());
        System.out.print("SO TIEN: ");
        setSoTien(sc.nextDouble());
        System.out.print("SO PIN: ");
        setSoPin(sc.nextLine());
    }
    public void hien(){
        System.out.printf("%20s", getSoTaiKhoan());
        System.out.printf("%15s", getTenTaiKhoan());
        System.out.printf("%10.1f", getSoTien());
        System.out.printf("%10s", getSoPin());
        System.out.println("");
    }
    public boolean guiTien(double tien){
        if (soTien >= 50 && tien >= 50 ){
            this.soTien += tien;
            return true;
        } else {
            return false;
        }

    }
    public boolean rutTien(double tien){
        if (soTien - tien  >= 50 && tien >= 50){
            this.soTien -= tien;
            return true;
        } else {
            return false;
        }

    }
    public boolean chuyenKhoan(BankAccount tkNhan,double tien){
        if (soTien - tien <= 50){
            return false;
        } else {
            tkNhan.setSoTien(getSoTien()+tien);
            this.soTien -= tien;
            return true;
        }

    }
    public boolean doiMaPin( String maPinMoi){
        if (maPinMoi.equals("NULL") == true ||  maPinMoi.equals("") == true){
            return false;
        } else {
            this.soPin = maPinMoi;
            return true;
        }
    }

    public String toString(){
        return "["+soTaiKhoan+ ", "+tenTaiKhoan+", "+soTien+", "+soPin+ "]";
    }

}
