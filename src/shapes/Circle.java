package shapes;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Men qulaq asiram boyuklere amma oz sozumude elave elirem");
    }
}
