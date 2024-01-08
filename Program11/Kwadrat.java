public class Kwadrat {
    private int bok;



    public Kwadrat(int bok){    //ta metoda powoduje zapisanie do pola klasy naszej wartosci z konstruktora
        this.bok = bok;
        //int pole = bok*bok;  //to sie nie sprawdzilo bo nie mozna bylo wyswietlic pola. bo zostalo zainicjwane w tej metodzie wiec poza nia nie mamy tej wart
    }

    int bok() {  //ta metoda po to by zobaczyc wartosc boku bo bok  jest private.
        return bok;
    }
    int pole(){   //ta metoda zwraca nam wartosc pola
        return this.bok*this.bok;
    }

    int objetosc(){
        return this.bok*this.bok*this.bok;
    }

    public void show(){
        System.out.println("pole twojego kwadratu to:"+ pole());  //teraz tu mozna ywsietlic wartosc tego pola poprzez wywolanie metody
        System.out.println("objetosc twojego kwadratu to:"+ objetosc());
    }

}
