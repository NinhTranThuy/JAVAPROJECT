import java.util.Comparator;

public class Comparator_DiemUT implements Comparator<PhieuDkiNV> {
    @Override
	public int compare(PhieuDkiNV o1, PhieuDkiNV o2) {
		if(o1.ts.getDiemUuTien()==o2.ts.getDiemUuTien()) {
			return 0;
		}else if(o1.ts.getDiemUuTien()<o2.ts.getDiemUuTien()) {
			return 1;
		}else {
			return -1;
		}
	}    
}
