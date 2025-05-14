import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			int count=0;
			if(c[i]=='A' || c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='i') {
				count++;
			}
			System.out.println(count);
		}
	}
}
