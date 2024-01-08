public class Dzem {
  private String smak;
  private double waga;

  public Dzem(String smak, double waga){
    this.smak=smak;
    this.waga=waga;
  }
  
  public Dzem(double waga){
    this("No name", waga);  //jeden sposob inizjalizacji pol klasy
  }
  
  public Dzem(String smak){
    this.smak=smak;         //drugi sposob inizjalizacji pol klasy
    this.waga=100.0;
  }
  
  public void wyswietl(){
    System.out.println("Smak: " + this.smak);
    System.out.println("Waga: " + this.waga + " g");
    System.out.println();
  }
  
  public static void main(String[] args) {
      Dzem dzem = new Dzem("Truskawkowy", 200.0);
      Dzem dzem2 = new Dzem(150.0);
      Dzem dzem3 = new Dzem("Śliwkowy");
      
      dzem.wyswietl();
      dzem2.wyswietl();
      dzem3.wyswietl();
    }

}



