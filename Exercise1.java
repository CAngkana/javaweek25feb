package ex1;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		//Declare x1, x2 as integer
		int x1,x2;
		//Declare result for series of x1 and x2
		int result;
		//Enter an integer to x1 from keyboard using class Scanner
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt() ; // receive input
		//Enter an integer to x2
		x2 = sc.nextInt() ;
		
		//Create an instance of Calculator 
		Calculator calc= new Calculator();
		//classname objectref = new classname();
		
		//using instance of Calculator to invoke method "printSummationBetween(3,5)"
		calc.printSummationBetween(3, 5);
		//using instance of Calculator to invoke method "printSummationBetween(x1,x2)"
		calc.printSummationBetween(x1, x2);
		
		//invoke method "countOddNumbersBetween(1,3)"
		//print the number of odd numbers here
		calc.countOddNumbersBetween(1, 3);
		System.out.printf("" );
		//""=String format
		//invoke method countEvenNumbersBetween(5, 10)"
		//print the number of even numbers here
		System.out.printf("Series of " + x1 + "," + x2 + "=" );
		
		calc.countEvenNumbersBetween(5, 10);
		//Close Scanner After usage
		sc.close();
	}

}