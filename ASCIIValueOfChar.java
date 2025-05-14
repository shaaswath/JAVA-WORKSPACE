import java.util.*;
public class ASCIIValueOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		System.out.println((int)s.charAt(i));
}
}