import java.lang.Math;
import java.util.*;
public class Fruit {
    String name;  //to jest nasz this.name
    double weight;

    public Fruit(String imie){
        weight = (Math.random() * 0.3) + 0.5;
        //new Random().nextDouble(0.5,0.8); //drugi sposob
        name=imie;//nie trzeba pisac this bo name nie jest identyko do imie
    }
//    drugi sposob na utworzenie konstruktowa Fruit
//    public Fruit(String name){
//        weight = (Math.random() * 0.3) + 0.5;
//        this.name=name; //this tworzy sie automatycznie dla konstruktorow i metod niestatycznych
//    }

    public void show(){
        System.out.println(name+" weight:"+ weight);
    }
}
