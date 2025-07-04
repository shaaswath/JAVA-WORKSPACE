import java.util.*;
public class Fibonocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count = 2; //count is starting with 2 because there are two inputs were 
		//initialized earlier so that we need to count them also orelse this will
		//run upto n+2
		while (count<=n) {
			int temp=b;
			b=a+b;
			a=temp;
			count++;
		}
		System.out.println(b);

	}

}
