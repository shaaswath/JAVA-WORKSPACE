import java.util.*;
public class SumOfNoInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int sum=0;
		char []c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if((c[i]>=65 && c[i]<=90) ||(c[i]>=97 && c[i]<=122)) {
				continue;
			}
			sum+=(c[i]-'0');

		}
		System.out.print(sum);
	}

}
