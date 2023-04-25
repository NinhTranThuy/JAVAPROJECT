
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class test {
    public static void main(String[] args)
            throws IOException, FileNotFoundException, ClassNotFoundException {
        DSKhachHang lstKH = new DSKhachHang();
        DSDatTour lstDTour = new DSDatTour();
        DSTour lstTour = new DSTour();
        int chon ;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("\n-------------------------------------MENU----------------------------------------\n");
			System.out.print("1.NHAP DANH SACH KHACH HANG.\n");
			System.out.print("2.NHAP DANH SACH TOUR\n");
			System.out.print("3.NHAP DANH SACH DAT TOUR \n");
			System.out.print("_____________________________\n");
            System.out.print("4.HIEN DANH SACH KHACH HANG\n");
            System.out.print("5.HIEN DANH SACH TOUR\n");
            System.out.print("6.HIEN DANH SACH DAT TOUR\n");
			System.out.print("_____________________________\n");
			System.out.print("7.GHI/DOC/HIEN DS KHACH HANG\n");
			System.out.print("8.GHI/DOC/HIEN DS TOUR\n");
            System.out.print("9.GHI/DOC/DIEN DS DAT TOUR\n");
			System.out.print("_____________________________\n");
            System.out.print("10.SAP XEP DANH SACH DAT TOUR THEO KIEU TOUR\n");
            System.out.print("11.SAP XEP DANH SACH DAT TOUR THEO KIEU KHACH\n");
			System.out.print("0.EXIT\n");
			System.out.print("-------------------------------------------------------------------------------------\n");
			System.out.print("YOUR CHOICE: ");
			chon = sc.nextInt();
			switch( chon ) {
			case 1:{
				lstKH.nhapDSKH();
				lstKH.ghiFileKH();
				break;
			}
			case 2:{
				lstTour.nhapDSTour();
				lstTour.ghiFileT();
				break;
			}
            case 3:{
				lstDTour.nhapDSDatTour();
				lstDTour.ghiFileDT();
				break;
			}
            case 4:{
                System.out.println("---DANH SACH KHACH HANG---");
				lstKH.xuatDSKH();;
				break;
			}
            case 5:{
                System.out.println("---DANH SACH TOUR---");
				lstTour.xuatDSTour();
				break;
			}
            case 6:{
                System.out.println("---DANH SACH DAT TOUR---");
				lstDTour.xuatDSDatTour();
				break;
			}
            case 7:{
				lstKH.hienDSKH();
				break;
			}
            case 8:{
				lstTour.hienDSTour();
				break;
			}
            case 9:{
				lstDTour.hienDSDTour();
				break;
			}
            case 10:{
				lstDTour.sapxepTheoKieuTour();
				break;
			}
            case 11:{
				lstDTour.sapXepTheoKieuKH();
				break;
			}
			case 0:{
				System.out.print("\nEXIT!!!!\n");
				System.exit(0);
				break;
			}
			}
		}while( chon != 0 );
	}
}

