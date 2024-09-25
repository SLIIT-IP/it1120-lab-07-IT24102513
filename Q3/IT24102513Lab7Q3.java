import java.util.Scanner;

public class IT24102513Lab7Q3 {
public static void main(String[] args) {

//creating a new scanner class
Scanner input = new Scanner(System.in);

//Defining variables
int total,num=1,Customer;
double discount=0,amount=0;
char paymentMethod;

//Creating the for loop
for (Customer=1; Customer<=5;++Customer)
 
	{   
		System.out.println("Customer " + Customer);
		System.out.print("Enter toal bill amount: ");
		total=input.nextInt();
		System.out.print("Enter mode of payment (C for cash, O for other): ");

		paymentMethod=input.next().toUpperCase().charAt(0);
		
			if (paymentMethod=='C')
			{
			discount=total*5/100.0;
			amount=total-discount;
			System.out.println("Discount is : "+discount);
			System.out.println("Amount to be paid is: "+amount);
			System.out.println();
			}
			else if (paymentMethod=='O')
			{
			System.out.println("No discount applicable");
			discount=0;
			amount=total;
			System.out.println("Amount to be paid is: "+amount);
			System.out.println();
			amount=total;
			}
			else
			{
			System.out.println("Payment Mode is Not Valid");
			System.out.println();
			continue;
			}
 			}

	}
 
}
 