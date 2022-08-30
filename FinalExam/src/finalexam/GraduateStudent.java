package finalexam;

public class GraduateStudent extends Student {
    protected boolean grad;
    
    GraduateStudent(){
        super();
    }
    
    GraduateStudent(String name,String id,String pnumber,String email,int credits){
        super(name,id,pnumber,email,credits);
    }
    
}
