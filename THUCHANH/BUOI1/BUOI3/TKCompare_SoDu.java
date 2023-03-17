import java.util.Comparator;

public class TKCompare_SoDu implements Comparator <BankAccount>{
    public int compare(BankAccount b1, BankAccount b2){
        if (b1.getSoTien() == b2.getSoTien()){
            return 0;
        }
        if (b1.getSoTien() < b2.getSoTien()){
            return 1 ;
        }
        return -1;
    }
}
