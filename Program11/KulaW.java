public class KulaW {
    double promien;

    public KulaW(Kwadrat kwadrat){
        this.promien=kwadrat.bok()/2.0;
    }

    public KulaW(Walec walec){
        if (walec.getWysokosc()<walec.getPromien()*2){  //to sprawdza czy wysokosc jest wieksza od srednicy podstawy walca czyli czy kula bedzie dotykala bokow czy podstaw
            this.promien=walec.getWysokosc()/2.0;}
        else{
            this.promien=walec.getPromien();
        }
    }
}
