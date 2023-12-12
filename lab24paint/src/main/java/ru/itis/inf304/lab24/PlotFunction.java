package ru.itis.inf304.lab24;

import javax.swing.*;

public class PlotFunction {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FunctionGraphic(new ExpFunction());
            }
        });
    }
}
