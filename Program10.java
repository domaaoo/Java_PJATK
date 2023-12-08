import java.util.Arrays;
public class MyClass {
    public static void main(String[] args) {
        //zad 1
        int[][] tablicaA = {
            {4, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        int[][] tablicaB = {
            {4, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
        System.out.println(Arrays.deepToString(tablicaA));
        System.out.println(Arrays.deepToString(tablicaB));
        jestRowna(tablicaA,tablicaB);
        
        //zad2
        int[][] doDruku = calculateSquares(10, 10, 1);
        System.out.println(Arrays.deepToString(doDruku));
        
        //zad3 i 4
        System.out.println(NWD_it(12,18));     // wywolanie wersji iteracyjnej vol1.
        System.out.println(NWD_it2(12,18));    // wywolanie wersji iteracyjnej vol2.
        System.out.println(NWD_rek(12,18));    // wywolanie wersji rekurencyjnej vol1.
        System.out.println(NWD_rek2(12,18));    // wywolanie wersji rekurencyjnej vol2.
        
        //zad5
        int[] array = {3, 7, 101, 9, 12, 2, 100};
        int startIndex = 2;
        System.out.println(Arrays.toString(array));
        int maxElement = maxElem(array, startIndex);
        System.out.println("Najwiekszy element z podanej tabeli to: "+maxElement);
    }
    public static void jestRowna (int [][] tabA,int[][] tabB){        //zad 1
        boolean war1 = false;   //warunkuje czy maja takie same wymiary
        boolean war2 = true;   //warunkuje drugi warunek z zadania

        if (tabA.length == tabB.length) {  //sprawdza czy maja takie same wymiary w pierwszym wymiarze
            war1 = true;
            for (int i =0; i<tabA.length;i++){  //sprawdza czy maja takie same wymiary w drugim wymiarze
                if (tabA[i].length != tabB[i].length)
                    war1 = false;
                for (int j =0;j<tabA[i].length; j++){  //sprawdza drugi warunek czy wszystkie wartosci sa takie same
                    if (tabA[i][j]!=tabB[i][j]){
                        war2 = false;
                        System.out.println("wartosc"+tabA[i][j]+"jest inna");
                        
                    }
                }
            }
            
        }
        if (war1==true && war2==true)
            System.out.println("true");
            else System.out.println("false");
    }
    public static int[][] calculateSquares(int screenWidth, int screenHeight, int side){   //zad2
        int iloscSzer = screenWidth/side;
        int iloscWys = screenHeight/side;
        int iloscKwadratow = iloscSzer*iloscWys;
        int[][] Wsp = new int[iloscKwadratow][2];
        
        int X = 0;
        int Y = 0;
        for (int i = 0;i<iloscKwadratow;i++){
            for (int j=0;j<1;j++){   //dla tablicy i uzupelnia wspolrzedne X i Y w dwoch elementach
                
                Wsp[i][j]=X;
                Wsp[i][j+1]=Y;
                X+=side;
                
                if (X>=(screenWidth)){  // jeśli X wyjdzie poza szerokosc ekranu to zmieniamy na kolejny rząd kwadratow czyli o side w dol
                    Y-=side;
                    X=0;
                }
            }
        }
        return (Wsp);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //REKURENCJA
    public static int NWD_it (int var1, int var2){    //zad 3   //sposob iteracyjny vol1.
        while (var1!=var2){
            if (var1>var2)
                var1=var1-var2;    //od wiekszej odejmujemy mniejsza i nadpisujemy
            else 
                var2=var2-var1;
        }
        return (var1);            //niewazne ktora z tych wartosci drukujesz bo obydwie sa takie same
    }
    
    public static int NWD_it2 (int a, int b){       //zad 3   //sposob iteracyjny vol2.
        while (b!=0){
            int reszta = a%b;
            a=b;
            b=reszta;
        }
        return (a);              
    }
    
    public static int NWD_rek (int a, int b){       //zad 4   //sposob rekurencyjny vol1.
        if (a==b){
            return (a);
        }
        else if(a>b){
            return (NWD_rek (a-b, b));
        }
        else
            return (NWD_rek (a, b-a)); 
    }
    
    public static int NWD_rek2 (int a, int b){       //zad 4   //sposob rekurencyjny vol2.
        if (b==0){
            return(a);
        }
        return (NWD_rek2 (b, a%b));              
    }
    
    public static int maxElem(int[] arr, int from){  //zad5
        int max = 0;
        if (from<arr.length){
            int dlaFrom = arr[from];
            System.out.println("->przed rekurencja: "+dlaFrom);
            int fromPlus = maxElem(arr, from+1);
            System.out.println("<- po rekurencji: "+dlaFrom+"  "+fromPlus);
            if (dlaFrom>fromPlus)
                max = dlaFrom;
            else 
                max = fromPlus;
    }
    return max;}
}