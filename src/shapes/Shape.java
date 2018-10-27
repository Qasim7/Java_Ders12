package shapes;

/**
 * Bu klass abstrakt klassdir, bununla o body-si (icrasi) olmayan metodlar teyin ede bilir
 * Shape (fiqur) fiziki olaraq saheni hesablaya bilmez (biz bilmeliyik bu ne fiqurudur, cunki
 * muxtelif fiqurlar saheni ferqli yol ile hesablayir). Lakin biz bilirik ki mutleq her bir
 * fiqurun sahesi var. Bu sebebden biz calculate area funksiyasini burada teyin edirik.
 * Lakin onun icrasi toreme klasslarda bash verir
 */
public abstract class Shape {

    public abstract float calculateArea();


    /**
     * Abstraktlar klass butun normal klasslar kimi hemcinin adi metodlarda teyin ede bilir
     * bu metodun daxilinde biz shape haqqinda melumati cap edirik. Bunun ucun biz
     * toreme klasslarda icra olunan calculateArea() metodunu cagiriq
     */
    public void print() {
        System.out.println("Area of " + getClass().getName() + " = " + calculateArea());
    }

}
