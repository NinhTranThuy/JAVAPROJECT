import java.util.*;
public class taikhoan {
    private String accNum;
    private khachhang customer;
    private double soDu;
    private String PIN;

    public taikhoan(){
        accNum = null;
        //khachhang = null;
        soDu = 0;
        PIN = null;
    }
    public taikhoan(String n, khachhang cus, double du, String p ){
        accNum = n;
        customer = cus;
        soDu = du;
        PIN = p;
    }

    public void setAccNum(String num){
        // if (accNum == null || accNum == "" )
        accNum = num;
    }
    public String getAccNum(){
        return accNum;
    }

    public void setCustomer(khachhang c){
        customer = c;
    }
    public khachhang getCustomer(){
        return customer;
    }

    public void setSoDu(double du){
        soDu = du;
    }
    public double getSoDu(){
        return soDu;
    }

    public void setPIN(String p){
        PIN = p;
    }
    public String getPIN(){
        return PIN;
    }

    public boolean guiTien(double tien){
        if (tien >=50){
            soDu += tien;
            return true;
        } else {
            return false;
        }

        System.out.println("DA GUI TIEN THANH CONG!");
    }

    /**
     * 
     * @param So tien toi thieu >-=50, so du toi thieu >50
     * @return true - rut thanh cong, false rut that bai
     */
    public boolean rutTien(double tien){
        if (soDu - tien < 50){
            System.out.println("Tai khoan KHONG DU tien!");
            return false;
        } else {
            soDu -= tien;
            System.out.println("RUT TIEN THANH CONG!");
            return true;
        }
    }

    public double checkDu(){
        System.out.println("SO DU HIEN TAI: "+ getSoDu());
    }

    /**
     * CHUYEN TIEN TU A SANG B
     * @param acc
     * @param receiver
     * @param tien
     * @return thong bao chuyen tien
     */
    public boolean backing(String receiver, double tien){
        if (receiver == "null" || tien < 50){
            return false;
        } else {
            receiver.setSoDu(receiver.getSoDu()+ tien);
            soDu -= tien;
        }
    }

    public boolean changePIN(String newPIN){
        if (PIN == null || PIN == ""){
            return false;
        } else {
            PIN = newPIN;
            return true;
        }
    }

    public String toString (){
        return "ACCOUNT NUM: "+ accNum + ", CUSTOMMER: "+ customer.toString() +" ,"
        + "SO DU: "+soDu ; 
    }

}
