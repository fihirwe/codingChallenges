
public class SummationOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		//
		//				Find the sum of all the primes below two million.


		boolean prime=true;
		int i;
		int n=2;
		long sum =0;
		while(n<2000000) {
			prime=true;
			for (i = 2; i <= n/2; i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
			}
			
			if(prime) {
				sum=sum+n;
			}
			n++;
		}
		System.out.println(sum);
	}

}
