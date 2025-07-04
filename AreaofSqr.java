import java.util.*;
public class AreaofSqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int r = in.nextInt();
		float a = (float) (3.14*(r*r));
		// float a =  3.14f*r*; (or) double a = MATH.PI*r*r;
		//"initially the 3.14 is a constant double value so we are type casting into float"
		System.out.println(a);
		
		
		// program for area of triangle
		
		int b = in.nextInt();
		int h = in.nextInt();
		float a = 0.5f*b*h;
		System.out.println(a);
		
		// program for vol of sphere
		
		int r = in.nextInt();
		double vol = (4.0/3.0)*3.14*r*r*r;
		System.out.println(vol);
	}

}
