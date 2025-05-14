import java.util.*;
public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]<=90 && c[i]>=65) {
				int j=(int)s.charAt(i)+32;
				System.out.print(""+(char)j);
			}
			else if(c[i]>=97 && c[i]<=122) {
				int j2=(int)s.charAt(i)-32;
				System.out.print(""+(char)j2);
			}
		}
	}
}
