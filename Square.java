// Leaf class
public class Square implements Graphic {
    private String name;

    public Square(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square: " + name);
    }
}
