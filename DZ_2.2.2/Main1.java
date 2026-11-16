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
}