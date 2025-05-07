import java.util.*;
public class SumOfOddandEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		int evenSum=0,oddSum=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				evenSum+=a[i];
			}
			else
				oddSum+=a[i];
		}
		System.out.println("EVEN SUMS ARE: "+evenSum);
		System.out.println("ODD SUMS ARE: "+oddSum);
	}
}
