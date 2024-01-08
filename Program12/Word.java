public class Word {
  char[] tablica;
  int dlugosc;

  public Word(){
    this.tablica = new char[100];
    this.dlugosc=0;
  }
  
  public void addChar(char znak){
    tablica[dlugosc]=znak;
    dlugosc++;
  }


  public void show(){
    for (int i=0;i<tablica.length;i++){
      System.out.print(tablica[i]+" ");
    }
  }
  
  public int length(){
    return dlugosc;
  }
  
  public static void main(String[] args) {
      Word slowo = new Word();
      slowo.addChar('D');
      slowo.addChar('O');
      slowo.addChar('M');
      slowo.addChar('A');
      slowo.show();
      int dlugoscc = slowo.length();  //trzeba nadpisac bo to metoda rezultatowa
      System.out.println();
      System.out.println(dlugoscc);
  }
}