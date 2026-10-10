public class Segment {
    private Point p1, p2;

    public Segment(Point p1, Point p2) { this.p1 = new Point(p1); this.p2 = new Point(p2); }
    public Segment(float x1, float y1, float x2, float y2) { this(new Point(x1, y1), new Point(x2, y2)); }

    public Point getP1() { return new Point(p1); }
    public void setP1(Point p) { p1 = new Point(p); }
    public Point getP2() { return new Point(p2); }
    public void setP2(Point p) { p2 = new Point(p); }

    public void translate(float dX, float dY) { p1.translate(dX, dY); p2.translate(dX, dY); }
    public float length() { return p1.distance(p2); }
    public boolean equals(Segment s) {
        return (p1.equals(s.p1) && p2.equals(s.p2)) || (p1.equals(s.p2) && p2.equals(s.p1));
    }

    public float getSlope() { return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX()); }
    public float getIntercept() { return p1.getY() - getSlope() * p1.getX(); }

    public boolean isOnLine(Point p) {
        float cross = (p2.getX() - p1.getX()) * (p.getY() - p1.getY())
                - (p2.getY() - p1.getY()) * (p.getX() - p1.getX());
        return Math.abs(cross) < 1e-4;
    }

    public boolean isOnSegment(Point p) {
        return isOnLine(p)
                && p.getX() >= Math.min(p1.getX(), p2.getX()) - 1e-4 && p.getX() <= Math.max(p1.getX(), p2.getX()) + 1e-4
                && p.getY() >= Math.min(p1.getY(), p2.getY()) - 1e-4 && p.getY() <= Math.max(p1.getY(), p2.getY()) + 1e-4;
    }
}