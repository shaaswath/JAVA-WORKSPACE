import java.util.*;
public class RemoveSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[i]);
		}
	}

}
