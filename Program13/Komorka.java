import java.util.Arrays;
public class Komorka extends Telefon{
    String[] tabNumerow;


    public Komorka(String kolor) {
        super(kolor);
        tabNumerow = new String[10];
    }
    @Override
    public void zadzwon(String numer) {
        super.zadzwon(numer);
        dodajNumer(numer);
    }

    public void dodajNumer(String numer){
        for(int i = 0; i< tabNumerow.length; i++){
            if (tabNumerow[i]==null){   //jesli dane miejsce jest puste wpisz tam nowy numer
                tabNumerow[i]=numer;
                break;
            } else if(i == tabNumerow.length-1 && tabNumerow[i]!=null){
                System.out.println("nie ma juz miejsca w historii polaczen");
            }

        }
    }

    @Override
    public String toString() {
        return "Komorka{" +
                "tab=" + Arrays.toString(tabNumerow) +
                ", kolor='" + super.kolor + '\'' +
                '}';
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("ostatnio wybrane numery:" + Arrays.toString(tabNumerow));
    }
}

