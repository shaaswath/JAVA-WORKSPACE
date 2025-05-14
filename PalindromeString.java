import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		char c[]=s.toCharArray();
			for(int j=s.length()-1;j>=0;j--) {
				rev+=s.charAt(j);
				if(s.equals(rev)){
					System.out.println("given string is a palindrome");
				}
	}
}
}
