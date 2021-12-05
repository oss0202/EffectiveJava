package first.flyweight;

public class UseCircle {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        for (int i = 0; i < 15; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(colors[(int) (Math.random()*4)]);
            circle.setX((int) (Math.random() * 100));
            circle.setY((int) (Math.random() * 4));
            circle.setRadius((int) (Math.random() * 10));
            circle.draw();
        }
    }
}
