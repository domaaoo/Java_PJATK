public class Program4{
	
	public static void main(String[] args){
		//1.
		System.out.println("4/3:"+(4/3));
		System.out.println("4/3:"+(4/3d));
		//2.
		System.out.println("Mój numer studenta w heksadecymalnym to 29814, a w binarnym to:"+0b0010_1001_1000_0001_0100);
		//3.
		int x = 5;
		System.out.println((x=4)*x);
		//4.
		int y = (((1+2*3+4)/(5-6))+78)/(9-10/11);
		System.out.println("1+2*3+4\n-------- + 78\n  5-6   \n--------------- ="+y +"\n     10\n 9- -----\n     11");
		System.out.println("Wynik w int:");
		System.out.println((((1+2*3+4)/(5-6))+78)/(9-10/11));
		System.out.println("Wynik w double:");
		System.out.println((((1+2*3+4d)/(5-6))+78)/(9-10d/11));
		//5.
		System.out.println("'a'+2:"+('a'+2));
		System.out.println("'a'+'2':"+('a'+'2'));
		System.out.println("(char)('a'+2):"+((char)('a'+2)));
		System.out.println("ppj"+'a'+'\t'+'2'); //idąc od lewej jest string więc reszta zamieniana jest na string 
		System.out.println('a'+'2'+"ppj"); // idziemy od lewej i wykonujemy dzialania na znakach jako int a potem mamy int +String więc int zmaieniany jest na String
		//6.
		int a = 10, b = 5, c = 1, res;
		res = a - ++c - ++b;
		System.out.println("Wynik: "+res);
		//7.
		System.out.println("\nCwiczenie VII");
		System.out.println("opcja 1");
		char z = 'a';
		z+=1;
		System.out.println(z);
		
		System.out.println("\nopcja 2");
		char zz = 'a';
		zz++;
		System.out.println(zz);
		
		//System.out.println("\nopcja 3");
		//char zzz = 'a';
		//zzz=zzz+1;
		//System.out.println(zzz);
		//^ to jest zły zapis bo zzz jest jako char a 1 jako int więc zgodnie z tabelką z zajęć na co zmieniamy staje sie to intem
		//...i nie da sie przypisać int do char bo to inne typy więc wyskakuje błąd. 
		//INNE PRZYKLADY ZAWIERAJĄ UKRYTĄ ZMIANE TYPU DZIĘKI UZYCIU SYMBOLI += ORAZ ++
		
		System.out.println("\nopcja 4");
		char zzzz = 'a';
		zzzz=(char)(z+1);
		System.out.println(zzzz);
		//8.
		double x = 1, d = 1e-16, y = x + d; //W tej linii kodu deklarowane są trzy zmienne typu double(x jest inicjowane wartością 1;d jest inicjowane wartością 1e-16, 
		//co oznacza 1 razy 10 do potęgi -16, czyli bardzo małą liczbą zmiennoprzecinkową, y jest inicjowane jako suma x i d.
		System.out.println(d > 0); //porównanie d do 0. Wartość d jest bardzo mała, ale nadal dodatnia (większa od zera), więc wynik to true
		System.out.println(x < y); //porównanie x do y. Wartość y jest większa niż x, więc wynik to true.
		System.out.println(x == y); //porównanie x do y. Mimo że x i y różnią się bardzo małą wartością d, wynik tego porównania może być nieprzewidywalny ze względu na ograniczenia reprezentacji liczb zmiennoprzecinkowych w komputerze
		System.out.println(x > y); //porównania zmiennej x do y. Wartość x jest mniejsza niż y, więc wynik to false.
		
		

	}
}