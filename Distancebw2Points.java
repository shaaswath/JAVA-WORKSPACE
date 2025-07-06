import java.util.*;
public class Distancebw2Points {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // DISTANCE BETWEEN TWO POINTS

        System.out.print("Enter the distance 1 points in (a,b) = ");
        String dist1 = in.nextLine();
        System.out.print("Enter the distance 2 points in (a,b) = ");
        String dist2 = in.nextLine();
        dist1 = dist1.replace("(","").replace(")","").trim();
        dist2 = dist2.replace("(","").replace(")","").trim();

        String[] pt1 = dist1.split(",");
        String[] pt2 = dist2.split(",");

        double x1 = Double.parseDouble(pt1[0]);
        double x2 = Double.parseDouble(pt2[0]);
        double y1 = Double.parseDouble(pt1[1]);
        double y2 = Double.parseDouble(pt2[1]);

        double distance = Math.sqrt(Math.pow(x2 - x1 , 2)+(Math.pow(y2 - y1 , 2)));
        System.out.println(distance);
    }
}
