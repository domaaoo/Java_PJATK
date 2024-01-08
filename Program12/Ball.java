import java.util.*;

public class Ball {
  double radius;           //pole obiektowe
  static int ballCounter;  //pole klasowe  //wspolne dla wszystkich obiektow klasy

  public Ball(double radius){
    this.radius=radius;
    ballCounter++;  //Inkrementacja ballCounter przy tworzeniu nowego obiektu
  }
  
  public static Ball makeBall(){    //PO CO TUTAJ METODA KLASOWA, GDY NIE MA STATIC TO TAK SAMO DZIALA 
    Random rand = new Random();
    double randomRadius = 10 + rand.nextDouble() * 10;  // Losowy promień między 10 a 20
    return new Ball(randomRadius);
  }
  
  public void showCounter(){
    System.out.println("Liczba utworzonych obiektów Ball: " + ballCounter);
  }
  
  public static void main(String[] args) {
    Ball pilka = new Ball(5.5);
    pilka.makeBall();
    pilka.makeBall();
    Ball pilka2 = new Ball(5.5);
    pilka.showCounter();       //te dwie linijki daja taki sam wynik bo jest to metoda statyczna i pole statyczne czyli wspoldzielone dla wszystkich obiektow tej klasy
    pilka2.showCounter();      //
    Ball pilka3 = new Ball(5.5);
    pilka3.showCounter();
  }
}