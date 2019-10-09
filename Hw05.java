//Andres Salcedo
//CSE 02
//HW 5

import java.util.Scanner;


public class Hw05{

    
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        Scanner t = new Scanner(System.in);
        Scanner u = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        Scanner x = new Scanner(System.in);
     
        System.out.println("What's the course number: ");
        
        while(!s.hasNextInt()){
            String word = s.next();
            System.out.println("Error - Input a an integer(What's the course number:)");  
            System.out.println("Input a course number:");
        }
        int courses = s.nextInt();
       
                 
        
        System.out.print("What's the department's name: ");
       
        while(x.hasNextInt() ==  true){
            String word = x.next();
            System.out.println("Error");  
            System.out.print("Input a department: ");
            }
        String departments = x.nextLine();
        
        

       System.out.print("How many times do you meet: ");
       
        while(!v.hasNextInt()){
            String word = v.nextLine();
            System.out.println("Error");  
            System.out.print("Input how many times you meet: ");
            }
        
        int meeting = v.nextInt();
        
    
        System.out.print("What time do you have this class(hr min formation):  ");
        
        while(!w.hasNextInt()){
            String word =w.next();
            System.out.println("Error");  
            System.out.print("Try again, what time does it start: ");
            }
       
         int times = w.nextInt();
       
        System.out.print("What's the teacher's name:  ");
       
        while(t.hasNextInt() ==  true){
            String word = t.next();
            System.out.println("Error");  
            System.out.print("What is the teacher name??: ");
            }
        String teachers = t.nextLine();
      
        System.out.print("How many students take this class?: ");
        
        while(!u.hasNextInt()){
            String word = u.next();
            System.out.println("Error");  
            System.out.print("Try again, how many students take this class?: ");
            }
        
        int students = u.nextInt();
        
            
        System.out.println("------------------------------------------------");
        System.out.println("Course info:\nCourse Number: " + courses + 
                    "\nDepartment: " + departments + "\nMeetings Per Week: " 
                    + meeting + "\nStart time: " + times + "\nProfessor: " 
                    + teachers + "\nNumber of students: " + students);
                
                
         
    }

}

