import java.util.*;
public class MidElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]+" ");}
			System.out.println("Middle Element:");
			if(n%2!=0) {
				System.out.print(a[n/2]+" ");
			}
			else System.out.print(a[(n/2)-1]+" ");
	}
}
