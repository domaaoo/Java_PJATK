import java.time.LocalDate;  //aby uzyskac obecny rok part.1

public class Osoba {
  private String Imie;
  private int rokUrodzenia;
  
  public Osoba(String Imie, int rokUrodzenia){
    this.Imie=Imie;
    this.rokUrodzenia=rokUrodzenia;}
  
  public Osoba(String Imie){
    this.Imie=Imie;
    this.rokUrodzenia=1990;}
    
  public String zwrocImie(){return Imie;}
  
  public int zwrocWiek(){
    LocalDate currentDate = LocalDate.now();   //aby uzyskac obecny rok part.2
    int x = currentDate.getYear()-rokUrodzenia;
    return x;
  }
  
  public static String zwrocStarszaOsobe(Osoba osoba1, Osoba osoba2){
    if(osoba1.zwrocWiek()>osoba2.zwrocWiek()){
      return osoba1.zwrocImie();
    }else{
      return osoba2.zwrocImie();
    }
  }
  
  public static String zwrocNajstarszaOsobe(Osoba[] tab){
    String najstarszaOsoba="";
    int najstarszyWiek=0; //zakladamy ze nastarsza osoba ma 0 lat zeby kolejno nadpisywac
    for (int i=0;i<tab.length;i++){
      if(tab[i].zwrocWiek()>najstarszyWiek){
        najstarszyWiek=tab[i].zwrocWiek();
        najstarszaOsoba=tab[i].zwrocImie();
      }
    }
    return najstarszaOsoba;
  }
  
  public static void main(String[] args) {
    Osoba ja = new Osoba("Dominika",2000);  
    int mojWiek = ja.zwrocWiek();
    System.out.println("Wiek dla osoby 'ja' to: "+mojWiek);            //czy dziala wywolanie metody zwrocWiek
    Osoba mateusz = new Osoba("Mateusz",1999);
    
    //metoda ktoStarszy
    String ktoStarszy = zwrocStarszaOsobe(ja,mateusz);    
    //String ktoStarszy = zwrocStarszaOsobe(ja,new Osoba("Maciej",1998));  //mozna nawet tak zapisac argumenty
    System.out.println("Starszy sposrod tych 2 osob jest: "+ktoStarszy); 
    
    //metoda kto najstarszy 
    Osoba[] osoby = new Osoba[3];
    osoby[0] = new Osoba("Anna", 1970);
    osoby[1] = new Osoba("Bartek", 1985);
    osoby[2] = new Osoba("Cezary", 2000);
    String ktoNajstarszy = zwrocNajstarszaOsobe(osoby);
    System.out.println("Najstarszy z tych wszystkich osob jest: "+ktoNajstarszy);
    
  }
}