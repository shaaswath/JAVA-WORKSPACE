import java.util.*;
public class WaitList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		if(n==1) {
			System.out.print("Waiting List is Empty");
		}
		else {
			for(int i=1;i<n;i++) {
				System.out.print(a[i]+" ");
			}
		}
	}
}