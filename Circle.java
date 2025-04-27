// Leaf class
public class Circle implements Graphic {
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: " + name);
    }
}
