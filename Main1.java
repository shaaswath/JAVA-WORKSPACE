import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i][0]==arr[j][1] && arr[i][1]==arr[j][0]) {
					System.out.println(arr[i][0]+" "+arr[i][1]);
				}
			}
		}

	}

}
