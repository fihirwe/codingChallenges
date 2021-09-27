import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestMultiple {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//		2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
		//
		//		What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

		System.out.println("Enter the largest number divisible number");

		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());

		boolean gotIt=true;
		int k=1;
		int count=0;
		int m=1;
		while(gotIt) {

			for(m=1;m<=n;m+=1) {
				if(k%m!=0) {
					break;
				}
				else {
					count++;
				}
			}
			if(count==n) {
				gotIt=false;
			}
			count=0;
			k++;
		}
		System.out.println("The snallest number is "+ (k-1));

	}

}
