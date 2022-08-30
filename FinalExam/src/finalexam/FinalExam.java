package finalexam;

import java.util.Scanner;

public class FinalExam {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name: ");
        String name=input.next();
        
        System.out.print("Enter the id: ");
        String id=input.next();
        
        System.out.print("Enter the phone number: ");
        String pnumber=input.next();
        
        System.out.print("Enter the email: ");
        String email=input.next();
        
        System.out.print("Are you undergraduate(Yes/No): ");
        String str=input.next();
        
        System.out.print("Number of credits: ");
        int credits=input.nextInt();
        
        
        if(str.equals("No")){
            GraduateStudent gradStudent = new GraduateStudent(name,id,pnumber,
            email,credits);
            
            System.out.print("Are you a resident?(Yes/No) ");
            String res = input.next();
            if(res.equals("Yes")){
                gradStudent.setResidency('R');
                System.out.println("\nTuition due is: $"+gradStudent.CalculateTuition(gradStudent));
            }else{
                System.out.println("\nTuition due is: $"+gradStudent.CalculateTuition(gradStudent));
            }
        }
        else{
            Student student = new Student(name,id,pnumber,
            email,credits);
            
            System.out.print("Are you a resident?(Yes/No) ");
            String res = input.next();
            if(res.equals("Yes")){
                student.setResidency('R');
                System.out.println("\nTuition due is: $"+student.CalculateTuition(student));
            }else{
                System.out.println("\nTuition due is: $"+student.CalculateTuition(student));
            }
        }
        
        input.close();
    }
    
}
