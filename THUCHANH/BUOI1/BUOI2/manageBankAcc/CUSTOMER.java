public class CUSTOMER {
    private String id, fullName,address;
    private int age;
    private boolean gender;

    public CUSTOMER(){
        id = "UNIDENTIFIED";
        fullName = "NONAME";
        address = "UNIDENTIFIED";
        age = 0;
        gender = false;
    }
    public CUSTOMER(String id, String fullName, String address, int age, boolean gender){
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public String getID(){
        return id;
    }

    public void setName(String fullName){
        this.fullName = fullName;
    }
    public String getName(){
        return fullName;
    }

    public void setAge(int age){
        if (age < 18 ){
            this.age = 18;
        } else {
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }

    public void setAddres(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }
    public boolean getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
