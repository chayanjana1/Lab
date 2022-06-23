import java.util.Scanner;
public class Multiply_Two_num{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
// create scanner object

System.out.println("Enter the first number: ");

int num1=sc.nextInt();
//this method reads value for num1 providing by user

System.out.println("Enter the second number: ");

int num2=sc.nextInt();
//this method reads value for num2 providing by user

sc.close();//closing the scanner class

int product=num1*num2;//calculating product of two numbers


System.out.println("The product of numbers: "+product);
//display the multiplication result
}

}
		