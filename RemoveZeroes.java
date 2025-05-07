import java.util.*;
public class RemoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		char c1='0';
		String result="";
		for(int i=0;i<s.length();i++) {
			char[] c=s.toCharArray();
			if(c1==c[i]) {
				continue;
			}
			result+=c[i];
		}
		System.out.print(result);
	}

}
