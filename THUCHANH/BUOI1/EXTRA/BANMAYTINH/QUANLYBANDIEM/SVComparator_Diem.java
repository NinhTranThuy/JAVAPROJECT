public class SVComparator_Diem implements Comparator<SINHVIEN> {
        public int compare(SINHVIEN o1, SINHVIEN o2){
            if (o1.tinhDIemHP () == o2.tinhDIemHP()){
                return 0;
            }
            if (o1.tinhDIemHP() < o2.tinhDIemHP()){
                return 1 ;
            }

            return -1;
        }
}
