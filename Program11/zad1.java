class zad1 {
    public static void main(String[] args) {
        //zad1
        System.out.println("Promien kola to: "+ MathOperations.calculateCircleArea(30));

        //zad2
        Person person = new Person();//brak konstruktora wiec domyslnie tworzy sie ten bezargumentowy

        person.birthyear = 2000;
        person.name = "Dominika";
        person.surname = "Bujanowicz";

        person.show(); //nie wolno printa bo jest to metoda bezrezultatowa i nie ma wartosci ktora mozna wysietlic
        System.out.println(person); //tu mamy zmienna zlozona wiec po wydrukowaniu mamy referencje

        //zad3
        Fruit fruit = new Fruit("jablko");
        fruit.show();

        //zad 4
        Kwadrat kwa = new Kwadrat(10);
        System.out.println(kwa.bok());  //utworzylismy nowa metode ktora wyswietla nam wartosc boku bo do samej private wart nie mamy dostepu
        //System.out.println(kwa.bok);  nie da sie wyswietlic samej wartosci private bok
        kwa.show();

        //zad 5
        Walec walec = new Walec(471,10); //promien tu powinien byc 3.524
        walec.Show();
    }
}
