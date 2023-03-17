import java.util.Scanner;

public class CONTACT {
    private String name, email;
    private int phone;
    public CONTACT(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }    

    public void enterInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("______________________________________");
        System.out.print("PHONE NUMBER: ");
        setPhone(sc.nextInt());
        System.out.print("NAME: ");
        setName(sc.nextLine());
        System.out.print("EMAIL: ");
        setEmail(sc.nextLine());
    }
    public String toString(){
        return (getPhone()+" "+getName() +" "+ getEmail());
    }

}
