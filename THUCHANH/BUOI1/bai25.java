import java.util.Scanner;

public class bai25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        xuli(n);
        
    }

    public static void xuli(int n){
        int s = 0;
        for (int i=0; i<n; i++){
            if (check(i)){
                s+=i;
            }
        }
        System.out.println("S = "+s);
    }
    public static boolean check(int a) {
        if (a<2){
            return false;
        } else {
            for (int i=2 ;i<= Math.sqrt(a); i++){
                if (a % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
