import java.util.*;
public class NumberOfElementsbwTwoNUms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0,s=0,e=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==start) {
				  s=i;
				 count++;
			}
			if(arr[i]==end) {
				 e=i;
				count++;
			}
		
		}
		if(count>1) {
			System.out.println(e-s-1);
		}
		
	}

}
