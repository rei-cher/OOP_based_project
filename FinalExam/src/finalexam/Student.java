package finalexam;

public class Student extends Person{
    protected char status;
    protected int credits;
    
    Student(){
        status='N';
    }
        
    Student(String name,String id,String pnumber,String email,int credits){
        super(name,id,pnumber,email);
        this.credits=credits;
        status='N';
    }
         
    public void setResidency(char status){
        this.status=status;
    }
        
    public void setCredits(int credits){
        this.credits=credits;
    }
         
    public char getResidency(){
        return status;
    }
         
    public int getCredits(){
        return credits;
    }
         
    public double CalculateTuition(Student s){
        double tuition=0;
        
        if(this.credits<12){
            if (s.status=='R'){
                tuition=credits*470;
            }else{
            tuition=credits*855;
            }
        }
        else{
            if (s.status=='R'){
                tuition=5545;
            }else{
            tuition=credits*855;
            }
        }
        
        return tuition;
    }
    
    public String toString(){
        return name+"\n"+id+"\n"+pnumber+"\n"+email+"\n"+credits+"\n"+status+"\n";
    }
}
