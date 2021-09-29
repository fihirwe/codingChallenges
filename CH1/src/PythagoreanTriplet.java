import java.util.Iterator;

public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//		a^2 + b^2 = c^2
//		For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
//
//		There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//		Find the product abc.
//		
		int i, j, k;
		for (i = 0; i < 1000; i++) {
			for (j = i; j < 1000; j++) {
				for (k = j; k < 1000; k++) {
					if((i+j+k==1000) && (Math.pow(i, 2)+Math.pow(j, 2)==Math.pow(k, 2))) {
						System.out.println("Got"+i+" "+j+" "+k+" and the product is "+i*j*k);
						break;
					}
				}
			}
		}
	}

}
