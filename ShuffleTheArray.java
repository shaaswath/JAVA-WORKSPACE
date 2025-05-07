import java.util.*;
public class ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int c=0,d=arr.length-1;
		for(int i=0;i<n;i++) {
			if(i%2==0 && c<arr.length/2) {
				System.out.print(arr[c]+" ");
				c++;
			}
			else {
				System.out.print(arr[d]+" ");
				d--;
			}
		}
	}

}
