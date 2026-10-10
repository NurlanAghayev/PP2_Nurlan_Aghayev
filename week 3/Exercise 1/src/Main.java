public class Main {
    public static void main(String[] args) {
        Point a = new Point(), b = new Point(3, 4), c = new Point(b);
        System.out.println(a.distance(b));
        System.out.println(b.equals(c));
        c.setX(10);
        System.out.println(c + " " + b);
        b.translate(1, -1);
        System.out.println(b);

        Segment s = new Segment(0, 1, 4, 9);
        System.out.println(s.length());
        System.out.println(s.getSlope() + " " + s.getIntercept());
        System.out.println(s.isOnLine(new Point(6, 13)));
        System.out.println(s.isOnSegment(new Point(6, 13)));
        System.out.println(s.isOnSegment(new Point(2, 5)));
        System.out.println(s.equals(new Segment(4, 9, 0, 1)));
    }
}