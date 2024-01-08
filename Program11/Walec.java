public class Walec {
    private int pole;
    private int wysokosc;
    private double promien;
    private int objetosc;

    public Walec(int pole, int wysokosc){
        this.wysokosc=wysokosc;
        this.pole=pole;
    }
    double promien(){
        double h1 = (-this.wysokosc+Math.sqrt(this.wysokosc*this.wysokosc+2*Math.PI*this.pole))/(2*Math.PI);
        double h2 = (-this.wysokosc-Math.sqrt(this.wysokosc*this.wysokosc+2*Math.PI*this.pole))/(2*Math.PI);
        if(h1>0){this.promien=h1;}
        else{this.promien=h2;}
        return promien;
    }

    int objetosc(){  //ta metoda liczy dobrze ale ma zly promien
        double pr= promien();
        this.objetosc = (int)(Math.PI*pr*pr*wysokosc);
        return objetosc;
    }


    public void Show(){
        System.out.println("pole podstawy to: "+ Math.PI*promien()*promien()+" objetosc to: "+objetosc() +", promien to:"+ promien());
    }

    int getWysokosc() {  //ta metoda po to by zobaczyc wartosc boku bo bok  jest private.
        return wysokosc;
    }
    double getPromien() {return promien;}

}
