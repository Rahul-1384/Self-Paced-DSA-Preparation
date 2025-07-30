class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return this.balance;
    }

    public void withdrawAmount(double amount){
        if(balance >= 0){
            balance -= amount;
        }
    }
}
public class Main{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(12000);
        System.out.println(obj.getBalance());
        obj.withdrawAmount(10000);
        System.out.println(obj.getBalance());

    }
}