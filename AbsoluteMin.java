import java.util.*;
public class AbsoluteMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=0;j<n;j++) {
				if(i!=j) {
				if(Math.abs(arr[i]-arr[j])<min) {
					min=Math.abs(arr[i]-arr[j]);
				}}
			}sum+=min;
		}
		System.out.println(sum);
	}
}
