import java.io.FileNotFoundException;
import java.util.Scanner;
//add question index
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("What Project Euler problem would you like to answer?"
				+ "\nOnly problems 1-9 are available\nEnter 'x' to exit");
		
		Scanner input = new Scanner(System.in);
		String questionNum="0";
		
		//prompts user for question number
		while(questionNum.charAt(0) !='x'){
			questionNum = input.next();
		
			long answer;
		
			//creates object that returns the answer
			switch(questionNum){
				case "1":
					System.out.println("Problem: Find the sum of all the multiples of 3 or 5 below 1000.");
					ThreeAndFive a1 = new ThreeAndFive();
					answer = a1.MultiSum();
					System.out.println(answer);
				break;
				
				case "2": 
					System.out.println("Problem: By considering the terms in the Fibonacci sequence "
				+ "\nwhose values do not exceed four million, find the sum of the even-valued terms.");
					FibonacciNumbers a2 = new FibonacciNumbers();
					answer = a2.fibSum();
					System.out.println(answer);
				break;
				
				case "3":
					System.out.println("What is the largest prime factor of the number 600851475143 ?");
					PrimeFactors a3 = new PrimeFactors();
					answer = (int) a3.factor();
					System.out.println(answer);
				break;
				
				case "4":
					System.out.println("Problem:Find the largest palindrome made from the product of two 3-digit numbers.");
					Palindrome a4 = new Palindrome();
					answer = a4.LargestPalindrome();
					System.out.println(answer);
				break;
				
				case "5":
					System.out.println("Problem: What is the smallest positive number that is evenly divisible"
							+ " by all of the numbers from 1 to 20?");
					System.out.println("(Calculation may take a while)");
					SmallestMultiple a5 = new SmallestMultiple();
					answer = a5.findSmallest();
					System.out.println(answer);
				break;
				
				case "6":
					System.out.println("Problem: Find the difference between the sum of the squares of the first one "
							+ "hundred natural numbers\nand the square of the sum.");
					SumSquareDifference a6 = new SumSquareDifference();
					answer = a6.SumSquare();
					System.out.println(answer);
				break;
				
				case "7":
					System.out.println("What is the 10,001st prime number");
					System.out.println("(Calculation may take a while)");
					PrimeNumber a7 = new PrimeNumber();
					answer = a7.Prime();
					System.out.println(answer);
				break;
				
				case "8":
					System.out.println();
					ThousandDigit a8 = new ThousandDigit();
					a8.Digit();
				break;
				
				case "9":
					System.out.println("There exists exactly one Pythagorean triplet for which a + b + c = 1000. "
							+ "Find the product abc.");
					SpecialTriplet a9 = new SpecialTriplet();
					answer = a9.SpecialPyth();
					System.out.println(answer);
				break;
				
				case "10":
					System.out.println("Problem: Find the sum of all the primes below two million.");
					SummationOfPrime a10 = new SummationOfPrime();
					answer = a10.Summation();
					System.out.println(answer);
				break;
				
				case "x":
					System.out.println("Goodbye");
				break;
				
				default:
					System.out.println("Invalid Input");
				break;
			}
		}
		input.close();
	}

}
