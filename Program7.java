import java.util.Scanner;
import java.lang.Math;
public class Program7 {
    public static void main(String[] args) {

        //zad1
        double[] tab= new double[10];  //utworzenie tablicy
        for (int i=0; i<tab.length;i++){
            double ran = Math.random()*10;//nadpisanie zera wartoscia randomowa
            tab[i]=ran;
        }
        System.out.print("[");//wydrukowanie tablicy
        for (int i=0; i<tab.length;i++)
            System.out.print(tab[i]+" ");
        System.out.println("]");

        System.out.print("Wartosci o indeksie parzystym: ");
        for (int i=0; i<tab.length;i++)
            if (i % 2 == 0)
                System.out.print(tab[i] + " ");
        System.out.println(" ");

        System.out.print("Wartosci tablicy w int nieparzyste: ");
        for (int i=0; i<tab.length;i++){
            if (((int)(tab[i]))%2==0)
                System.out.print((int)(tab[i])+" ");
        }

        //zad2
        System.out.println("");
        System.out.println("zad2:");
        boolean[] tab2= new boolean[10];  //utworzenie tablicy
        int countFalse =0;
        int countTrue = 0;
        for (int i=0; i<tab.length;i++){
            tab2[i]= Math.random()<0.5?true:false;
            if (tab2[i]==true) countTrue++;
            else countFalse++;
            System.out.print(tab2[i]+" ");
        }System.out.println(" ");
        //System.out.println("True wystepuje tyle razy:"+countTrue);
        //System.out.println("False wystepuje tyle razy:"+countFalse);
        boolean[] tabFalse= new boolean[countFalse];  //utworzenie tablicy FALSE
        boolean[] tabTrue= new boolean[countTrue];  //utworzenie tablicy TRUE
        for (int i=0; i<tabTrue.length;i++){
            tabTrue[i]=true;
            System.out.print(tabTrue[i]+" ");
        }
	
	//zad3
	int[] tab = {1,2,3,4,5,5,5,4,3,2,1};
        int dlugosc = tab.length;
        int polowa = tab.length/2; //tu musialam utworzyc zmienna bo w petli zamieniala sie ta ost wartosc
        boolean CzyTakieSame = false;
        
        for (int i=0;i<polowa;i++){
            if (tab[i]==tab[dlugosc-1]){
                CzyTakieSame = true;
                System.out.println(tab[i]+" "+tab[dlugosc-1]);
                dlugosc--;}
                
            else{
                CzyTakieSame = false;
                System.out.println(tab[i]+" "+tab[dlugosc-1]);
                break;
            }
                
        }System.out.println(CzyTakieSame);

	//zad4
	char[] tab = new char[5];
        for (int i=0;i<tab.length;i++){           //losuje liczbe ktora potem zamieniam na znak i wstawiam do tab
            double random = Math.random()*26+65.; //mnozenie daje wart 0-25 a plus podnosi przedzial 65-90
            int intiger = (int)random;
            tab[i] = (char) intiger;
            System.out.print(tab[i]+" ");
        }
        Scanner scanner = new Scanner(System.in);
        int iloscZer=0;
        boolean czyDalej = true;
        while(czyDalej){                               //petla ktora nowo podane znaki zlicza i zamienia na 0
            System.out.print(" Podaj znak A-Z: ");
            char wart = scanner.next().charAt(0);
            int countWystZnaku = 0;
            for (int i=0;i<tab.length;i++){
                if (tab[i]==wart){
                  countWystZnaku++;
                  tab[i]='0';
                }
             System.out.print(tab[i]+" ");
            }
            System.out.println("Ten znak wystepuje: "+countWystZnaku+" razy.");
            iloscZer=iloscZer+countWystZnaku;                 //na podstawie tego przerywa petle zlicza czy juz wszedzie sa zera
            if (iloscZer==tab.length)
                czyDalej=false;
        }
        System.out.print("[");
        for (int i=0;i<tab.length;i++)
            System.out.print(tab[i]+" ");
        System.out.print("] Hurra koniec programu!");

	//zad5
	int[] tab = new int[10];
       int liczby = 1;
       for(int i=0;i<tab.length;i++){         //tworzy tablice po kolei 0-9
            tab[i] = i;
            System.out.print(tab[i]+" ");}
       
       for(int i=0;i<tab.length;i++){ //petla ktora ma na celu pomieszanie elementow tablicy. losuje 2 indeksy i zamienia je miejscami
           int random1 = (int)(java.lang.Math.random()*10);
           int random2 = (int)(java.lang.Math.random()*10);
           if (random1!=2){
               int tmp = tab[random1];
               tab[random1] = tab[random2];
               tab[random2] = tmp;
           }
       }
       System.out.println(" ");     
       for(int i=0;i<tab.length;i++)          //wyswietla nam pomieszana tablice
            System.out.print(tab[i]+" ");

        System.out.println();    
        for (int i = 0;i<tab.length;i++){     //tworzy obrazek z gwiazdkami w odpowiednich wierszach
            for (int j = 0;j<tab.length;j++){
                if (tab[j]==i)
                    System.out.print("* ");
                else
                    System.out.print(". ");
            }System.out.println();
        }

	//zad6
	int[] arr1 = new int[3];
       int[] arr2 = new int[4];
       
       int[] arr = new int[arr1.length+arr2.length]; //tworzenie nowej tablicy o dlugosci sumy dwoch wczesniejszych
       
        for(int i=0;i<arr1.length;i++){              //losowe wart w tab 1
           arr1[i] = (int)(Math.random()*10);
           System.out.print(arr1[i]+" ");}
        System.out.println();  
        for(int i=0;i<arr2.length;i++){             //losowe wart w tab 2
           arr2[i] = (int)(Math.random()*10);
           System.out.print(arr2[i]+" ");}
       
       //PODPUNKT 1
       System.out.println();
       System.out.println("PODPUNKT 1: ");
       int indexA1 = 0;
       int indexA2 = 0;
       int indexA = 0;
       while (indexA1<arr1.length){                 //nadpisywanie wartosci dopoki jestesmy w arr1
            arr[indexA]=arr1[indexA1];
            indexA1++;
            indexA++;}
        while (indexA2<arr2.length){                //po skonczeniu elementow z arr1 zaczynamy przepisywac z arr2
            arr[indexA]=arr2[indexA2];
            indexA2++;
            indexA++;}
            
        for(int i=0;i<arr.length;i++)               //wydruk wartosci koncowych
           System.out.print(arr[i]+" ");
           
        //PODPUNKT 2
        System.out.println();
        System.out.println("PODPUNKT 2: ");
        int indexUnikat = 0;
        int[] UnikalnaTab = new int[arr.length];
        boolean CzyUnikat;
        for(int i=0;i<UnikalnaTab.length;i++)             //dlatego ustawiamy -1 bo tak domyslne 0 mieszaly sie z wylosowanymi z przedzialu 0-9
            UnikalnaTab[i] = -1;
        
        for(int i=0;i<arr.length;i++){              //bierzemy po kolei elementy z tablicy w ktorej chcemy usunac duplikaty
            CzyUnikat = true;
            for (int j=0;j<UnikalnaTab.length;j++){ //porównujemy element z kazda wartoscia w nowej tablicy z unikatami
             if  (arr[i]==UnikalnaTab[j]){
                 CzyUnikat = false;
                 break;}
            }
            if (CzyUnikat && indexUnikat<UnikalnaTab.length){ //jesli wart jest unikalna to wpisujemyw kolejne miejsce
                UnikalnaTab[indexUnikat]=arr[i];
                indexUnikat++;
            }
        }
        
               
        for(int i=0;i<UnikalnaTab.length;i++)       //wydruk wartosci koncowych natomiast tutaj mamy -1 na pustych miejscach - powinno sie je 
           System.out.print(UnikalnaTab[i]+" ");
           
        //PODPUNKT 3
        System.out.println();
        System.out.println("PODPUNKT 3: ");
        int minIndex=0;
        int maxIndex=0;
        for(int i=1;i<arr.length;i++){
            if (arr[minIndex]>arr[i])             //zakladamy ze najmniejsza jest na inx0 i porowonujemy od inx1
                minIndex=i;                       //indeks tej mniejszej nadpisujemy pod minIndex                       
            if (arr[maxIndex]<arr[i])             //zakladamy ze najwieksza jest na inx0 i porowonujemy od inx1
                maxIndex=i;                       //indeks tej wiekszej nadpisujemy pod maxIndex
        }   
        System.out.println("wartosc min:"+arr[minIndex]+" "+"|wartosc max:"+arr[maxIndex]);// tu jedynie nie rozumiem czemu wartosci -1 nie znajduje jako najmniejszej
        
        int[] tab3 = new int[arr[maxIndex]-arr[minIndex]-1];  //tworzy nowa tablice o takiej dl ile jest wartosci miedzy min i max
        for (int i=0;i<tab3.length;i++){                      //wypisuje wszystkie wartosci calkowite z przedzialu
            tab3[i]=arr[minIndex]+1;
            arr[minIndex]++;
        }
        for(int i=0;i<tab3.length;i++)       
           System.out.print(tab3[i]+" ");











    }
}
