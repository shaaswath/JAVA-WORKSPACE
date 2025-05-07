import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1.toLowerCase();
		str2.toLowerCase();
		char[]c1=str1.toCharArray();
		char[]c2=str2.toCharArray();
		int count=0;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				for(int j=i+1;j<str2.length();j++) {
					if(c1[i]==(c2[j])) {
						count++;
						//continue;
						break;
					}
				}
			}
		}
		else {
			System.out.println("Not an anagaram");
		}
		if(count>1) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not an anagram");
		}
	}
}
		
