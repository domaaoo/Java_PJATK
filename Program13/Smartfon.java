import java.util.Arrays;

public class Smartfon extends Komorka{
    Osoba[] tabKontaktow;

    public Smartfon(String kolor) {
        super(kolor);
        tabKontaktow = new Osoba[10];
    }

    public void dodajKontakt(Osoba osoba){
        for (int i=0;i<tabKontaktow.length;i++){
            if (tabKontaktow[i]==null){
                tabKontaktow[i]=osoba;
                break;
            }
        }
    }

    public Osoba[] zwrocTabliceKontaktow(){return tabKontaktow;}

    public void wyswietlHistoriePolaczen() {
        for (int i=0;i<tabKontaktow.length;i++){
            if (tabKontaktow[i]==null)continue;
            System.out.println();
            System.out.print(tabKontaktow[i].imie+" ");
            System.out.print(tabKontaktow[i].nazwisko+" ");
            System.out.println(tabKontaktow[i].numer);
        }
    }

}
