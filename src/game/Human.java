package game;

/**
 * Bu klass PhysicalObject classin toreme klassidir orada ki butun xususiyetleri nesilleyir
 * eyni zamanda Moveable ve Swimmable interfeyslerini icra edir. Buna gore mecbur
 * swim ve move funskiyalarini teyin etmelidir.
 */
public class Human extends PhysicalObject implements Moveable, Swimmable {


    /**
     * Moveable interfeysinden gelen metod
     */
    @Override
    public void move() {
        System.out.println("Move human");
    }


    /**
     * Swimmable interfeysinden gelen metod
     */
    @Override
    public void swim() {
        System.out.println("Human swim");
    }


    /**
     * Swimmable interfeysinden gelen metod
     */
    @Override
    public void suyaBat() {
        System.out.println("Human suya batdi");
    }

}
