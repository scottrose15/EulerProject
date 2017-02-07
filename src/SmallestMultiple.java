
public class SmallestMultiple {
	//Problem: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	private int value;
	public int findSmallest(){
		int num = 1;
		int isMult=1;
		//loop continual checks numbers to see if they are multiples
		while(isMult!=0){
			isMult= 0;
			//counts how many times a number has a remainder
			for(int i = 1; i<=20; i++){
				isMult = isMult + (num % i);
			}
			//sets value equal to the first number with no remainders
			if(isMult  == 0){
				value = num;
			}
			num++;
		}
		return value;
	}
}
