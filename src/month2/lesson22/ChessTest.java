package month2.lesson22;

public class ChessTest {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle(10);
                rectangle.setColor("Black");
                rectangle.setInvisible(true);
                chessBoard.fill(i, j , rectangle);
                System.out.println(rectangle.speak());
            }
        }
    }
}
