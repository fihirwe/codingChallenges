
public class SumSquareDifference {

	public static void main(String[] args) {
//		The sum of the squares of the first ten natural numbers is,
//
//		The square of the sum of the first ten natural numbers is,
//
//		Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
//
//		Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum
		
		
		int sumOfSquare= 0;
		int squareOfSum=0;
		int i;
		for(i=0;i<=100;i++) {
			sumOfSquare=sumOfSquare+i*i;
			squareOfSum=squareOfSum+i;
		}
	
		System.out.println("reslt= "+((squareOfSum*squareOfSum)-sumOfSquare));
	
	}

}
