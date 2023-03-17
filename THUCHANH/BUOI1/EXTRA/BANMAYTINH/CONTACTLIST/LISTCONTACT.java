import java.util.ArrayList;
import java.util.Scanner;

public class LISTCONTACT {
    void enterList(){
        Scanner sc = new Scanner(System.in);
        ArrayList<CONTACT> lst;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        lst = new ArrayList<CONTACT>();
        for (int i=0;i<n;i++){
            CONTACT ct = new CONTACT();
            ct.enterInfo();
            lst.add(ct);
        }
        
    }
    public void showList(){
        for (LISTCONTACT ct:lst){
            ct.toString();
        }
    }

    public void addContact(){
        CONTACT ct = new CONTACT();
        System.out.println("ADD A NEW CONTACT:");
        ct.enterInfo();
        lst.add(ct);

    }

    public void searchContact(){
        CONTACT ct = new CONTACT();
        Scanner sc = new Scanner(System.in);
        System.out.println("SEARCH FOR CONTACT:");
        System.out.print("ENTER NAME:");
        String name = sc.nextLine();

        for (LISTCONTACT c:lst){
            if (c.getName() == name){
                c.toString();
                break;
            }
        }
    }

    public void deleteContact(){
        CONTACT ct = new CONTACT();
        Scanner sc = new Scanner(System.in);
        System.out.println("DELETE CONTACT:");
        System.out.print("ENTER NAME:");
        String name = sc.nextLine();

        for (LISTCONTACT c:lst){
            if (c.getName() == name){
                c.toString();
                break;
            }
        }
    }



    


}
