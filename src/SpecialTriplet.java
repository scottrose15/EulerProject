
public class SpecialTriplet {
	// Problem:There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product of abc
	private int value;
	
	int SpecialPyth(){
		int asum = 0;
		int bsum = 0;
		int csum = 0;
			//outter loop checks all c's up to 1000
			for(int c = 3;c <= 1000;c++){
				//middle loop checks all b's of a given c
				for(int b = 2; b< c; b++){
					//inner loop checks all a's of a given b and c
					for(int a = 1; a < b; a++){
						//if a given a b and c sum to 1000, they are stored
						if((a*a+b*b==c*c)&&(a+b+c == 1000)){
							asum = a;
							bsum = b;
							csum = c;
						}
					}
				}
			}
		//the stored a b and c are multiplied and returned
		value = asum * bsum * csum;
		return value;
	}
}