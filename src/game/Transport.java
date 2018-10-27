package game;

public class Transport extends PhysicalObject implements Moveable {

    @Override
    public void move() {
        System.out.println("Move transport");
    }
}
