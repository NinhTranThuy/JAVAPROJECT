
import java.io.Serializable;
import java.util.Scanner;

public class CanBoTuyenSinh extends Nguoi implements Serializable {
    private String maCB;
	private String donviCT;
    public CanBoTuyenSinh() {
    }
    public String getMaCB() {
        return maCB;
    }
    public void setMaCB(String maCB) {
        this.maCB = maCB;
    }
    public String getDonviCT() {
        return donviCT;
    }
    public void setDonviCT(String donviCT) {
        this.donviCT = donviCT;
    }

    public void nhap(){
    	super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma Can Bo: ");
        setMaCB(sc.nextLine());
        System.out.println("Don vi Cong Tac: ");
        setDonviCT(sc.nextLine());
        sc.close();
    }

    public void xuat(){
    	super.xuat();
        System.out.printf("%15s",getMaCB());
        System.out.printf("%10s",getDonviCT());
    }
}

