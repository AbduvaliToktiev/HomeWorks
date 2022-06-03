package month2.lesson22;

import javax.swing.*;
import java.awt.*;

public class TestCanvas extends Canvas {
    public TestCanvas() {
    }
    @Override
    public void paint(Graphics graphics) {
//        graphics.drawString("f", 30, 12);
//        graphics.setColor(Color.BLACK);
//        graphics.fillRect(10, 15, 50, 50);
//        graphics.setColor(Color.BLACK);
//        graphics.drawRect(60, 15, 50, 50);
        int counterX = 0;
        int counterY = 0;
        for (int i = 15; i <= 365; i+=50) {
            for (int j = 10; j <= 360; j+=50) {
                if ((counterY % 2 == 0 && counterX % 2 != 0) ||
                        (counterX % 2 == 0 && counterY % 2 != 0)) {
                    graphics.setColor(Color.BLACK);
                    graphics.fillRect(j, i, 50, 50);
                } else {
                    graphics.setColor(Color.BLACK);
                    graphics.drawRect(j, i, 50, 50);
                }
                counterY++;
            }
            counterX++;
        }
    }
    public static void main(String[] args) {
        TestCanvas canvas = new TestCanvas();
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(canvas,0);
        jFrame.setVisible(true);
    }
}
