import java.util.Scanner;
import java.lang.Math
public class Program5{
	
	public static void main(String[] args){
	//zad 1
	boolean czyPada = true;
	int x =(czyPada==true)?5:8; //jeśli czyPada równa sie true to przyppisuje do x 5, inaczej 8
	System.out.println("\n zad1: "+x);
	
	//zad2
	boolean czySwieciSlonce = false;
	System.out.println("\n zad2: ");
	if (czyPada == true && czySwieciSlonce == true){System.out.println("tecza");}
	else if(czyPada == true && czySwieciSlonce == false){System.out.println("plucha");}
	else if (czyPada == false && czySwieciSlonce == true){System.out.println("slonecznie");}
	else{System.out.println("pochmurno");}
	
	//zad3
	int a = 2;
	int b = 3;
	//(!(a<b)&&!(a>b));
	//((a>=b)&&(a<=b))
	//a==b
	System.out.println("\n zad3: "+(a==b));
	
	//zad4
	Scanner scanner = new Scanner(System.in);
	/*System.out.println("\n zad4: ");
	System.out.println("Podaj liczbe numer 1: ");
	int num1 = scanner.nextInt();
	System.out.println("Podaj liczbe numer 2: ");
	int num2 = scanner.nextInt();
	int reszta = num1%num2;
	if (reszta==0){
		System.out.println("liczba nr 2 jest calkowitym dzielnikiem liczby nr 1");
	} else {System.out.println("liczba nr 2 nie jest calkowitym dzielnikiem liczby nr 1");}
	*/
	
	//zad5
	/*
	System.out.println("Podaj kąt pierwszy trójkąta: ");
	int kat1 = scanner.nextInt();
	System.out.println("Podaj kąt drugi trójkąta:");
	int kat2 = scanner.nextInt();
	System.out.println("Podaj kąt trzeci trójkąta:");
	int kat3 = scanner.nextInt();
	if (kat1+kat2+kat3==180){
		System.out.println("Taki trojkat moze istniec");
		if ((kat1<90)&&(kat2<90)&&(kat3<90)){
			System.out.println("Trojkat ten jest ostrokatny");
		}else{System.out.println("Trojkat ten nie jest ostrokatny");}
	}else {System.out.println("Niemozliwe jest stworzenie takiego trojkata");}
	*/
	
	//zad6
	/*
	System.out.println("Podaj znak w systemie heksadecymalnym");
	char z = scanner.next().charAt(0);
	if (z>=48&&z<=57){System.out.println(z);} 
	else if (z>=97&&z<=102){
		int wynik1 = z-97+10;
		System.out.println(wynik1);}
	else if (z>=65&&z<=70){
		int wynik2 = z-65+10;
		System.out.println(wynik2);}
	else {System.out.println("nie ma takiego znaku w danym systemie");}
	*/
	
	//zad7
	/*
	System.out.println("\n Zad 7:");
	System.out.println("Podaj parametr a: ");
	double parA = scanner.nextInt();
	System.out.println("Podaj parametr b: ");
	double parB = scanner.nextInt();
	System.out.println("Podaj parametr c: ");
	double parC = scanner.nextInt();
	double delta = Math.pow(parB,2)-4*parA*parC;
	System.out.println("delta:"+delta);
	if (delta>0){
	    double x1 = (-parB-Math.pow(delta,(0.5)))/(2*parA); //tu gdy bylo 1/2 zamiast 0.5 to zaokkraglalo to calkowitych liczb wtf
	    double x2 = (-parB+Math.pow(delta,(0.5)))/(2*parA);
	    System.out.println(" x1:"+x1+" x2:"+x2);
	}else if (delta==0){
	    double x3 = -parB/(2*parA);
	    System.out.println("x3:"+x3);
	} else {System.out.println("Taka funkcja nie ma miejsc zerowych");}
	*/
	
	//zad 9 PROGRAM JEDNOZNACZNIE KLASYFIKUJACY ZBIORY
	double x = -10;
	    if (x>=10 || (x>=0&&x<=5))
	        System.out.println("C");
	        else if (x<=-15 || (x>-8&&x<=-5))
	            System.out.println("B");
	            else if (x>-3)
	                System.out.println("AC");
	                else if (x<=-13 || (x>-5 && x<-4))
	                    System.out.println("AB");
	                        else if (x<=-10)
	                            System.out.println("A");
	                                else if (x<=-8)
	                                    System.out.println("brak zbioru");
	                                        else if (x<=-3)
	                                            System.out.println("ABC");
	
}
}