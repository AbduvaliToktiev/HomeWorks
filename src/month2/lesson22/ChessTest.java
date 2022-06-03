package month2.lesson22;

import javax.swing.*;

public class ChessTest {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rectangle = new Rectangle(10);
                LocationOfFigure locationOfFigure = new LocationOfFigure();
                locationOfFigure.setX(i);
                locationOfFigure.setY(j);
                rectangle.setColor("Black");
                rectangle.setInvisible(true);
                chessBoard.fill(i, j, rectangle);
                System.out.println(rectangle.speak());
            }
        }
        System.out.println("Created objects: " + Rectangle.count);

        TestCanvas canvas = new TestCanvas();
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(canvas,0);
        jFrame.setVisible(true);
    }
}
