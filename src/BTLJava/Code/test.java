
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
		DSPhieuDkiNV ds = new DSPhieuDkiNV();
		Scanner sc = new Scanner(System.in);
		int chon = 0;
		do {
			System.out.println("\n********************MENU**********************");
			System.out.println("1.NHAP DANH SACH PHIEU DANG KY NGUYEN VONG.");
			System.out.println("2.IN DANH SACH PHIEU DANG KY NGUYEN VONG.");
			System.out.println("3.IN THONG TIN PHIEU DANG KY THEO TEN THI SINH.");
			System.out.println("4.IN THONG TIN PHIEU DANG KY THEO MA PHIEU.");
			System.out.println("5.DEM SO LUONG PHIEU DANG KY.");
			System.out.println("6.XUAT DANH SACH PHIEU DA DUOC SAP XEP THEO CHIEU GIAM DAN CUA TEN THI SINH.");
			System.out.println("7.XUAT DANH SACH PHIEU DA DUOC SAP XEP THEO CHIEU TANG DAN CUA TEN THI SINH.");
			System.out.println("8.LUU DS PHIEU DANG KY VAO FILE ( DSPhieuDkiNV.dat).");
			System.out.println("9.DOC DS PHIEU DANG KY VAO FILE ( DSPhieuDkiNV.dat).");
			System.out.println("10.XOA PHIEU DANG KY THEO MA PHIEU.");
			System.out.println("11.XOA TAT CA CAC PHIEU DANG KY.");
			System.out.println("12.IN THONG TIN THI SINH CO NGUYEN VONG NHIEU NHAT.");
			System.out.println("13.IN THONG TIN THI SINH CO NGUYEN VONG IT NHAT.");
			System.out.println("14.THEM PHIEU DANG KI VAO DANH SACH.");
			System.out.println("15.SUA THONG TIN THI SINH TRONG PHIEU DANG KY.");
			System.out.println("0.THOAT CHUONG TRINH.");
			System.out.println("CHOICE:");
			chon = sc.nextInt();
			String c = sc.nextLine();

			switch (chon) {
			case 1:
				ds.nhapDS();
				break;
			case 2:
				ds.xuatDS();
				break;
			case 3:
				ds.inDsTheoTen();
				break;
			case 4:
				ds.inDsTheoMaPhieu();
				break;
			case 5:
				System.out.println("Dem so phieu dang ki nguyen vong la: "+ds.demSoPhieu());
				break;
			case 6:
				ds.sapXepGiamDiemUT();
				break;
			case 7:
				ds.sapXepTangTheoTen();
				break;
			case 8:
				ds.ghiFile();
				System.out.println("Ghi file thanh cong!!!");
				break;
			case 9:
				System.out.println("\nDanh sach cac phieu doc tu file da ghi la:");
				ds.hienDS();
				break;
			case 10:
				ds.xoaPhieuTheoMa();
				break;
			case 11:
				ds.xoaTatCaPhieu();
				break;
			case 12:
				ds.TScoNVongMax();
				break;
			case 13:
				ds.TScoNVongMin();
				break;
			case 14:
				ds.themPhieuVaoDS();
				break;
			case 15:
				ds.suaThongTin();
				break;
			case 0:
				System.exit(chon);
				break;
			default:
				System.out.println("Nhap lua chon khong hop le!!!");
				break;
			}
		} while (chon != 0);
	}
}
