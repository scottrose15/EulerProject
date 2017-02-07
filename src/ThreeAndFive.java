
public class ThreeAndFive {
	/*
	 Problem:Find the sum of all the multiples of 3 or 5 below 1000.
	*/
	private int value;
	public int MultiSum(){
		int sum5 = 0;
		int sum3 = 0;
		int i=1;
		//tests all numbers up to 1000
		while (i<=1000){
			//sums the multiples of 5
			if (((i%5)==0)&&(i<=1000)){
				sum5 = sum5 + i;
			}
			//sums the multiples of 3
			else if (((i%3)==0)&&(i<=1000)) {
				sum3 = sum3 + i;
			}
			i= i + 1;
		}
	value = sum5 + sum3;
	//System.out.println(sum5 + sum3);
	return value;
	
	}
}