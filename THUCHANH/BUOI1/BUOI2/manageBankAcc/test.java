import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ACCOUNT tk1 = new ACCOUNT();
        ACCOUNT tk2 = new ACCOUNT();
        test t = new test();

        tk1 = t.enterInfo();
        tk2 = t.enterInfo();
        System.out.println("INFOR OF tk1:" + tk1.toString());
        System.out.println("INFOR OF tk2:" + tk2.toString());
        boolean check = true;

        do{
            int choice;
            System.out.println("--------CHOICES LIST-----------");
            System.out.println("1: SENT MONEY");
            System.out.println("2: WITHDRAW MONEY");
            System.out.println("3: TRANSFER MONEY");
            System.out.println("4: CHANGE PIN CODE:");
            System.out.println("5: EXIT");
            System.out.print("ENTER CHOICE: ");
            choice = sc.nextInt();
            System.out.println("-------------------------------");

            switch (choice) {
                case 1:
                    System.out.print("ENTER THE MONEY: ");
                    if (tk1.sentMoney(sc.nextDouble())){
                        System.out.println("SUCCESSFUL!");
                    } else {
                        System.out.println("UNSUCCESSFUL");
                    }
                    break;

                case 2:
                    System.out.println("ENTER THE MONEY:");
                    if (tk1.withDraw(sc.nextDouble())){
                        System.out.println("SUCCESSFUL!");
                    } else {
                        System.out.println("UNSUCCESSFUL!");
                        System.out.println("YOUR BALANCE IS NOT ENOUGH!");
                    }
                    break;
                case 3:
                    System.out.print("ENTER THE MONEY");
                    double m = sc.nextDouble();
                    if (tk1.transferMoney(m,tk2)){
                        System.out.println("TRANSFER SUCCESSFUL!");
                    } else {
                        System.out.println("UNSUCCESSFUL!");
                        System.out.println("YOUR BALANCE IS NOT ENOUGH!");
                    }
                    break;
                case 4:
                    System.out.print ("ENTER NEW PIN");
                    String p = sc.nextLine();
                    if (tk1.changePIN(p)){
                        System.out.println("CHANGE PIN SUCCESSFULLY!");
                    } else {
                        System.out.println("CHANGE UNSUCCESSFULLY");
                    }

                case 5:
                    check = false;
            }
        } while (check);
    }
    /**
     * @return
     */
    public ACCOUNT enterInfo(){
        ACCOUNT acc = new ACCOUNT();
        System.out.print("ENTER ACCOUNT NUMBER: ");
        acc.setNumber(sc.nextLine());
        System.out.print("ENTER PIN CODE: ");
        acc.setPIN(sc.nextLine());
        System.out.println("----ENTER THE CUSTOMER'S INFORMATION----");
        CUSTOMER c = new CUSTOMER();   
        System.out.print("ENTER ID: ");
        c.setId(sc.nextLine());
        System.out.print("ENTER NAME: ");
        c.setName(sc.nextLine());
        System.out.print("ENTER AGE: ");
        c.setAge(sc.nextInt());
        System.out.print("ENTER ADDRESS: ");
        c.setAddres(sc.nextLine());
        System.out.print("ENTER GENDER: ");
        c.setGender(sc.nextBoolean());
        System.out.print("ENTER BALANCE: ");
        acc.setBalance(sc.nextDouble());
    }    
}
