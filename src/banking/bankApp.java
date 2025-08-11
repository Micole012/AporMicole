package banking;

public class bankApp {
    
    private int accNo, pin;
    private float balance;

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public float getBalance() {
        return balance;
    }
    
    
    
    
    public boolean verifyAccount(int acc, int pn){
        return accNo == acc && pin == pn;
    }
    
    public void withdraw(){
    
    }
    
    public void deposit(){
    
    }
    
}