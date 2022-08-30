package finalexam;

public class Checking extends Account{
    private int overdraft=100;
    
    static int numOfObjects = 0;
    
    {
        numOfObjects+=1;
    }
        
    public Checking(String name,int ID,double balance,double interestRate){
        super(name,ID,balance,interestRate);
    }
        
    public double Deposit(double amount){
        balance=balance+amount;
        return balance;
    }

    public double Withdraw(double amount){
        if((balance-amount)<overdraft){
            System.out.println("Opperation failed.");
        }
        else{
            balance=balance-amount;
        }
        return balance;
    }
    
    public String toString(){
        String str = "Account Info: " + "Name - "+name+", ID - "+ID+", Balance - "+balance
        +", Interest Rate - "+interestRate+"%";
        return str;
    }
}
