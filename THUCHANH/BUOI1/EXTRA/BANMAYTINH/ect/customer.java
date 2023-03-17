import java.util.Scanner;
public class customer {
    private String fullName, address, phoneNum, id;
	private double total;
	private int numOfPurchase;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public int getNumOfPurchase() {
        return numOfPurchase;
	}
	public void setNumOfPurchase(int numOfPurchase) {
        this.numOfPurchase = numOfPurchase;
	}
	
    Scanner sc = new Scanner(System.in);
	public String toString() {
		return "CUSTOMER [fullName=" + fullName + ", address=" + address + ", phoneNum=" + phoneNum + ", id=" + id
				+ ", total=" + total + ", numOfPurchase=" + numOfPurchase + "]";
	}
	
    public void enterInfo(){
        System.out.print("Enter Fullname: ");
        setFullName(sc.nextLine());
        System.out.print("Enter ID:");
        setId(sc.nextLine());
        System.out.print("Enter Address: ");
        setAddress(sc.nextLine());
        System.out.print("Enter Phone number:");
        setPhoneNum(sc.nextLine());
        System.out.print("Enter Number of Purchase:");
        setNumOfPurchase(sc.nextInt());
        System.out.print("Enter TOTAL:");
        setTotal(sc.nextDouble());
        System.out.println("____________________________________");
    }

   public void display(){
        System.out.printf("%15s",fullName);
        System.out.printf("%10s",id);
        System.out.printf("%10s",address);
        System.out.printf("%10s",phoneNum);
        System.out.printf("%10s",numOfPurchase);
        System.out.printf("%10s",total);
        System.out.printf("%10s",calculateTax());
        System.out.printf("%10s",calDiscountRate());
        System.out.println("");
   }

   public double calDiscountRate(){
        if (getNumOfPurchase()>=10){
            return 0.1;
        } else {
            if (getNumOfPurchase() > 5 && getNumOfPurchase() <10){
                return 0.05;
            } else {
                if (getNumOfPurchase() <= 5){
                    return 0.0;
                }
            }
        }
        return numOfPurchase;
   }

   public double calculateTax(){
        return getTotal() * 0.1;
   }
}
