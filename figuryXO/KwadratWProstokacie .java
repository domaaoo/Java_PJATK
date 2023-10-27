public class KwadratWProstokacie {
    public static void main(String args[]) {
        int szer_max = 5;
        int wys_max = 5;
        
        for (int wys = 1; wys <= wys_max; wys++) {
          for (int szer = 1; szer <= szer_max; szer++) {
              if (wys>=2&&wys<=4&&szer>=2&&szer<=4) {
                  System.out.print(" x ");
              } else {
                  System.out.print(" o ");
                  
              }
            }System.out.println();
        }
    
    }
}