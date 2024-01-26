// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //zad1
        Drzewo drzewko = new Drzewo(true,70,"duzy");
        System.out.println(drzewko.toString());

        //zad2
        DrzewoIglaste drzewoigla = new DrzewoIglaste(false,90,"maly",12753471,3.14);
        System.out.println(drzewoigla.toString());

        DrzewoOwocowe drzewo = new DrzewoOwocowe(true,11,"sredni",98,"jablko");
        System.out.println(drzewo.toString()); //toString wywoluje sie z klasy Drzewo owocowe, bobierzemy pod uwage typ obiektu z ktorego tworzymy

        //zad3\
        Komorka mojaKomorka = new Komorka("rozowy");
        mojaKomorka.zadzwon("123-456-789");
        mojaKomorka.zadzwon("000-000-000");
        //System.out.println(mojaKomorka.toString());

        //zad4
        Osoba ja = new Osoba("Dominika","Bujan","535131777");
        Osoba ktos = new Osoba("Dominik","Bu","535031777");
        Smartfon smart = new Smartfon("czarny");
        smart.dodajKontakt(ja);
        smart.dodajKontakt(ktos);

        //zad6
        smart.wyswietlHistoriePolaczen();
        mojaKomorka.wyswietlHistoriePolaczen();
        Telefon tel = new Telefon("zielony");
        tel.wyswietlHistoriePolaczen();

        //zad7
        Telefon[] tablica = new Telefon[3];
        tablica[0]=tel;  //obiekt klasy Telefon
        tablica[1]=smart; //obiekt klasy Smartfon
        tablica[2]=mojaKomorka; //obiekt klasy Komorka

        Osoba[] kontakty = smart.zwrocTabliceKontaktow(); // tu chce zapisac tablice kontaktow w nowej zmiennej zeby potem dzwoniac brac z stad co drugie polaczenie. Moje pytanie to czy zeby wywolac ta metode musze miec utworzony obiekt czy da sie to zrobic tworzac metode statyczna?
        for(Telefon element:tablica){  //wykonywanie at least 10 polaczen z kazdego tel
            System.out.println("\nPolaczenia dla telefonu "+element.kolor);
            int indexKontakty=0;
            for(int i=1;i<=10;i++) {
                if(((i % 2) == 0) && (kontakty[indexKontakty] != null)){
                    element.zadzwon(kontakty[indexKontakty].numer);
                    indexKontakty++;
                }else {element.zadzwon("123456789");}
            }
        }
        
        System.out.println("\n HISTORIE POLACZEN:");
        for(Telefon element:tablica){
            System.out.println("\t"+element.kolor);
            element.wyswietlHistoriePolaczen();
        }

    }
}