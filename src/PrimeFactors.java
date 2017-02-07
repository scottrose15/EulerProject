

public class PrimeFactors {
	//Problem:
	//What is the largest prime factor of the number 600851475143?
	private long value;
	public int factor(){
		long num = 600851475143L;
		long i = 2;
		long j = 0;

		//loop checks if a number is a factor and if the factor is prime
		while(i<num){
			//finds if a number is a factor of num
			if(num % i ==0){
				//checks if the factor is prime
				int isPrime=0;
				j=2;
				while(j<i){
					if(i%j == 0){
						isPrime++;
					}
					j++;
				}
				if(isPrime == 0){
					num = num /i;
					value = num;
				}
			}
			i++;
		}	
	return (int) value;
	}
}
