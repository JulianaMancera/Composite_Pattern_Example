// Composite class
import java.util.*;

public class CompositeGraphic implements Graphic {
    private List<Graphic> graphics = new ArrayList<>();
    private String name;

    public CompositeGraphic(String name) {
        this.name = name;
    }

    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        graphics.remove(graphic);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Composite: " + name);
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}