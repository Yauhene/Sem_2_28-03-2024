package fromLection;

import javax.swing.*;
import java.awt.*;

public class MainCanvas extends JPanel {
    MainCanvas() {
        setBackground(Color.BLUE);
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//    }

    public int getLeft() {return 0;}
    public int getRigth() {return getWidth() - 1;}
    public int getTop() {return 0;}
    public int getBottom() {return getHeight() - 1;}
    private long lastFrameTime;

    private final MainWindow controller;

    MainCanvas(MainWindow controller) {
        setBackground(Color.BLUE);
        this.controller = controller;
        lastFrameTime = System.nanoTime();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        try {
            Thread.sleep(16);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        float deltaTime = (System.nanoTime() - lastFrameTime) * 0.000000001f;
        controller.onDrawFrame(this, g, deltaTime);
        lastFrameTime = System.nanoTime();
        repaint();
    }

}
