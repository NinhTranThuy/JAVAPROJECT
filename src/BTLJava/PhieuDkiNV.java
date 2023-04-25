
import java.util.ArrayList;
import java.util.Scanner;

public class PhieuDkiNV {
    private String maPhieu;
    ThiSinh ts = new ThiSinh();
    CanBoTuyenSinh cb = new CanBoTuyenSinh();
    
    public PhieuDkiNV() {
    }
    public String getMaPhieu() {
        return maPhieu;
    }
    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }
    public ThiSinh getTs() {
        return ts;
    }
    public void setTs(ThiSinh ts) {
        this.ts = ts;
    }
    public CanBoTuyenSinh getCb() {
        return cb;
    }
    public void setCb(CanBoTuyenSinh cb) {
        this.cb = cb;
    }
    DSNguyenVong dsnv = new DSNguyenVong();
    public void nhap(){
        Scanner sc= new Scanner(System.in);
		System.out.print("\nMA PHIEU: ");
		setMaPhieu(sc.nextLine());
		System.out.println("\t\t\t\tNHAP THONG TIN THI SINH\t\t\t");
		ts.nhap();
		
		System.out.println("\t\t\t\tNHAP THONG TIN NGUYEN VONG DANG KI\t\t\t");
		dsnv.nhapDS();
		
		System.out.println("\t\t\t\tNHAP THONG TIN CAN BO TUYEN SINH\t\t\t");
		cb.nhap();
    }

    public void tieudeTS(){
        System.out.print("\n\t\t\t\tTHONG TIN THI SINH\t\t\t");
		System.out.printf("\n%-20s", "HO TEN");
		System.out.printf("%-20s","QUE QUAN");
		System.out.printf("%-10s","GIOI TINH");
		System.out.printf("%-13s","NAM SINH");
		System.out.printf("%-15s","CCCD");
		System.out.printf("%-10s","SDT");
		System.out.printf("%-10s","SBD");
		System.out.printf("%-10s","KHU VUC");
		System.out.printf("%-12s","DIEM UT");
		System.out.printf("%-25s","TEN TRUONG C3");
    }

    public void tieudeCB(){
        System.out.print("\n\t\t\t\tTHONG TIN CAN BO TUYEN SINH\t\t\t");
		System.out.printf("\n%-20s", "HO TEN");
		System.out.printf("%-20s","QUE QUAN");
		System.out.printf("%-10s","GIOI TINH");
		System.out.printf("%-13s","NAM SINH");
		System.out.printf("%-15s","CCCD");
		System.out.printf("%-10s","SDT");
		System.out.printf("%-10s","MA CB");
		System.out.printf("%-13s","DON VI CT");
    }

    public void tieudeNV(){
        System.out.printf("\n%-10s","Khoi thi");
		System.out.printf("%-10s","Diem M1");
		System.out.printf("%-10s","Diem M2");
		System.out.printf("%-10s","Diem M3");
		System.out.printf("%-10s","Nganh");
		System.out.printf("%-15s","Truong thi");
    }
    public void xuat() {
		System.out.printf("\n%-8s","Ma phieu: ");
		System.out.printf("%-8s", maPhieu);

        // Xuat thong tin THI SINH
		System.out.println("\n\t\t\tTHONG TIN THI SINH:\t\t\t");
		tieudeTS();
		ts.xuat();
		
        // Xuat ds NGUYEN VONG
        System.out.println("\n\t\t\tTHONG TIN NGUYEN VONG CUA THI SINH:\t\t\t");
        tieudeNV();
		dsnv.xuatDS();
		
        // xuat thong tin CAN BO TUYEN SINH
        System.out.println("\n\t\t\tTHONG TIN CAN BO TUYEN SINH:\t\t\t");
		tieudeCB();
		cb.xuat();
		System.out.println("\n\t\t\t\t_________________________________\t\t\t");
	}
}
