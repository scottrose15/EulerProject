
public class Palindrome {
	//Problem:Find the largest palindrome made from the product of two 3-digit numbers.
	private int value;
	public int LargestPalindrome(){

		//for loops check all the products of 3 digit numbers
		for(int i =100; i<= 999; i++){
			for(int j = 100; j<=999; j++){
				int product= j * i;
				//converts product to string for comparison
				String test = String.valueOf(product);
				int strlen = test.length();
				int k=0;
				int isPal=0;
				//starts at both ends of the string and moves in to compare numbers
				while(k<=2){
					if(test.charAt(k)!=test.charAt(strlen-k-1)){
						//only adds if two numbers don't match
						isPal++;
					}
					k++;
				}
				//returns the largest palindrome
				if (isPal== 0 && product > value){
					value = product;
				}
			}
		}
		
		return value;
	}
}
