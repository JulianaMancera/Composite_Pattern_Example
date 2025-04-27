// Client code
public class Test {
    public static void main(String[] args) {
        // Create leaf objects
        Circle circle1 = new Circle("Circle 1");
        Circle circle2 = new Circle("Circle 2");
        Square square1 = new Square("Square 1");

        // Create composite objects
        CompositeGraphic composite1 = new CompositeGraphic("Composite 1");
        CompositeGraphic composite2 = new CompositeGraphic("Composite 2");

        // Build the hierarchy
        composite1.add(circle1);
        composite1.add(square1);
        composite2.add(circle2);
        composite2.add(composite1);

        // Draw the entire hierarchy
        composite2.draw();
    }
}