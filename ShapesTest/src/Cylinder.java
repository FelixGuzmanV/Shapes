import javax.swing.*;

public class Cylinder extends Shape {
    // Properties
    float radius = 0;
    float height = 0;

    // Constructor
    public Cylinder() {

    }

    //Populated Constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Setters and Getters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


    // Surface are formula
    @Override
    public float surfaceArea() {
        return (float) (2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius));
    }

    // Volume area formula
    @Override
    public float volume() {
        return (float) (Math.PI * (radius*radius) * height);
    }

    //Message
    @Override
    public void render() {


        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "CYLINDER \n\nRadius: " + getRadius() + "\n"
                                        + "Height: " + getHeight() + "\n"
                                        + "Volume: " + volume() + "\n"
                                        + "Surface Area: " + surfaceArea() + "\n");


        /* Just Practicing

        String inputValue = JOptionPane.showInputDialog("Please input a value");

        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), inputValue);

        Object[] possibleValues = { "First", "Second", "Third" };
        Object selectedValue = JOptionPane.showInputDialog(null,
                "Choose one", "Input",
                JOptionPane.INFORMATION_MESSAGE, null,
                possibleValues, possibleValues[0]);

     MORE SAMPLES: https://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html
*/


    }

}
