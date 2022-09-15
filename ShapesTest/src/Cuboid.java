import javax.swing.*;

public class Cuboid extends Shape {

    // Properties
    private float width = 0;
    private float height = 0;
    private  float depth = 0;

    // Constructor
    public Cuboid() {

    }

    //Populated Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Setters and Getters

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // Surface are formula
    @Override
    public float surfaceArea() {
        return (float) (2 * (width*depth + depth*height + height*width ));
    }

    // Volume area formula
    @Override
    public float volume() {
        return (float) (width*depth*height);
    }

    //Message
    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "CUBOID \n\nWidth: " + getWidth() + "\n"
                                        + "Height: " + getHeight() + "\n"
                                        + "Depth: " + getDepth() + "\n"
                                        + "Volume: " + volume() + "\n"
                                        + "SurfaceArea: " + surfaceArea() + "\n");
    }
}
