import java.util.*;
public class AverageOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		int sum=0,avg=0;
		for(int i=0;i<n;i++) {
			 sum+=a[i];
			 avg=sum/n;
		}
		System.out.println(avg+" ");

	}

}
