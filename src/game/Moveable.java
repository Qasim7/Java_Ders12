package game;

/**
 * Bu interfeys icra olunan butun klasslara
 * yer deyishmek (move) xususiyetini elave edir
 * burada yalniz bu xususiyetin (metodun) adi ve qaytaridigi tip yazilir
 * metodun icrasi (body-si) istifade olunan klasslarda yazilir, ve ya anonym
 * teyin elediyiniz obyektlerde:
 *
 *  Moveable moveable = new Moveable {
 *
 *      @Override
 *      public void move(){
 *          //move mentiqi
 *      }
 *  }
 *
 */
public interface Moveable {

    void move();

}
