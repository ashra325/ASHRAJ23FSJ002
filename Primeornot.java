package javaclosedlab;
import java.util.Scanner; 
public class Primeornot {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int number=sc.nextInt();
	boolean isprime=true;
	for(int i=2;i<=number/2;i++) {
		int a=number%i;
		if(a==0) {
		    isprime=false;
			break;
		}
		if(isprime) {
			System.out.println("the given number is a prime number");
		}
		else {
			System.out.println("the given number isn't a prime number");
		}
	}
	
}
}
