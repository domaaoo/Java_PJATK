import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Arrays;
public class Program9 {
    public static void main(String[] args) {
        /*
        //zad1
        int[][] tab = new int[4][4];
        int[] kolumny = new int[4];
        int[] wiersze = new int[4];


        for (int  i = 0; i<tab.length;i++){
            for (int j = 0; j<tab[i].length;j++) {
                tab[i][j] = (int) (Math.random() * 9 );
                System.out.print((tab[i][j]) + " ");
                if (tab[i][j]==0){
                    kolumny[j]=1; //jedynka mowi nam w ktorej kolumnie mamy 0
                    wiersze[i]=1; //jedynka mowi nam w ktorym wierszu mamy 0
                }
            }System.out.println();
        }
        System.out.println(Arrays.toString(wiersze));   //to drukuje tablice jednowymiarowe
        System.out.println(Arrays.toString(kolumny));
        //System.out.println(Arrays.deepToString(tab)); //to drukuje tablice dwuwymiarowe
        for (int i = 0; i< wiersze.length;i++){         //iteruje po tanlicy wiersze
            if (wiersze[i]==1){                         //jesli w tablicy jest 1 to znaczy ze w tablicy w wierszu o tym indeksie jest 0
                for (int j=0;j<tab[i].length;j++)       // iteruje dla danego wiersza po kokumnach i zamienia na 0
                    tab[i][j]=0;
            }
        }
        for (int i = 0; i< kolumny.length;i++){         //iteruje po tablicy kolumny
            if (kolumny[i]==1){                         //jesli w tablicy jest 1 to znaczy ze w kolumnie o tym indeksie jest 0
                for (int j=0;j<tab[i].length;j++)       // iteruje dla danego wiersza po kokumnach i zamienia na 0
                    tab[j][i]=0;
            }
        }

        for (int  i = 0; i<tab.length;i++){            //wyswietla tablice
            for (int j = 0; j<tab[i].length;j++) {
                System.out.print((tab[i][j]) + " ");
            }System.out.println();
        }


        //zad 2
        show(10);

        //zad 3
        int wrt = 5;
        modifyValue(wrt);
        System.out.println("po wykonaniu mnozenia w metodzie midyValue: "+wrt);
        //jest tak dlatego bo w metodzie midifyValue tworzy sie duplikat i ta zmienna przemnozona dziala tylko w danej metodzie. Gdy chcemy to zmodyfikowac to trzeba nadpisac. (tak jest dla typow prostych). Wiecej na wykladzie bylo

        //zad 4
        int max = findMax(1,2,3);
        System.out.println(max);

        //zad 5
        int[] tab5 = splitToDigits(8374194);
        System.out.println(Arrays.toString(tab5));
        */


    }
    public static void show (int val){  //zad 2
        System.out.println(val);}

    public static void modifyValue (int val){  //zad 3
        System.out.println("przed przemnozeniem:"+val);   //wyswietlenie wartosci dostarczonej zmiennej
        val =val*5;
        System.out.println("po pomnozeniu:"+val);}        //wyswietlenie wartosci dostarczonej zmiennej

    public static int findMax (int val1, int val2, int val3){   //zad4
        if (val1>val2 && val1>val3)
            return val1;
            else if (val2>val1 && val2>val3)
                return val2;
                else
                    return val3;
    }

    public static int[] splitToDigits(int val){     //zad5
        int liczbaPoczatkowa = val;
        boolean czyDziala = true;
        int countMiejsca = 0;
        while (czyDziala){               //liczymy ile jest cyfr w tej liczbie
            int reszta = val/10;
            if (reszta<1)
                czyDziala=false;
                else
                    countMiejsca++;
            val=reszta;
        }
        int index = countMiejsca;
        int[] tablicaNowa = new int[countMiejsca+1];
        boolean czyOk = true;
        while(czyOk){
            int wartosc = liczbaPoczatkowa%10;
            tablicaNowa[index] = wartosc;
            index--;
            liczbaPoczatkowa=liczbaPoczatkowa/10;
            if (index == -1)
                czyOk = false;
        }
        return tablicaNowa;
        }
    }

