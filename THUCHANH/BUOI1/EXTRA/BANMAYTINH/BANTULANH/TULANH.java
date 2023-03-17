public class TULANH extends MATHANG {
    private int dungTich, soLuong;
    private String mauSac, hangSX;
    private float donGia;

    public TULANH(String mausac, String hangSX, int dungTich, int soLuong, float donGia){
        super(tenHang,nuocSX, maHang);
        this.mausac = mausac;
        this.hangSX = hangSX;
        this.dungTich = dungTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	public String getHangSX() {
		return hangSX;
	}
	public void setHangSX(String hangSX) {
		this.hangSX = hangSX;
	}
	public float getDonGia() {
		return donGia;
	}
	public void setDonGia(float donGia) {
		this.donGia = donGia;
	}

    public void nhap(){
        System.out.printf("%");
    }
}