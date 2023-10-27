public class ProstokątPrzekatna {
    public static void main(String args[]) {
        int szer_max = 5;
        int wys_max = 5;
        
        for (int wys = 1; wys <= wys_max; wys++) {
          for (int szer = 1; szer <= szer_max; szer++) {
              if (wys==szer) {
                  System.out.print(" x ");
              } else {System.out.print(" o ");}
            }
            System.out.println("liczba kolumn przekroczona więc koniec tego wiersza");
        }
    }
    
}
