public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        this.vX = 1;
        this.vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D other) {
        this.vX = other.vX;
        this.vY = other.vY;
    }

    public void print() {
        System.out.println(String.format("(%.2f, %.2f)", vX, vY));
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
}