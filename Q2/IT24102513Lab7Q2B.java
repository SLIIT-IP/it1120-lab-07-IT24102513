import java.util.Scanner;

public class IT24102513Lab7Q2B {
public static void main(String[] args) {

//creating a new scanner class
Scanner input = new Scanner(System.in);

//Defining variables
int rowCounter,columnCounter;

//Creating the for loop
for (rowCounter=1; rowCounter<=5;rowCounter++) 
		{   
System.out.print(rowCounter+ " - ");
for (columnCounter=1;columnCounter<=rowCounter; columnCounter++)
 		{  
System.out.print("* ");
		} 
System.out.println();
		}

	}
 
}
 