import javax.swing.*;

public class Sphere extends Shape {

    // Properties
    private float radius = 0;

    // Constructor
    public Sphere() {

    }

    //Populated Constructor
    public Sphere(float radius) {
        this.radius = radius;
    }


    // Getters & Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }


    // Surface are formula
    @Override
    public float surfaceArea() {
        return (float) (4 * Math.PI * (radius*radius));
    }

    // Volume area formula
    @Override
    public float volume() {
        return (float) ((4.0/3.0) * Math.PI * (radius * radius * radius));
    }

    // Message
    @Override
    public void render() {
        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "SPHERE \n\nRadius: " + getRadius() + "\n"
                                        + "Volume: " + volume() + "\n"
                                        + "Surface Area: " + surfaceArea() + "\n");

    }
}
