package month2.lesson22;

public class ChessBoard {
     final int chess = 12;
     final int[] mass = new int[chess];
    final Rectangle[][] mass2 = new Rectangle[8][8];
    void fill(int x, int y, Rectangle rectangle) {
        mass2[x][y] = rectangle;
    }
}

