import java.util.Scanner;

public class PhieuDkiNV implements Serializable{
    private String maPhieu;
    ThiSinh ts;
    CanBoTuyenSinh cb;
    DSNguyenVong dsnv;
    
    public PhieuDkiNV() {
        ts = new ThiSinh();
        cb = new CanBoTuyenSinh();
        dsnv = new DSNguyenVong();
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
        System.out.printf("\n%-15s", "HO TEN");
		System.out.printf("%-15s","QUE QUAN");
		System.out.printf("%-13s","GIOI TINH");
		System.out.printf("%-13s","NAM SINH");
		System.out.printf("%-15s","CCCD");
		System.out.printf("%-10s","SDT");
		System.out.printf("%-10s","SBD");
		System.out.printf("%-10s","KHU VUC");
		System.out.printf("%-10s","DIEM UT");
		System.out.printf("%-15s","TEN TRUONG C3");
    }

    public void tieudeCB(){
        System.out.printf("\n%-15s", "HO TEN");
		System.out.printf("%-10","QUE QUAN");
		System.out.printf("%-10s","GIOI TINH");
		System.out.printf("%-10s","NAM SINH");
		System.out.printf("%-15s","CCCD");
		System.out.printf("%-12s","SDT");
		System.out.printf("%-10s","MA CB");
		System.out.printf("%-10s","DON VI CT");
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
        System.out.print("\n______________________________THONG TIN THI SINH______________________________");
		tieudeTS();
		ts.xuat();
		
        // Xuat ds NGUYEN VONG
        System.out.println("\n______________________________THONG TIN NGUYEN VONG CUA THI SINH:______________________________");
        System.out.println("\n");
        tieudeNV();
		dsnv.xuatDS();
		
        // xuat thong tin CAN BO TUYEN SINH
        System.out.print("\n______________________________THONG TIN CAN BO TUYEN SINH______________________________");
		tieudeCB();
		cb.xuat();
		System.out.println("\n\t\t\t\t_________________________________\t\t\t");
	}

}
