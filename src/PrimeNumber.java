
public class PrimeNumber {
	//What is the 10,001st prime number
	private int value;
	public int Prime(){
		int primeCounter=0;
		int num=2;
		//loop repeats until 10001 prime numbers are found
		while(primeCounter < 10001){
			int isPrime=0;
			//if the number is not prime, the loop adds the a counter
			//the loop tests all numbers below the number being tested to see if it is a factor
			for(int i = 2; i < num; i++){
				if(num % i == 0){
					isPrime++;
				}
			}
			//if there are no factors, the number is prime and added to the total
			if(isPrime ==0){
				primeCounter++;
				value = num;
			}
			num++;
		}
		
		
		return value;
	}
}
