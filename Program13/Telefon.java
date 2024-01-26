public class Telefon {
    String kolor;

    public Telefon(String kolor){
        this.kolor=kolor;
    }

    public void zadzwon(String numer){
        System.out.println("numer na który dzwonimy:"+numer);
    }

    public void wyswietlHistoriePolaczen(){
        System.out.println("brak historii. Jestesmy w klasie TELEFON");
    }
}
