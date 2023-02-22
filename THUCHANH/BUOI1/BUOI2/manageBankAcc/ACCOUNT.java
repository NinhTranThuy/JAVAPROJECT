public class ACCOUNT {
    private String accNum, PIN;
    private double accBalance;
    private CUSTOMER customer;

    public ACCOUNT(){
        accNum = "";
        PIN = "";
        accBalance = 0;
    }
    public ACCOUNT(String accNum, String PIN, double accBalance, CUSTOMER customer){
        this.accNum = accNum;
        this.PIN = PIN;
        this.accBalance = accBalance;
        this.customer = customer;
    }
    
    // GET/SET
    public void setNumber(String accNum){
        this.accNum =accNum;
    }
    public String getNumber(){
        return accNum;
    }

    public void setCustomer(CUSTOMER customer){
        this.customer = customer;
    }
    public CUSTOMER getCustomer(){
        return customer;
    }

    public void setBalance(double accBalance){
        this.accBalance = accBalance;
    }
    public double getBalance(){
        return accBalance;
    }

    public void setPIN(String PIN){
        this.PIN = PIN;
    }
    public String getPIN(){
        return PIN;
    }

    //FUNCTION
    public boolean sentMoney(double money){
        if (money >= 50000){
            this.accBalance += money;
            return true;
        } else {
            return false;
        }
    }
    public boolean withDraw(double money){
        if (accBalance - money >= 50){
            this.accBalance -= money;
        } else {
            return false;
        }
    }
    public boolean transferMoney(double money, ACCOUNT receiver){
        if (accBalance - money <50 ){
            return false;
        } else {
            receiver.setBalance(receiver.getBalance()+money);
            this.accBalance = this.accBalance - money;
            return true;
        }
    }
    public boolean changePIN(String pin){
        if (pin == "" ){
            return false;
        } else {
            this.PIN = pin;
            return true;
        }
    }
}
