package ru.itis.inf304.lab24;

import javax.swing.*;
import java.awt.*;

public class FunctionGraphic extends JFrame {

    IFunction function;

    public FunctionGraphic(IFunction function) {
        super("График функции");

        this.function = function;
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(100, 200, 200));
        //g2d.setFont(new Font("TimesRoman", Font.PLAIN, 23));
        Font currentFont = g2d.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.4F);
        g2d.setFont(newFont);
        g2d.drawString("X", 200, 200);
        for (int i = 0; i < 100; ++i) {
            g2d.fillRect(i, (int)(600 - function.calculate(i)), 1, 1);
        }


    }


}
/*
public final class TestFrame extends JFrame {
    public TestFrame() {
        this.getRootPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                // This is only called when the user releases the mouse button.
                System.out.println("componentResized");
            }
        });
    }
}
 */