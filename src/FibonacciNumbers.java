
public class FibonacciNumbers {
	/*Problem: By considering the terms in the Fibonacci sequence
	whose values do not exceed four million, find the 
	sum of the even-valued terms.
	*/
	private int value;
	public int fibSum(){
		int counter=0;
		int number = 1;
		int store=0;
		//tests all numbers up to 4,000,0000
		while(number < 4000000){
			//sums even numbers
			if(number % 2==0){
				value = value + number;
			}
			//updates numbers in sequence
			store = number;
			number = number + counter;
			counter = store;
			
		}
		return value;
	}
}
