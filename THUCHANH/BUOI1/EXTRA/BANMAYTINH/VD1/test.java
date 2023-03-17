import java.util.Scanner;
import java.util.*;

public class test {
    public static void main(String[] args) {
        HOCSINH dshs[];
        GIAOVIEN dsgv[];
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("NHAP SO LUONG:");
        n = sc.nextInt();

        dshs = new HOCSINH[n];
        dsgv = new GIAOVIEN[n];

        /**
         * CACH 1
         * (BO SUNG CACH ARRAYLIST)
         */
        for (int i=0; i<n; i++){
            dshs[i]  = new HOCSINH();
            dshs[i].nhapHS();
        }
        for (int i=0; i<n; i++){
            dsgv[i] = new GIAOVIEN();
            dsgv[i].nhapGV();
        }

        System.out.println("-------DSHS----------");
        for (int i=0; i<n; i++){
            dshs[i].xuatHS();
        }

        System.out.println("\n-------DSGV----------");
        for (int i=0; i<n;i++){
            dsgv[i].xuatGV();
        }
    }
}
