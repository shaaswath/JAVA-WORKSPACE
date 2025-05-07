import java.util.*;
public class FactorsOfTheGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		while(i<=n/2) {
			
			if(n%i==0) {
				int c=0;
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) c=1;
				}
				if(c==0) System.out.print(i+" ");
		}
			i++;
		}
	}
}