import java.util.*;
public class RemoveBracees {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		char []c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(c[i]==40 || c[i]==41) {
				continue;
			}
			System.out.print(c[i]);
		}
	}

}
