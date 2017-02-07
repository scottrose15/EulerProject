
public class SummationOfPrime {
	private long value;
	public long Summation(){
		//loop tests all numbers below 2 million
		for(int j = 3;j < 2000000; j+=2){
			int isPrime=0;
			//loop tests only up to the square root of the number to see if the number is prime
			int cap = (int) (Math.sqrt(j))+1;//one is added to the square root because int math rounds down
			
			for(int i = 2; i <= cap; i++){
				if(j % i == 0){
					isPrime++;
				}
			}
			//if the number is prime, it is added to the total
			if(isPrime ==0){
				value = value+ j;
			}
		}
		//since 2 isn't tested through the loop, it is added at the end
		value +=2;
		return value;
	}
}
