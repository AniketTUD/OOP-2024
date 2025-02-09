package ie.tudublin;

import processing.core.PVector;

public class Player {
    private PVector pos;
    private float rotation;
    private int col;
    private float width;
    private float halfW;

    YASC yasc;

    public PVector getPos() {
        return pos;
    }
    public void setPos(PVector pos) {
        this.pos = pos;
    }
    public float getRotation() {
        return rotation;
    }
    public void setRotation(float rotation) {
        this.rotation = rotation;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float getHalfW() {
        return halfW;
    }
    public void setHalfW(float halfW) {
        this.halfW = halfW;
    }

    public Player(YASC yasc, float x, float y, float rotation, int col, float width) {
        this.yasc = yasc;
        this.pos = new PVector(x, y);
        this.rotation = rotation;
        this.col = col;
        this.width = width;
        this.halfW = width * 0.5f;
    }    

    public void render()
    {
        yasc.circle(pos.x, pos.y, width);
    }
    
}
