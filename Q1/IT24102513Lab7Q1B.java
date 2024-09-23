import java.util.Scanner;
public class IT24102513Lab7Q1B {
public static void main(String[] args){
	
	double average=0;
	String grade;
Scanner input = new Scanner(System.in);
int subject1,subject2,subject3,subject4;

for(int student = 1; student<= 3; student++){  
                                   
System.out.println("Student " + student);
    
System.out.print("Enter marks: ");
	
subject1= input.nextInt();
subject2= input.nextInt();
subject3= input.nextInt();
subject4= input.nextInt();

 average= (subject1+subject2+subject3+subject4)/4.0;

 if (average >= 75) {
	 grade = "distinction";
 } else if (average >= 50) {
	 grade = "Credit";
 } else {
	 grade = "Fail";
 }   

 
 System.out.println("Average is : " + average);
 System.out.println("Overall Grade is : " + grade);
 }
 }
}
 