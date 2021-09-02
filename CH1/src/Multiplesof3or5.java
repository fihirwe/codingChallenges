import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplesof3or5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the number you want to calculate the sum");
		
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(reader.readLine());
		
		int i,sum=0;
		for(i=1; i<input; i++) {
			if(i%3==0|i%5==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		
		System.out.println(" The sum will be: "+sum);
	}

}
