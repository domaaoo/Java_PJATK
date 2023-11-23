import java.lang.Math;
public class ProgramPowtorzenie{
	public static void main(String[] args){
//zad 1 KOMPAS
	int deg = (int) (Math.random()*360);
      	System.out.println("deg: " + deg);
      	if (deg == 0)
      	  System.out.println("Wylosowany kierunek swiata to polnoc.");
      	  else if (deg<90)
       	     System.out.println("Wylosowany kierunek swiata to polnocny-wschod.");
       	     else if (deg==90)
         	System.out.println("Wylosowany kierunek swiata to wschod.");
                else if (deg<180)
                    System.out.println("Wylosowany kierunek swiata to poludniowy-wschod.");
                    else if (deg==180)
                        System.out.println("Wylosowany kierunek swiata to poludnie.");
                        else if (deg<270)
                            System.out.println("Wylosowany kierunek swiata to poludniowy-zachod.");
                            else if (deg==270)
                                System.out.println("Wylosowany kierunek swiata to zachod.");
                                else
                                    System.out.println("Wylosowany kierunek swiata to polnocny zachod.");



//zad2 JEDNOZNACZNIE ZDEFINIOWANY ZBIOR LICZB
double x = 2.5;
      if (x>6)
        System.out.println("C");
        else if (x<0)
            System.out.println("A");
            else if (x<1||x>5)
                System.out.println("AC");
                else if (x<2)
                    System.out.println("ABC");
                    else if (x<=3)
                        System.out.println("B");
                        else if (x<4)
                           System.out.println("AB");
                           else if (x<=5)
                            System.out.println("A");


//zad3
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wsp X lewego gornego wierzcholka: ");
        int wspXwie = scanner.nextInt();
        System.out.println("podaj wsp Y lewego gornego wierzcholka: ");
        int wspYwie = scanner.nextInt();
        System.out.println("podaj szerokosc twojego prostokata: ");
        int szer = scanner.nextInt();
        System.out.println("podaj wysokosc twojego prostokata: ");
        int wys = scanner.nextInt();
        
        System.out.println("podaj wsp X punktu, który sprwadze czy jest w prostokacie: ");
        int wspXpunktu = scanner.nextInt();
        System.out.println("podaj wsp Y punktu, który sprwadze czy jest w prostokacie: ");
        int wspYpunktu = scanner.nextInt();
        
        if (wspXpunktu>=wspXwie&&wspXpunktu<=(wspXwie+szer)&&wspYpunktu<=wspYwie&&wspYpunktu>=(wspYwie-wys)){
            System.out.println("Hurra! Podany punkt znjaduje sie w prostokacie");
        }else System.out.println("Niestety! Podany punkt nie znajduje sie w prostokacie");
      

//zad5  PO PODANIU KWOTY WYLICZA ILE BANKNOTOW LUB MONET I JAKCH MUSISZ DAC
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    Scanner scanner =  new Scanner(System.in);
	    double kwota = scanner.nextDouble();
	    System.out.println("Twoja kwota to: "+ kwota);
	    //double[] tablica = {100, 50};
        double[] tablica = {500,200,100,50,20,10,5, 2, 1,0.5,0.2,0.05};
        for (double elem : tablica){
            int podzielnik = (int) (kwota/elem);
            kwota=kwota-podzielnik*elem;
            if (podzielnik!=0){
                if (elem==0.5||elem==0.2){
                    System.out.println(podzielnik +" * "+(int)(elem*100)+" gr");
                }else if (elem==0.05){
                    System.out.println(podzielnik +" * "+(int)(elem*1000)+" gr");
                }else
                System.out.println(podzielnik +" * "+(int)(elem)+" zł");
            }
        }
	}
}



//zad 10 KLEPSYDRA
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt(); // szerokosc podstawy klepsydry

        for (int i = 0; i < n; i++) {               // Górna połowa klepsydry                      //tu od zera zeby narysowac n wierszy do momentu jednej gwiazdki
            for (int j = 0; j < i; j++)             // Dodaje spacje przed gwiazdkami              // jesli kolumna jest mniejsza od wiersza
                System.out.print(" "); 
                
            for (int k = 0; k < n - i; k++)        // Dodaj gwiazdki, malejąc od góry do środka    // jesli wczesniejsza petla nie narysowala nic czyli juz nie powinno byc spacji to zaczyna rysowac gwiazdki do momentu gdy k<n-1 - wtedy zmiana wiersza
                System.out.print("* ");
                
            System.out.println();
        }

        for (int i = 1; i < n; i++) {              // Dolna połowa klepsydry                      //tu od 1 zeby narysowac n-1 wierszy od momentu dolnych dwoch gwiazdek
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");

            for (int k = 0; k <= i; k++) 
                System.out.print("* ");
            
            System.out.println();
        }
    }
}



//zad 11  WYSWIETLA 10 PIERWSZYCH LICZB PIERWSZYCH
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int licznik = 0;
        boolean CzyPierwsza = true;
        int liczba;
        for (liczba = 2;licznik < 10; liczba++){
            for (int dzielnik = 2; dzielnik<=Math.sqrt(liczba); dzielnik++){
                if (liczba%dzielnik==0) {
                    //System.out.println("liczba " + liczba + "nie jest liczba pierwsza");
                    CzyPierwsza = false;
                    break;
                }
            }
            if (CzyPierwsza==true){
                System.out.println(liczba);
                licznik++;
            } else CzyPierwsza=true;
        }
    }
}


//zad 12   LOSUJE LICZBE I ZWRACA INFO CZY JEST W ZADANYM PRZEDZIALE, JESLI TAK TO KONIEC
import java.util.*;
public class Main{
	public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj początek przedziału liczbowego (<100): ");
		int pocz = scanner.nextInt();
		System.out.println("Podaj koniec przedziału liczbowego (<100): ");
		int koniec = scanner.nextInt();
		int count = 0;
		boolean czyDziala = true;
		while (czyDziala){
		    Random random = new Random();
		    //int los = random.nextInt(koniec-pocz+1)+pocz// to losuje liczbe z przedzialu podanego od uzytkownika
		    int los = random.nextInt(101);
		    if (los<pocz||los>koniec){
		        System.out.println("Wylosowana liczba to "+los+" i znajduje sie poza sprecyzowanym przedzialem."+"Przedzial to: "+pocz+":"+koniec);
		        count++;
		    }else{
		        System.out.println("Wylosowana liczba to "+los+" i zawarta jest w przedziale.Koniec programu."+"Przedzial to: "+pocz+":"+koniec);
		        czyDziala = false;
		        count++;
		    }
		        
		}System.out.println("Zalosowano tyle razy: "+count);
	}
}






	}
}
