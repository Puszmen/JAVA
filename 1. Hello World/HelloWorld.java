public class HelloWorld { //class - podstawowy "kontener naszego kodu"

	public static void main (String[] args) { 
	
	// powyższa metoda jest dostępna publicznie i może być wywołana z dowolnego miejsca poza klasą HelloWorld
	// main - jest to nazwa metody którą piszemy ZAWSZE małą literą, bez tej metody program nie odpali 
	// String[] args - ARGUMENTY metody main 
	// String - typ danych: napisy
	// [] - typ tablicowy
	// args - ogólnie przyjęta nazwa od słowa "arguments"
	
		System.out.print("Hello World !!");
		
		// System.out.print - intrukacja pozwalająca wyświetlić tekst na standardowym wyjściu
		// print() - metoda standardowej biblioteki JAVY "PrintStream"
		// ("") = wszystko co w nawiasie jest argumentem metody print
	} // blok kodu
}