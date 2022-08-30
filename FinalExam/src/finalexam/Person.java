package finalexam;

public class Person {
    protected String name;
    protected String id;
    protected String pnumber;
    protected String email;
        
    Person(){
            
    }
        
    Person(String name,String id,String pnumber,String email){
        this.name=name;
        this.id=id;
        this.pnumber=pnumber;
        this.email=email;
    }
        
    public void setName(String name){
        this.name=name;
    }
        
    public void setID(String id){
        this.id=id;
    }
        
    public void setEMAIL(String email){
        this.email=email;
    }
        
    public void setPNumber(String pnumber){
        this.pnumber=pnumber;
    }
        
    public String getName(){
        return name;
    }
        
    public String getID(){
        return id;
    }
        
    public String getPNumber(){
        return pnumber;
    }
        
    public String getEMAIL(){
        return email;
    }
        
    public String toString(){
        return name+"\n"+id+"\n"+pnumber+"\n"+email+"\n";
    }
}
