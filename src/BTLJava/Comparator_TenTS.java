import java.util.Comparator;

public class Comparator_TenTS implements Comparator<PhieuDkiNV> {
    @Override
	public int compare(PhieuDkiNV o1, PhieuDkiNV o2) {
		if(o1.ts.getHoTen()==o2.ts.getHoTen()) {
			return 0;
		}else if(o1.ts.getHoTen()==null) {
			return -1;
		}else if(o2.ts.getHoTen()==null) {
			return 1;
		}
		return o1.ts.getHoTen().compareTo(o2.ts.getHoTen());
	}
}
