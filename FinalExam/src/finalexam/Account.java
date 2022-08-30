package finalexam;

public class Account {
    protected String name;
    protected int ID;
    protected double balance;
    protected double interestRate;
    protected double amount;
    
    public Account(){
        
    }
    
    public Account(String name,int ID,double balance,double interestRate){
        this.name=name;
        this.ID=ID;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setID(int ID){
        this.ID=ID;
    }
    
    public int getID(){
        return ID;
    }
    
    public void setName(double balance){
        this.balance=balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
}
