public class DrzewoOwocowe extends DrzewoLisciaste{
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia); //TU BEZ TYPÓW ZMIENNYCH
        this.nazwaOwoca = nazwaOwoca;
    }

    public String toString(){
        return "DrzewoOwocowe{"+
                "ksztaltLiscia=" + ksztaltLiscia +
                ", wiecznieZielone=" + wiecznieZielone +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzewa='" + przekrojDrzewa +
                ", nazwa owoca='" + nazwaOwoca + '\'' +
                '}';


    }
}
