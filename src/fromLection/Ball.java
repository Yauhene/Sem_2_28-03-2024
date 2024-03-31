package fromLection;

import java.awt.*;
import java.util.*;

public class Ball extends Sprite {
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    Ball() {
        halfHigth = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHigth;
        color = new Color(rnd.nextInt());
        vX = 100f + (float) (Math.random() *200f);
        vY = 100f + (float) (Math.random() *200f);
    }

    @Override
    public void update(MainCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()) {
            setLeft((canvas.getLeft()));
            vX = -vX;
        }
        if (getRigth() > canvas.getRigth()) {
            setRigth(canvas.getRigth());
            vX = -vX;
        }
        if (getTop() < canvas.getTop()) {
            setTop((canvas.getTop()));
            vY = - vY;
        }
        if (getBottom() > canvas.getBottom()) {
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }
    @Override
    public void render(MainCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillOval((int) getLeft(), (int) getTop(),
                (int) getWidth(), (int) getHigth());
    }
}
