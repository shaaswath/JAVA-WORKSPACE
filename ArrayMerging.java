import java.util.*;
public class ArrayMerging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		for(int i=0;i<n;b[i++]=sc.nextInt());
		int merge[]=new int[2*n];
		for(int i=0;i<n;i++) {
			merge[i]=a[i];
			}
			for(int j=0;j<n;j++) {
				merge[n + j]=b[j];
			}
		System.out.println("merged array"+" ");
		int nums=0;
		for(int i=0;i<2*n;i++) {
			nums=merge[i];
		System.out.print(nums+" ");
		}
	}

}
