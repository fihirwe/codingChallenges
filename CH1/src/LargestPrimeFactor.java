import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class LargestPrimeFactor {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		The prime factors of 13195 are 5, 7, 13 and 29.
//
//		What is the largest prime factor of the number 600851475143 ?
		
		
		
		System.out.println("Enter the number you want to calculate the Largest prime number");

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		Long n = Long.parseLong(reader.readLine());

        long number = n;
        long largestPrimeFactor = n;
        long i = 2;
        while (i <= n && n != 1) {
            if (n % i == 0) {
                n = n / i;
                largestPrimeFactor = i;
            }
            else {
                i = i+1;
            }
        }
        System.out.println("The largest prime factor of the number "+ number + " is = "+ largestPrimeFactor);

//4
// likes
//Reply
// 

		
		// BRUTE FORCING
		
//		ArrayList <Long> numbers=  new ArrayList<>(); 
//		
//		long i;
//		for(i=0; i<input; i++) {
//			numbers.add(i+2);
//		}

//		Boolean[] labels=  new Boolean[(int) input]; 
//
//		long a,b,j;
//		for(a=0;a<input; a++) {
//			b=numbers.get((int) a);
//			if(labels[(int) a]==null) {
//				labels[(int) a]=true;
//
//				for (j = a+1; j < input; j++) {
//					if(labels[(int) j]==null && numbers.get((int) j)%b==0) {
//						labels[(int) j]=false;
//					}
//				}
//			}
//		}
//		long factor=0;
////		for(int k=0; k<input-1;k++) {
////			if(labels[k]==true) {
////				factor=numbers.get(k);
////				System.out.print(" "+factor);
////			}
////		}
////		System.out.println();
////		System.out.println("Enter the number you want to find the larget prime factor");
////		input = Long.parseInt(reader.readLine());
////		
//		for(long k=0; k<input-1;k++) {
//			if(labels[(int) k]==true) {
//				factor=numbers.get((int) k);
//				if(input%factor==0) {
//					System.out.print(" "+(int) factor);
//				}
//			}
//		}

	}
}
