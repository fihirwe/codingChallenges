
public class F10001stPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=2;
		int count=0;
		boolean prime=true;
		while (count<10001) {
			prime = true;
			for (int j = 2; j <= i/2; j++) {
				if (i%j == 0) {
					prime = false; 
				}
			}
			if(prime) {
				System.out.println(" " + i);
				count++;
			}
				
			i++;
		}
		System.out.println("The 10001 prime number is " + (i-1));
	}
}
