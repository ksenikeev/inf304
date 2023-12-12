package ru.itis.inf304.lab24.graph;

import javax.swing.*;
import java.awt.*;

public class PlotFunction extends JFrame {

    private IFunction function;

    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    public PlotFunction(IFunction function) {
        super("График функции");
        this.function = function;

        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.repaint();
        this.setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(new Color(255, 0, 0));

        Font currentFont = g2d.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 3F);
        g2d.setFont(newFont);

        g2d.drawString("Прямая", 50, 100);

        for (int i = 0; i < WIDTH; ++i) {
            g2d.fillRect(i, HEIGHT - (int)function.calculate(i), 1, 1);
        }
    }
}
