package third;

public class ColorUse {
    public static void main(String[] args) {
        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BlUE);

        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        System.out.println("p2.equals(p3) : " + p2.equals(p3));
        System.out.println("p1.equals(p3) : " + p1.equals(p3));

    }
}
