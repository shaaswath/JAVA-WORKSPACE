import java.util.*;
public class OddAndEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;a[i++]=sc.nextInt());
		int evenCount=0,oddCount=0;
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}
			else oddCount++;
		}
		if(evenCount>0 && oddCount>0) {
			System.out.println("EVEN COUNTS ARE: "+evenCount);
			System.out.println("ODD COUNTS ARE: "+oddCount);
		}

	}

}
