import java.util.Scanner;
public class IT24102513Lab7Q1A {
public static void main(String[] args){
	
	double average=0;
	String grade;
Scanner input = new Scanner(System.in);

System.out.println("Enter marks for four subjects: ");

System.out.print("Enter Subject Mark 1: ");
int subject1 = input.nextInt();

System.out.print("Enter Subject Mark 2: ");
int subject2 = input.nextInt();

System.out.print("Enter Subject Mark 3: ");
int subject3 = input.nextInt();

System.out.print("Enter Subject Mark 4: ");
int subject4 = input.nextInt();
 
 if (average >= 75) {
	 grade = "distinction";
 } else if (average >= 50) {
	 grade = "Credit";
 } else {
	 grade = "Fail";
 }
 average= (subject1+subject2+subject3+subject4)/4.0;
 System.out.println("\nAverage is : " + average);
 System.out.println("Overall Grade is : " + grade);
 }
 }
 