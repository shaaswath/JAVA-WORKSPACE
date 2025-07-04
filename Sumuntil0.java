import java.util.*;
public class Sumuntil0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int n = in.nextInt();
			if(n == 0) {
				
				System.out.println("Invalid sum");
				break;
			}
			sum += n;
			}
		System.out.println("Total sum = "+ sum);
		
		// program for largest among all
		
		int max = Integer.MIN_VALUE;
		while(true) {
		int n = in.nextInt();
			if(n == 0) {
				System.out.println("Invalid num");
				break;
			}
			if(n > max) {
				max = n;
			}
		}
		System.out.println(max + " is greater");
	}

}
