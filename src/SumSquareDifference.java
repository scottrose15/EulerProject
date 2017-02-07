
public class SumSquareDifference {
	/*Problem: Find the difference between the sum of the squares of the first 
	 * one hundred natural numbers and the square of the sum.
	 */
	private int value;
	public int SumSquare(){
		
		int squareOfSum=0;
		int sumOfSquare=0;
		//sums all of the numbers squared
		for(int i=1; i<= 100; i++){
			sumOfSquare = sumOfSquare + (i*i);
		}
		//sums all of the numbers to be squared later
		for(int j=1; j<= 100; j++){
			squareOfSum = squareOfSum + j;
		}
		squareOfSum = squareOfSum*squareOfSum;
		value = squareOfSum - sumOfSquare;
		return value;
	}
}
