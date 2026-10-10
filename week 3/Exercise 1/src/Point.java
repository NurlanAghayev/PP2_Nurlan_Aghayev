public class Point {
    private float x, y;

    public Point() { this(0, 0); }
    public Point(float x, float y) { this.x = x; this.y = y; }
    public Point(Point p) { this(p.x, p.y); }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }

    public void translate(float dX, float dY) { x += dX; y += dY; }
    public float distance(Point p) { return (float) Math.hypot(x - p.x, y - p.y); }
    public boolean equals(Point p) { return Math.abs(x - p.x) < 1e-4 && Math.abs(y - p.y) < 1e-4; }
    public String toString() { return "(" + x + ", " + y + ")"; }
}