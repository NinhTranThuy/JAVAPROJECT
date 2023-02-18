public class khachhang {
    private String customerID, customerName, address;
    private int customerAge;
    private boolean gender;

    public khachhang(){
        customerID = null;
        customerName = null;
        customerAge = 0;
        address= null;
        gender = false;
    }
    
    public khachhang(String id, String name, String a, int age, Boolean g){
        customerID = id;
        customerName = name;
        customerAge = age;
        address = a;
        gender= g;
    }
    
    public void setId(String id){
        if (customerID == null || customerID == ""){
            customerID = "none";
        } else {
            customerID = id;
        }
        // customerID = id;
    }

    public String getId(){
        return customerID;
    }

    public void setName(String name){
        customerName = name;
    }

    public String getName(){
        return customerName;
    }

    public void setAddress(String a){
        address = a;
    }
    
    public String getAddress(){
        return address;
    }
    // dieu kien 18
    public void setAge(int age){
        if (age < 18){
            customerAge = 18;
        } else {
            customerAge = age;
        }
    }

    public int getAge(){
        return customerAge;
    }

    // true = female ; false = male
    public void setGender(boolean g){
        gender = g;
    }
    public boolean getGender(){
        return gender;
    }

    public String toString(){
        String sex = "";
        if (gender == true ){
            sex = "female";
        } else {
            sex = "male";
        }
        return "ID: "+ customerID + ", "+ "NAME: "+customerName+ " ,"
        + "ADDRESS: " + address + " ," + "AGE: "+ customerAge + " ," +
        "GENDER: " + sex; 
    }

    
}
