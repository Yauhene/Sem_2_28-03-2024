package fromLection;
import java.awt.*;

public abstract class Sprite {
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHigth;

    protected float getLeft() { return  x - halfWidth; }
    protected void setLeft(float left) { x = left + halfWidth; }
    protected float getRigth() { return x + halfWidth; }
    protected void  setRigth(float rigth) { x = rigth - halfWidth; }
    protected float getTop() { return y - halfHigth; }
    protected void setTop(float top) { y = top + halfHigth; }
    protected float getBottom() { return y + halfHigth; }
    protected void setBottom(float bottom) { y = bottom - halfHigth; }

    protected float getWidth() { return 2f * halfWidth; }
    protected float getHigth() { return  2f * halfHigth; }

    void update(MainCanvas canvas, float deltaTime) { }
    void render(MainCanvas canvas, Graphics g) { }

}
