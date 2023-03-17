import java.util.*;
public class listCustomer {
    ArrayList<customer> lst;
    void enterList(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        lst = new ArrayList<customer>();
        for (int i=0; i<n;i++){
           customer c = new customer();
           c.enterInfo();
           lst.add(c);
        }
        sc.close();
    }

    public void title(){
        System.out.printf("%15s","Fullname");
        System.out.printf("%10s","ID");
        System.out.printf("%10s","Address");
        System.out.printf("%10s","Phone");
        System.out.printf("%10s","Purchase's num");
        System.out.printf("%10s","TOTAL");
        System.out.printf("%10s","TAX");
        System.out.printf("%10s","SALE RATE");
        System.out.println("____________________________________________________________________");
    }
    public void showList(){
        System.out.println("------------LIST OF CUSTOMERS-----------");
        title();
        for (customer c:lst){
            c.display();
        }
    }
}
