import java.util.Scanner;
import java.lang.Math;
public class Program8 {
    public static void main(String[] args) {
	//zad1
        //1 SPOSOB troche na okolo i recznie
        /*int[] tab1 = new int[(int)(Math.random()*10+1)];//utworzenie list o losowej wielkosci
        int[] tab2 = new int[(int)(Math.random()*10+1)];//ta +1 powoduje ze nie wylosuje sie 0 a wart 1-11
        int[] tab3 = new int[(int)(Math.random()*10+1)];
        
        System.out.println("tab1:");
        for (int i = 0;i<tab1.length;i++){              //wpisanie losowych wartosci
            tab1[i] = (int)(Math.random()*10);
            System.out.print(tab1[i]+" ");
        }
        System.out.println("\ntab2:");
        for (int i = 0;i<tab2.length;i++){
            tab2[i] = (int)(Math.random()*10);
            System.out.print(tab2[i]+" ");
        }
        System.out.println("\ntab3:");
        for (int i = 0;i<tab3.length;i++){
            tab3[i] = (int)(Math.random()*10);
            System.out.print(tab3[i]+" ");
        }
      
        int[][] Tablica = new int[][]{tab1,tab2,tab3};  //polaczenie tzrech tablic w jedna dwuwymiarowa
        System.out.println("\n");
        for (int i=0;i<Tablica.length;i++){             //dwoma petlami wyswietlamy elementy
            for (int j=0;j<Tablica[i].length;j++)
                System.out.print(Tablica[i][j]+" ");
            System.out.println("");
        }
        //2 SPOSOB  
        int[][] tablice = new int[3][];                        // Tablica dwuwymiarowa dla trzech tablic

        for (int i = 0; i < tablice.length; i++) {
            tablice[i] = new int[(int) (Math.random() * 10)]; // Losowy rozmiar tablicy
            for (int j = 0; j < tablice[i].length; j++) {
                tablice[i][j] = (int) (Math.random() * 10);   //wpisanie losowych wartosci
                System.out.print(tablice[i][j] + " ");
            }
            System.out.println(); // Nowa linia po wypisaniu każdej tablicy
        }*/
        
        
        //zad2
        /*int[][] arr = new int[3][3];               //tworzy tablice o wym 8x8
        for (int i =0;i<arr.length;i++){           //uzupelnia wartosci losowymi wart i je wyswietla
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
        
        int sumaLewejPrzekatnej = 0;
        int sumaPrawejPrzekatnej = 0;
        for (int i = 0; i < arr.length; i++) {   // Sumowanie elementów na lewej przekątnej
            sumaLewejPrzekatnej += arr[i][i];}

        for (int i = 0; i < arr.length; i++) {  // Sumowanie elementów na prawej przekątnej
            sumaPrawejPrzekatnej += arr[i][arr.length - 1 - i];}

        System.out.println("Suma elementów na lewej przekątnej: " + sumaLewejPrzekatnej);
        System.out.println("Suma elementów na prawej przekątnej: " + sumaPrawejPrzekatnej);
        */
        
	//zad3
        int[][] tab = {{1,0,0,0,0},{0,1,0,0},{0,0,1}};
        int dlugosc=0;
        for (int i=0;i<tab.length;i++)         // liczy sumaryczna dlugosc wszystkich tablic w srodku
            dlugosc+=tab[i].length;
    
        int[] tab1D = new int[dlugosc];
        int index1D=0;
        for (int i=0;i<tab.length;i++){
            for (int j = 0;j<tab[i].length;j++){
                tab1D[index1D]=tab[i][j];
                System.out.print(tab1D[index1D]+" ");
                index1D++;
            }
        }
	
	//zad4
        int wymiar =(int) (Math.random() * 5+1);
        int[][] arr4 = new int[wymiar][wymiar];             // Tablica dwuwymiarowa
        int suma = 0;
        double srednia;
        int count=0;

        for (int i = 0; i < arr4.length; i++) {            //petla do zapisania losowych wartosci,obliczenia sumy i count
            for (int j = 0; j < arr4[i].length; j++) {
                arr4[i][j] = (int) (Math.random() * 10);   //wpisanie losowych wartosci
                System.out.print(arr4[i][j] + " ");
                suma+= arr4[i][j];
                count++;
            }
            System.out.println();  
        }
        srednia=(double)suma/count;
        System.out.println("suma:"+suma+"\tcount:"+count+"\tsrednia:"+srednia);
        
        int indexSzukanyI=0;                                 //pod tymi zmiennymi zapiszemy indeksy najblizszej liczby do sredniej
        int indexSzukanyJ=0;
        double min=6;
        for (int i = 0; i < arr4.length; i++) {            //petla do znalezienia liczby najblizszej sredniej
            for (int j = 0; j < arr4[i].length; j++) {
                double roznica = arr4[i][j]-srednia;      //oblicza roznice miedzy nasza liczba a srednia
                if (roznica<0)                            //ten warunek zmienia nam ujemne na dodatnie (wart. bezwzgledna)
                    roznica*=-1;    
                System.out.println(arr4[i][j]+"  roznica:"+roznica);
                if (roznica<min){                        //ten warunek zapisuje indeks najmniejszej wartosci i sama wartosc 
                    min = roznica;
                    indexSzukanyI = i;
                    indexSzukanyJ = j;
                }  
            }
        }
        System.out.println("najblziszy index i oraz j:"+indexSzukanyI+" oraz "+indexSzukanyJ);
        System.out.println(arr4[indexSzukanyI][indexSzukanyJ]);
	
	//zad5
        int wymiar =(int) (Math.random() * 5+1);
        int[][] arr5 = new int[wymiar][wymiar];             // Tablica dwuwymiarowa
        for (int i = 0; i < arr5.length; i++) {            //petla do zapisania losowych wartosci,obliczenia sumy i count
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = (int) (Math.random() * 10);   //wpisanie losowych wartosci
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();  
        }
        
        int[] arr_MINMAX = new int[arr5.length*2];         //utworzenie nowej tablicy na min i max z kazdej kolumny
        int index_MINMAX = 0;                              //dzieki temu po kolei wpisujemy wartosci do nowej tablicy MINMAX
        int indexMIN = 0;                                  //zakladamy ze na poczatku najmniejsza jest ta o inx 0
        int indexMAX = 0;                                  //zakladamy ze na poczatku najwieksza jest ta o inx 0
        
        
        
        System.out.println();  
        for (int j=0;j<arr5.length;j++){
            for (int i = 0;i<arr5.length;i++){
                System.out.println(arr5[i][j]+" ");
                if (arr5[i][j]<arr5[indexMIN][j]){
                    indexMIN=i;
                }
                if (arr5[i][j]>arr5[indexMAX][j]){
                    indexMAX=i;
                }
                
            }
            int ileMiejsc=1;                               //ta zmienna uzyta jest do warunku by jedynie raz zapisalo wartosci w MINMAX
            while (index_MINMAX<arr_MINMAX.length && ileMiejsc==1){
                arr_MINMAX[index_MINMAX]=arr5[indexMIN][j];
                index_MINMAX++;
                arr_MINMAX[index_MINMAX]=arr5[indexMAX][j];
                index_MINMAX++;
                ileMiejsc++;
            }
            System.out.println("indexMIN: "+indexMIN);
            System.out.println("indexMAX: "+indexMAX);
        }
        for (int i = 0; i < arr_MINMAX.length; i++)
            System.out.print(arr_MINMAX[i] + " ");
      
	//zad 6
        int wymiar =(int) (Math.random() * 4+3);
        int[][] arr6 = new int[wymiar][wymiar];             // Tablica dwuwymiarowa
        for (int i = 0; i < arr6.length; i++) {            //petla do zapisania losowych wartosci
            for (int j = 0; j < arr6[i].length; j++) {
                arr6[i][j] = (int) (Math.random() * 10);   //wpisanie losowych wartosci
                System.out.print(arr6[i][j] + " ");
            }
            System.out.println();  
        }
        //Liczymy ktory wiersz ma najwieksza sume
        int sumaMaxW = 0;                                   //te zmienne aby znalezc wiersz o najwiekszej sumie
        int indexSumyMaxW = 0;
        int sumaW;

        for (int i = 0; i < arr6.length; i++) {            //petla do obliczenia sum wartosci w wierszach i znalezienie tej najwiekszej sumy
            sumaW=0;                                       //zakladamy ze najwieksze jest 0 (bo nie moze byc nic mniejsze od tego)
            for (int j = 0; j < arr6[i].length; j++) {
                sumaW+=arr6[i][j];}
            if (sumaW>sumaMaxW){
                sumaMaxW=sumaW;
                indexSumyMaxW=i;  
            }
            System.out.println("suma wiersza : "+i+" :"+sumaW);
        }
        System.out.println("suma max: "+sumaMaxW+" o indeksie: "+indexSumyMaxW);
        
        //liczymy ktora kolumna ma najmniejsza sume
        int sumaMinK = wymiar*9;                              //zakladamy ze najmniejsze jest gdy w calym wierszu same 9 (bo nie moze byc nic wiekszego od tego);schodzimy schodkami w dol                            
        int indexSumyMinK = 0;                                //te zmienne aby znalezc kolumne o najwiekszej sumie
        int sumaK;
        for (int i = 0; i < arr6.length; i++) {               //petla do obliczenia sum wartosci w kolumnach i znalezienie tej najwiekszej sumy
            sumaK = 0;                               
            for (int j = 0; j < arr6[i].length; j++) {
                sumaK+=arr6[j][i];}
            if (sumaK<sumaMinK){
                sumaMinK=sumaK;
                indexSumyMinK=i;  
            }
            System.out.println("suma kolumny : "+i+" :"+sumaK);
        }
        System.out.println("suma min: "+sumaMinK+" o indeksie: "+indexSumyMinK);
        
        //znalezienie najwiekszej wartosci w wierszu o najwiekszej sumie
        int MaxWartoscW = 0;                          //zakladamy ze najwieksza jest 0,kazda wieksza bedzie nadpisywana
        for (int j=0;j<arr6.length;j++){ 
            if (arr6[indexSumyMaxW][j]>MaxWartoscW){
                MaxWartoscW=arr6[indexSumyMaxW][j];
            }
        }
        System.out.println("W wierszu index:"+indexSumyMaxW+ " o najwiekszej sumie rownej "+sumaMaxW+" najwieksza wart to: "+MaxWartoscW);
        
        //znalezienie najmniejszej wartosci w kolumnie o najmniejszej sumie
        int MinWartoscK = 9;                          //zakladamy ze najmniejsza jest 9,kazda mniejsza bedzie nadpisywana
        for (int j=0;j<arr6.length;j++){ 
            if (arr6[j][indexSumyMinK]<MinWartoscK){
                MinWartoscK=arr6[j][indexSumyMinK];
            }
        }
        System.out.println("W kolumnie index:"+indexSumyMinK+ " o najmniejszej sumie rownej "+sumaMinK+" najmniejsza wart to: "+MinWartoscK);










    }
}
