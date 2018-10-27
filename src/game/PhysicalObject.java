package game;

public class PhysicalObject {

    private float mass, width;
    private float height, depth;

    public PhysicalObject() {
    }

    public PhysicalObject(float mass, float height, float width, float depth) {
        this.mass = mass;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
}
