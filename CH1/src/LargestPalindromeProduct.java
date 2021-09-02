
public class LargestPalindromeProduct {

	public static void main(String[] args) {

		int number=100;
		int highestPali=0;
		int product;
		int i;
		while(number<1000) {
			for(i=100;i<1000; i++) {
				product=number*i;
				if(palindrome(product) && product > highestPali) {
					highestPali=product;
				}
				
			}
			number++;
		}
		
		System.out.println("The highest is "+highestPali);


	}
	public static boolean palindrome(int input) {
		boolean palindrome=true;
		String[] nums= String.valueOf(input).split("");
		int n=0,i;
		for(i=nums.length-1;i>=0;i--) {
			if(n!=i) {
				if(!nums[i].equals(nums[n])) {
					palindrome=false;
					break;
				}
			}
			n++;
		}
		if(palindrome) {
			System.out.println("This is a palindrome");
			return true;
		}
		else
			System.out.println("This is not a palindrome");
		return false;


	}

}
