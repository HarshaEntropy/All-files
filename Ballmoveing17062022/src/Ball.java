public class Ball {
int x;
int y;
int dx;
int dy;
int radius;

    public Ball(int x, int y, int dx, int dy, int radius) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                ", radius=" + radius +
                '}';
    }
}
