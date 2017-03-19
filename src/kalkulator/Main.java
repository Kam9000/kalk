package kalkulator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
/* *
 * Main class of the calculator it allows the user to make basic calculations
 */
public class Main {

    public static void main(String[] args){
    	boolean end =false;
		Kalk kalkulator = new Kalk();
        Menu menu = new Menu();
        Scanner keyboard1 = new Scanner(System.in);
        while (end ==false){
        	menu.showMenu();
        	int wybor = keyboard1.nextInt();
        	while (wybor>2&&wybor<0){
        		keyboard1 = new Scanner(System.in);
        		System.out.println("Nic nie wybrano");
        		wybor = keyboard1.nextInt();
            
        	}
        	switch (wybor){
        	case 1:{
        		boolean koniec= false;
        		menu.showMenuConsole();
        		while (koniec==false){
        			System.out.println("Prosze wpisac dane");
        			int liczba1 =0;
        			int liczba2 =0;
        			int ile = 0;
        			String parametr;
        			String l1;
        			String l2;
        			keyboard1 = new Scanner(System.in);
        			String linia = keyboard1.nextLine();
        			koniec = linia.endsWith( "end" );
            		StringTokenizer token = new StringTokenizer(linia);
            		ile = token.countTokens();
            		if (ile==3){
                		l1 = token.nextToken();
                		parametr = token.nextToken();
                		l2 = token.nextToken();
                		liczba1 = Integer.parseInt(l1);
                		liczba2 = Integer.parseInt(l2);
                		if (parametr.equals("+")){
            				System.out.println(" = " +kalkulator.dodawanie(liczba1, liczba2));
            			}
            			else if (parametr.equals("-")){
            				System.out.println( " = " +kalkulator.odejmowanie(liczba1, liczba2));
            			}
            			else if (parametr.equals("*")){
            				System.out.println( " = " +kalkulator.mnozenie(liczba1, liczba2));
            			}
            			else if (parametr.equals("/")){
            				System.out.println( " = " +kalkulator.dzielenie(liczba1, liczba2));
            			}
        			}
            		if ((ile>3)&&(ile%2==1)){
            			int pozostalo = 3;
                		l1 = token.nextToken();
                		parametr = token.nextToken();
                		l2 = token.nextToken();
                		liczba1 = Integer.parseInt(l1);
                		liczba2 = Integer.parseInt(l2);
                		if (parametr.equals("+")){
            				liczba1 = kalkulator.dodawanie(liczba1, liczba2);
            			}
            			else if (parametr.equals("-")){
            				liczba1 =kalkulator.odejmowanie(liczba1, liczba2);
            			}
            			else if (parametr.equals("*")){
            				liczba1 =kalkulator.mnozenie(liczba1, liczba2);
            			}
            			else if (parametr.equals("/")){
            				liczba1 =kalkulator.dzielenie(liczba1, liczba2);
            			}
                		while ( pozostalo!= ile){
                			parametr = token.nextToken();
                			l2 = token.nextToken();
                			liczba2 = Integer.parseInt(l2);
                			if (parametr.equals("+")){
                				liczba1 =kalkulator.dodawanie(liczba1, liczba2);
                			}
                			else if (parametr.equals("-")){
                				liczba1 =kalkulator.odejmowanie(liczba1, liczba2);
                			}
                			else if (parametr.equals("*")){
                				liczba1 =kalkulator.mnozenie(liczba1, liczba2);
                			}
                			else if (parametr.equals("/")){
                				liczba1 =kalkulator.dzielenie(liczba1, liczba2);
                			}
                			pozostalo=pozostalo + 2;
                		}
                		System.out.println(" = " + liczba1);
            		}
        		}
        		System.out.println("zamykanie trybu\n");
        		break;
        	}
        	case 2:{
        		menu.showMenuFile();
        		File file = new File("plik.txt");
        		Scanner scanner = null;
				try {
					scanner = new Scanner(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("nie znaleziono pliku,blad");
					break;
				}
				System.out.println("Znaleziono plik");
        		while (scanner.hasNextLine()) {
        			String linia = scanner.nextLine();
        			int liczba1 =0;
        			int liczba2 =0;
        			int ile =0;
        			String parametr;
        			String l1;
        			String l2;
        			System.out.println("Wczytana linia:\n"+linia);
        			StringTokenizer token = new StringTokenizer(linia);
        			ile = token.countTokens();
            		if (ile==3){
                		l1 = token.nextToken();
                		parametr = token.nextToken();
                		l2 = token.nextToken();
                		liczba1 = Integer.parseInt(l1);
                		liczba2 = Integer.parseInt(l2);
                		if (parametr.equals("+")){
            				System.out.println(" = " +kalkulator.dodawanie(liczba1, liczba2));
            			}
            			else if (parametr.equals("-")){
            				System.out.println( " = " +kalkulator.odejmowanie(liczba1, liczba2));
            			}
            			else if (parametr.equals("*")){
            				System.out.println( " = " +kalkulator.mnozenie(liczba1, liczba2));
            			}
            			else if (parametr.equals("/")){
            				System.out.println( " = " +kalkulator.dzielenie(liczba1, liczba2));
            			}
        			}
            		if ((ile>3)&&(ile%2==1)){
            			int pozostalo = 3;
                		l1 = token.nextToken();
                		parametr = token.nextToken();
                		l2 = token.nextToken();
                		liczba1 = Integer.parseInt(l1);
                		liczba2 = Integer.parseInt(l2);
                		if (parametr.equals("+")){
            				liczba1 = kalkulator.dodawanie(liczba1, liczba2);
            			}
            			else if (parametr.equals("-")){
            				liczba1 =kalkulator.odejmowanie(liczba1, liczba2);
            			}
            			else if (parametr.equals("*")){
            				liczba1 =kalkulator.mnozenie(liczba1, liczba2);
            			}
            			else if (parametr.equals("/")){
            				liczba1 =kalkulator.dzielenie(liczba1, liczba2);
            			}
                		while ( pozostalo!= ile){
                			parametr = token.nextToken();
                			l2 = token.nextToken();
                			liczba2 = Integer.parseInt(l2);
                			if (parametr.equals("+")){
                				liczba1 =kalkulator.dodawanie(liczba1, liczba2);
                			}
                			else if (parametr.equals("-")){
                				liczba1 =kalkulator.odejmowanie(liczba1, liczba2);
                			}
                			else if (parametr.equals("*")){
                				liczba1 =kalkulator.mnozenie(liczba1, liczba2);
                			}
                			else if (parametr.equals("/")){
                				liczba1 =kalkulator.dzielenie(liczba1, liczba2);
                			}
                			pozostalo=pozostalo + 2;
                		}
                		System.out.println(" = " + liczba1);
            		}
        		}
        		System.out.println("Skonczono wczytywanie z pliku, powrot do menu");
        		break;
        	}
        	case 0:{
        		end =true;
        		break;
        	}
        	default:
        		break;
        	}
        }
        System.out.println("Zamknieto.");
    }
}