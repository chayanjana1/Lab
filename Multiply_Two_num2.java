import java.util.Scanner;
public class Multiply_Two_num2{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
// create scanner object

System.out.println("Enter the first number: ");

double num1=sc.nextDouble();
//this method reads value for num1 providing by user

System.out.println("Enter the second number: ");

double num2=sc.nextDouble();
//this method reads value for num2 providing by user

sc.close();//closing the scanner class

double product=num1*num2;//calculating product of two numbers


System.out.println("The product of given numbers: "+product);
//display the multiplication result
}

}