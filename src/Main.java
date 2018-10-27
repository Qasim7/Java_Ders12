import android.Button;
import game.*;
import android.OnClickListener;
import shapes.Circle;
import shapes.Square;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Ashagida dersde kecdiyimiz prinsiplerin izahi 3 funskiyada verilib
        // istenilen funksiyani uncomment edib ishlemesine baxa bilersiz


        // interfeyslerin_demonstrasiyasi();

        // polimorfizm_Ve_Abstrakt_Klasslarin_Demonstrasiyasi();

        // android_uzerinde_interface_demonstrasiyasi();

    }

    private static void polimorfizm_Ve_Abstrakt_Klasslarin_Demonstrasiyasi() {
        /**
         * Ashagida ki klasslarin her ikisi shape classini extend edir
         * Shape classi ise abstrakt oldugu ucun daxilinde calculateArea()
         * functionunu teyin edib lakin icra etmeyib. Biz hemcinin shape classinda
         * print functionunu teyin etmishik. Bu function toreme classlarda icra olan
         * calculateArea() metodunu cagirir ve cap edir. Circle ve Square classlari
         * abstrakt olmadigi ucun mecbur calculateArea() functionunu icra ediller ve
         * her biri ozune mexsus shekilde saheni hesablayirlar.
         */
        Circle circle = new Circle(3);
        Square square = new Square(4);

        circle.print();
        square.print();
    }

    private static void interfeyslerin_demonstrasiyasi() {
        /**
         * Ashagida ki klasslarin her biri PhysicalObject Classini extend edir.
         * Bu onlara fiziki ceki (mass), en, uzunlug ve s. xususiyetlerini elave edir
         * Transport klassina yer deyishme xususiyetini (move) elave etmek ucun biz interface
         * yaratdiq (Moveable) ve onu Transport klassin daxilinde icra etdik. Hemcinin eyni interfaci
         * biz human klassinda-da icra etdik. Bele olduqda hem Human hemde Transport "move" xususiyetine
         * malikdiler. Elave olaraq biz Fish klassina Swimmable xusisyetini verdik, (bununla o uze ve suya
         * bata bilir). Eyni xususiyeti biz Human klassada mexsus etdik. Belelikle Human klassi PhysicalObject
         * CLASSINDAN toreme CLASSdir ve MOVEABLE birde SWIMMABLE interfeysleri icra edir.
         */
        Human human = new Human();
        Transport mercedes = new Transport();
        Fish fish = new Fish();

        // Ashagida ki setrlerin hamisi true gosterir
        System.out.println(mercedes instanceof Moveable);
        System.out.println(mercedes instanceof Transport);
        System.out.println(human instanceof Swimmable);
        System.out.println(human instanceof Moveable);
        System.out.println(human instanceof PhysicalObject);

        //Human ve Transport klasslari Moveable interfeysini icra etdiyi ucun biz
        //bu klasslarin obyektlerini Moveable arrayin daxilinde yiga bilerik
        //cunki hem Human hemde Transport Moveable interfeysin instance-dir
        Moveable[] moveables = new Moveable[]{human, mercedes};

        //Human ve Fish klasslari Swimmable interfeysini icra etdiyi ucun biz
        //bu klasslarin obyektlerini Swimmable arrayin daxilinde yiga bilerik
        //cunki hem Human hemde Fish Swimmable interfeysin instance-dir
        Swimmable[] swimmables = new Swimmable[]{human, fish};


        /**
         * Burada artiq bize maraqli deil bu arrayin daxilinde hansi klasslardir
         * biz bilirik ki butun moveable icra eden klasslarda move() funskiyasi
         * icra olunub. Bu sebebden biz move() funskiyasini eminlikle cagira bilerik.
         * Transport klassinda bu transporta mexsus qaydada icra olunub, insandada ozune mexsus
         */
        for (int i = 0; i < moveables.length; i++)
            moveables[i].move();


        for (int i = 0; i < swimmables.length; i++)
            swimmables[i].swim();

        /**
         * Burada biz ixtiyari Swimmable interfeysini icra eden obyekt yaratmaq isteyirik.
         * Bunun ucun biz new Swimmable() istifade etdikde avtomatik olaraq anonim klass yaranir
         * ve bu klassin daxilinde artiq icra olunmaga vacib olan metodlarin bodylerini yaziriq
         * Bundan sonra biz rahatliqla obyektimizin metodlarini lazim olan yerde istifade ede bilerik
         */
        Swimmable herHansiBirUzeBilenObyekt = new Swimmable() {
            @Override
            public void swim() {
                System.out.println("Uzurem");
            }

            @Override
            public void suyaBat() {
                System.out.println("Suya batdim");
            }
        };

        herHansiBirUzeBilenObyekt.swim();
        herHansiBirUzeBilenObyekt.suyaBat();
    }

    private static void android_uzerinde_interface_demonstrasiyasi() {
        /**
         * Ashagida biz yeniden anonym class ile OnClickListener interfeysini icra edirik
         * Bir defe bunu login buttona click etdikde,
         * digeri ise register duymesine click etdikde ne bash vereceyini teyin etmek ucun
         * icra edirik
         */
        OnClickListener onLoginClickListener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Login etmeye calish");
            }
        };

        OnClickListener onRegisterClickListener = new OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("Istifadecini register ele");
            }
        };

        Button loginButton = new Button();
        loginButton.setClickListener(onLoginClickListener);

        Button registerButton = new Button();
        registerButton.setClickListener(onRegisterClickListener);

        while (true) {
            System.out.println("Ekranda 2 buttoniviz var: login ve register");
            System.out.println("Login-e click etmek ucun 1 daxil edin, register-e click etmek ucun 2");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();

            if (input == 1) {
                loginButton.userClick();
            } else {
                registerButton.userClick();
            }
        }
    }
}
