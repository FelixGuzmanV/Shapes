public class ShapesTest {

    public static void main (String[] args) {

        // New Cylinder Object
        Cylinder cy = new Cylinder();

        //Values
        cy.setRadius(3);
        cy.setHeight(5);
        cy.render();

        // New Cuboid Object
        Cuboid cu = new Cuboid();

        //Values
        cu.setDepth(6);
        cu.setHeight(4);
        cu.setWidth(4);
        cu.render();

        // New Sphere Object
        Sphere sp = new Sphere();

        //Values
        sp.setRadius(15);
        sp.render();

    }
}
