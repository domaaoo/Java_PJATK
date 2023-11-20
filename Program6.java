import java.util.*;
public class Program6{
	
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	/*
	//zad 1  WCZYTUJE ZNAK I ZWRACA INFO CZY SAMOGŁOSKA CZY SPÓŁGŁOSKA
	System.out.println("\n zad1: ");
	System.out.println("Podaj znak: ");
	char ch = scanner.next().charAt(0);
	switch (ch) {
			case  'a','e','i','y','o','u': System.out.println("podany znak jest samogloska"); break;
			case 'b','c','d','f','g','h','j','k','l','m','n','p','r','s','t','w','z': System.out.println("podany znak jest spolgloska"); break;
			default: System.out.println("podana wartosc nie jest znakiem");
		}
	
	//zad2 PODAJE INFO ILE DANY MIESIAC MA DNI W DANYM ROKU
	System.out.println("Podaj liczbe odpowiadajaca ktory to miesiac: ");
	int miesiac = scanner.nextInt();
	System.out.println("Podaj liczbe odpowiadajaca ktory to rok: ");
	int rok = scanner.nextInt();
	boolean  przestepny = ((rok%400==0)||((rok%4==0)&&(rok%100!=0)));
	
	int liczbaDni=0;
	switch (miesiac) {
		case 1,3,5,7,8,10,12: liczbaDni=31; break;
		case 2: liczbaDni = (przestepny==true?29:28); break;
		case 4,6,9,11: liczbaDni=30; break;
		default :System.out.println("podana wartosc miesiaca nie miesci sie w granicach 1-12");
	}
	System.out.print("W danym roku ten misiac ma ");
	System.out.print(liczbaDni);
	System.out.print(" dni.");
	*/
	
	//zad3 WYSWIETLA LICZBY 1-10 Z POMOCA PETLI
	//for (int i=1;i<=10;i++){System.out.println(i);}
	
	//zad4  
	int wrt = 2;
	for (int i=1;i<=10;i++){int wynik=i*wrt;System.out.println(i +":"+ wynik);}
	
	//zad5 PODSTAWOWA ROZNICA MIEDZY PETLAMI WHILE I DO WHILE
	System.out.println("petla while:");
        int i = 0;
        while (i<0)
            System.out.println(i++); //tu sie ani razu petla nie wykona
        
        
        System.out.println("petla do-while:");
        int j = 0;
        do 
            System.out.println(j++); //tu sie raz petla wykona
        while (j<0);
	
	/*
	//zad 6 LICZY ILE RAZY PODANO LICZBE DOPOKI WPISZESZ 0
	//sposob 1 przy uzyciu petli do-while:
	int suma = 0;
        int ileRazy = 0;
        int liczba;
        do {
            System.out.println("Podaj liczbe:");
            liczba = scanner.nextInt();
            suma = suma + liczba;
            ileRazy = ileRazy + 1;
        }while (liczba != 0);
        System.out.println("Liczbe podano : "+ileRazy+" razy.");
        System.out.println("A ich suma wynosi: "+suma);
	
	//sposob 2 przy uzyciu petli while
	int suma = 0;
        int ileRazy = 0;
        
        while (true) {
            System.out.println("Podaj liczbe:");
            int liczba = scanner.nextInt();
            if (liczba == 0) {
                break;
            }
            suma += liczba;
            ileRazy += 1;
        }
        System.out.println("Liczbe podano : "+ileRazy+" razy.");
        System.out.println("A ich suma wynosi: "+suma);
	*/

	//zad7 TU KAZDY Z 10 PIERWSZYCH WYRAZOW MA BYC SUMA WYRAZOW POPRZEDNICH - CIAG GEOMETRYCZNY
	System.out.println("zad 7:");
	double wynik1 = 0;                        //dla sposobu 1
	double wynik2 = 0.5;                      //dla sposobu 2
	double mnoznik = 0;                       //dla sposobu 2
    	for (int i=1;i<=10;i++){
	        wynik1 += (1./Math.pow(2,i));     // to dzialanie potegowania, daje wynik double(Sposob 1). Aby zoptymalizowac program - Najlepiej bez potegi ale nadpisywac poprzedni wynik i mnozyc razy 1/2 zeby ominac ponowne wymnazanie (Sposob 2).
	        if (i==1)
	            mnoznik = 0;
	            else if (i==2)
	                mnoznik = 1./4.;
	                else
	                    mnoznik = mnoznik * 0.5;    
	        wynik2 = wynik2 + mnoznik;    
	    	System.out.println("wyraz nr."+i+" - Sposob 1:"+wynik1);
	    	System.out.println("wyraz nr."+i+" - Sposob 2:"+wynik2);}
	
	//zad8 LICZY ILE DNI MINELO OD POCZATKU ROKU DO DZIS
	int dzien = 6;                            //podaje uzytkownik
	int podajMiesiac = 11;                    //podaje uzytkownik
	int mscDoSwitcha = podajMiesiac-1;        //oblicza liczbe pelnych miesiecy
    	int dniMiesiace = 0;                      //ta zmienna przechowuje liczbe dni z pelnych miesiecy
	switch (mscDoSwitcha) {
	    case 0 : dniMiesiace = 0; break;
	    case 1 : dniMiesiace = 31; break;
	    case 2 : dniMiesiace = 59; break;
	    case 3 : dniMiesiace = 90; break;
	    case 4 : dniMiesiace = 120; break;
	    case 5 : dniMiesiace = 151; break;
	    case 6 : dniMiesiace = 181; break;
	    case 7 : dniMiesiace = 212; break;
	    case 8 : dniMiesiace = 243; break;
	    case 9 : dniMiesiace = 273; break;
	    case 10 : dniMiesiace = 304; break;
	    case 11 : dniMiesiace = 334; break;
	    default : System.out.println("nie ma tylu miesiecy");}
	    
	System.out.println("liczba dni od poczatku roku do dzisiaj: "+(dniMiesiace+dzien));

	//zad9 TABLICZKA MNOZENIA
	int kolumna = 10;
	int wiersz = 10;
	
	for (int i=1; i <= wiersz; i++){
	    for (int j = 1; j <= kolumna; j++){
	        int iloczyn = i*j;
	        if (iloczyn < 10)
	            System.out.print("   "+iloczyn);
	            else 
	                System.out.print("  "+iloczyn);
	        
	    }System.out.println("\n ");
	}

	//zad 10 WZOREK Z GWIAZDEK I SPACJI
	int kolumny = 9;
        int wiersze = 6;
        
        for (int i = 1; i <= wiersze; i++){          // wchodzimy w wiersz
            for (int j = 1; j <= kolumny; j++){      // wchodzimy w kolumne
                if (i%2!=0){                         // sprawdzamy czy wiersz nieparzysty
                    if (j%2!=0)                      // sprawdzamy czy kolumna nieparzysta
                        System.out.print("*");
                        else 
                            System.out.print(" ");
                    
                } else {                             //ta instrukcja dla wierszy parzystych
                    if (j%2!=0)                      //jesli kolumna nieparzysta
                        System.out.print(" ");
                        else 
                            System.out.print("*");
                    
                    }
            }System.out.println("");        
        }
}
}