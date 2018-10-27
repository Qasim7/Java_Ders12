package android;

public class Button {


    /**
     * Bu klassin private field-i olaraq biz OnClickListener interfeysini qebul edirik
     * sozugeden interfeys vasitesi ile biz androidin daxili mentiqi bitdikden sonra
     * bu interfeysin teyin etdiyi onClick funksiyasini cagira bilerik.
     * Button klassi ucun maraqli deyil bu interfeys nece ve harda icra olunub. Ferqli
     * buttonlar ucun ferqli icralar ola biler (ve olmalidir). Bu sebebden her bir button
     * objectinin oz onClickListeneri olmalidir.
     */
    private OnClickListener clickListener;

    public void userClick() {
        System.out.println("Istifadeci click etdi");

        System.out.println("Android OSin daxili mentqiqi bashladi");
        process();
        System.out.println("Android OSin daxili mentqiqi bitirdi");

        /**
         * burada artiq qebul elediyimiz OnClickListenerin teyin etdiyi
         * onClick metodunu cagirmaqla biz idareni veririk bu klassi istifade eleyen
         * xarici klasslara
         */

        clickListener.onClick();
    }

    private void process() {

    }

    public OnClickListener getClickListener() {
        return clickListener;
    }

    public void setClickListener(OnClickListener clickListener) {
        this.clickListener = clickListener;
    }
}
