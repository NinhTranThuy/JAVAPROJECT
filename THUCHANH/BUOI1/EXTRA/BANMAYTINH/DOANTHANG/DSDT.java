import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class DSDT {
    ArrayList<DOANTHANG> lst;
    public void nhapDS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        lst = new ArrayList<DOANTHANG>();
        for (int i=0; i<n;i++){
            DOANTHANG dt = new DOANTHANG();
            dt.nhapDT();
            lst.add(dt);
        }
    }

    public void tieude(){
        System.out.printf("%5s","X");
        System.out.printf("%5s","Y");
        System.out.printf("%10s","LENGTH");
        System.out.println(" ");
    } 

    public void inDS(){
        System.out.println("DANH SACH DOAN THANG VUA NHAP");
        tieude();
        for (DOANTHANG d:lst){
            d.xuatDT();
            System.out.println(" ");
        }
    }

    public float sum(){
        float s=0;
        for (DOANTHANG d:lst){
            s+=d.calculateLength();
        }
        return s;
    }

    public float max(){
        float max = 0;
        for (DOANTHANG d:lst){
            if (max < d.calculateLength()){
                max = d.calculateLength();
            }
        }
        return max;
    }
}


