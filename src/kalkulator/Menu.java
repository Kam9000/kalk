package kalkulator;
/* *
 * Displays specific ui
 */
public class Menu {
	/* *
	 * shows main menu
	 */
	public void showMenu(){
		System.out.println("Jestes w glownym menu\n"
				+ "Prosze wybrac opcje\n"
				+ "1 to wczytywanie z konsoli\n"
				+ "2 to wczytwanie z pliku z folderu glownego projektu\n"
				+ "0 to zamkniecie kalkulatora");
	}
	/* *
	 * shows menu for console mode
	 */
	public void showMenuConsole(){
		System.out.println("Wybrano wczytywanie z konsoli\n"
				+ "Prosze wpisywac maks 3 liczby i dwa operatory pomiedzy\n"
				+ "pamietajac o zachowaniu spacji\n"
				+ "wpisanie end powoduje wyjscie");
	}
	/* *
	 * shows menu for file mode
	 */
	public void showMenuFile(){
		System.out.println("Wybrano wczytywanie z pliku\n"
				+ "Program wczyta dane z pliku plik.txt ktory znajduje sie\n"
				+ "w katalogu glownym projektu i wyjdzie");
	}

}
