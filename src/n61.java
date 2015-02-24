
class Point {

    int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }


}

/*
 * Created by Степан on 21.02.2015.
 */
public class n61 {


    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(50, 0);
        Point C = new Point(50, 90);
        Point D = new Point(0, 90);

        Point points[] = {A, B, C, D};
        System.out.println("P="+perimeter(points));

    }

    public static double perimeter(Point points[]) {
        double P = 0;
        for (int i = 0; i < points.length; i++) {
            if (i == (points.length - 1)) {
                System.out.println("Distance between point "+(i+1)+" and point "+(1));
                P+=distance(points[i],points[0]);

            } else {
                System.out.println("Distance between point "+(i+1)+" and point "+(i+2));
                P+=distance(points[i],points[i+1]);

            }
        }
        return P;
    }
    public static double distance(Point a, Point b ){

        double D=Math.sqrt(((a.x-b.x)*(a.x-b.x))+((a.y-b.y)*(a.y-b.y)));
        System.out.println("x1="+a.x+"  y1="+a.y+"  x2="+b.x+"  y2="+b.y+"  D="+D);
        return D;
    }

}
