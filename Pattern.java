import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
