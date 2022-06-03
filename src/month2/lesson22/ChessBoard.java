package month2.lesson22;

public class ChessBoard {

    private final Circle[] circles = new Circle[12];
    private final Rectangle[][] mass2 = new Rectangle[8][8];

    public Circle[] getCircles() {
        return circles;
    }

    public Rectangle[][] getMass2() {
        return mass2;
    }

   final void fill(int x, int y, Rectangle rectangle) {
        mass2[x][y] = rectangle;
    }
}

