/*
Lab 4
Description: Fibonacci Series Sequencer
Name: Millinh Apilado
ID: 920649529
Class: CSC 211 - 03
Semester: Spring Semester
 */

//Imports new class Scanner
import java.util.Scanner;

//Main method
public class Fibonacci {
    public static void main(String[] args) {

        //Instantiates new Scanner object
        Scanner fibo = new Scanner(System.in);

        //Declares and assignes values to datatype integers sum, sum2, and sum 1
        int sum = 0, sum2 = 1, sum1 = 0;

        //Prints out message for user
        System.out.println("This is the Fibonacci series sequencer!");
        System.out.println("How many numbers would you want to appear for the series?:  ");
        //Scans and takes user input
        int n = fibo.nextInt();

        //Conditional statement to ensure user inputs number less than 20
        if (n > 20){
            System.out.println("Please input a number less than 20");
            n = fibo.nextInt();
        }

        //Conditional statement to ensure user does not input number less than 1
        //or displays 0 when input is equals to 1
        if(n < 1){
            System.out.print("Please put an input greater than 0");
        }
        else if(n == 1){
            System.out.println("Fibonacci Series: 0");
        }
        //else if the above conditions aren't met, then the program executes
        else{
            //Prints out fibonacci series title
            System.out.println("Fibonacci Series: ");

            //for loop to initialize values and increment to x which is < or = user input n
            for(int x = sum1; x < n; x++){

                //Prints out the sum and spaces in one horizontal line
                System.out.print(sum1 + "  ");

                //formula for fibonacci sequence adding sum1 and sum 2
                sum = sum1 + sum2;

                //reassigning sum1 to sum 2 and sum2 to sum
                sum1 = sum2;
                sum2 = sum;
            }
        }
    }
}



