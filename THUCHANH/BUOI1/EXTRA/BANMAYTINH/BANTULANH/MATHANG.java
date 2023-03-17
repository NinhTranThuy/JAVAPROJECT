public class MATHANG {
    private String tenHang, nuocSX;
    private int maHang;

    public MATHANG(){

    }

    public String getTenHang() {
		return tenHang;
	}
	public void settenHang (String tenHang) {
		this.tenHang = tenHang;
	}

    public String getnuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String fullName) {
		this.nuocSX = nuocSX;
	}
    public int getMaHang() {
		return fullName;
	}
	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("NHAP TEN MAT HANG: ");
        settenHang(sc.nextLine);
        System.out.print("NHAP MA HANG: ");
        maHang = sc.nextLine();
        System.out.print("NHAP NUOC SAN XUAT: ");
        nuocSX = sc.nextLine();
    }
    public void hienThi(){
        System.out.printf("%10s", getTenHang());
        System.out.printf("%10s", getnuocSX());
        System.out.printf("%10s", getMaHang());
    }

}
