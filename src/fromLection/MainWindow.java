package fromLection;

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class MainWindow extends JFrame implements CanvasRepaintListener{
    private static final int WINDOW_HEIGHT = 600;
    private static final int WINDOW_WIDTH = 800;
    private static final int POS_X = 400;
    private static final int POS_Y = 200;
    private final Sprite[] sprites = new Sprite[10];

    private MainWindow() throws IOException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Circles");

        MainCanvas canvas = new MainCanvas(this);
        add(canvas);

        for (int i = 0; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }

        setVisible(true);

        // ======== вроде сюда следовало положить ================
        sprites[0] = new Background();
        for (int i = 1; i < sprites.length; i++) {
            sprites[i] = new Ball();
        }

    }

    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) {
        update(canvas, deltaTime);
        render(canvas, g);
    }

    private void update(MainCanvas canvas, float deltaTime) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].update(canvas, deltaTime);
        }
    }
    private void render(MainCanvas canvas, Graphics g) {
        for (int i = 0; i < sprites.length; i++) {
            sprites[i].render(canvas, g);
        }
    }

    public static void main(String[] args) throws IOException {
        new MainWindow();
    }
//    @Override
//    public void onDrawFrame(MainCanvas canvas, Graphics g, float deltaTime) { }
}
