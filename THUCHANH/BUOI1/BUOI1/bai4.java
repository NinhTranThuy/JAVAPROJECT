import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Students[] s = new Students[n];
        for (int i=0; i<n ;i++){
            System.out.print("ENTER ID STUDENT: ");
            String c=sc.nextLine();
            String id = sc.nextLine();
            System.out.print("ENTER FULLNAME: ");
            String name = sc.nextLine();
            System.out.print("ENTER CLASS: ");
            String classes = sc.nextLine();
            System.out.print("ENTER MEAL: ");
            int meal = sc.nextInt();
            Students s = new Students(id,name,classes,meal);
        }


        sc.close();
    }
            
}
