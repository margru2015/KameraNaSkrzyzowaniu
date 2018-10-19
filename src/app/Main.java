package app;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		// WLASCICIELE
		Wlasciciel os1 = new Wlasciciel("Zenon", "Barszcz", 45);
		Wlasciciel os2 = new Wlasciciel("Anna", "Kowalska", 18);
		Wlasciciel os3 = new Wlasciciel("Ildefons", "Wąs", 89);
		Wlasciciel os4 = new Wlasciciel("Kasandra", "Ćwir", 12);
		Wlasciciel os5 = new Wlasciciel("Maja", "Kaczyńska", 29);
		Wlasciciel os6 = new Wlasciciel("Alfred", "Poncz", 39);
		Wlasciciel os7 = new Wlasciciel("Krzysztof", "Bąk", 29);
		
		Set<Wlasciciel> wszyscyWlasciciele = new HashSet<>();
		wszyscyWlasciciele.add(os1);
		wszyscyWlasciciele.add(os2);
		wszyscyWlasciciele.add(os3);
		wszyscyWlasciciele.add(os4);
		wszyscyWlasciciele.add(os5);
		wszyscyWlasciciele.add(os6);
		wszyscyWlasciciele.add(os7);
		
		// POJAZDY
		Pojazd ciezarowka1 = new SamochodCiezarowy("DW 103", true, 5000, "Benzyna", 30000);
		Pojazd bmw = new SamochodOsobowy("Dwr 007", true, 2000, "Ropa", 5);
		Pojazd maluch = new SamochodOsobowy("DSW 789", true, 1000, "Gaz", 3);
		Pojazd audi = new SamochodOsobowy("DW 342", true, 1500, "Benzyna", 5);
		Pojazd skoda = new SamochodOsobowy("DW 232", true, 1500, "Ropa", 5);
		Pojazd ciezarowka2 = new SamochodCiezarowy("DTR 132", true, 6000, "Benzyna", 50000);
		Pojazd ciezarowka3 = new SamochodCiezarowy("DW 93", true, 5500, "Benzyna", 40000);
		Pojazd romet = new Rower("1234", false, Typ.GORSKI);
		Pojazd jubilat = new Rower("432", false, Typ.TURYSTYCZNY);
		Pojazd giant = new Rower("342", false, Typ.KOLAZOWKA);
		
		Set<Pojazd> wszystkiePojazdy = new HashSet<>();
		wszystkiePojazdy.add(ciezarowka1);
		wszystkiePojazdy.add(bmw);
		wszystkiePojazdy.add(maluch);
		wszystkiePojazdy.add(audi);
		wszystkiePojazdy.add(skoda);
		wszystkiePojazdy.add(ciezarowka2);
		wszystkiePojazdy.add(ciezarowka3);
		wszystkiePojazdy.add(romet);
		wszystkiePojazdy.add(jubilat);
		wszystkiePojazdy.add(giant);
		
		// PRZYPISANIE OBIEKTOM WLASCICIELI
		addAll(os1, bmw);
		addAll(os2, bmw);
		addAll(os7, ciezarowka1);
		addAll(os7, ciezarowka2);
		addAll(os5, romet);
		addAll(os6, giant);
		addAll(os6, audi);
		addAll(os4, jubilat);
		addAll(os2, skoda);
		addAll(os3, ciezarowka3);
		addAll(os3, maluch);
		addAll(os7, skoda);
		addAll(os2, maluch);
		addAll(os2, giant);
		addAll(os7, maluch);
		
		// SYTUACJE NA SKRZYZOWANIU
		Set<Pojazd> sytuacja1 = new HashSet<>();
		sytuacja1.add(bmw);
		sytuacja1.add(giant);
		sytuacja1.add(maluch);
		
		Set<Pojazd> sytuacja2 = new HashSet<>();
		sytuacja2.add(ciezarowka1);
		sytuacja2.add(skoda);
		sytuacja2.add(jubilat);
		sytuacja2.add(ciezarowka3);
		
		System.out.println(zwrocWlascicieli(wszystkiePojazdy));
		
		System.out.println(sredniaPojemnosc(wszystkiePojazdy));
		
		poNumerzeRej("DW 232", wszystkiePojazdy);
		
		System.out.println(gdzieMaxPasazer(wszystkiePojazdy));
		
		System.out.println(AutoIrower(sytuacja1));
		
		System.out.println(zwrocWspolwlascicieli(sytuacja2));
		
	}
	
	// METODY
	public static void addAll(Wlasciciel w, Pojazd p) {
		p.addOwners(w);
		w.addVehicles(p);
	}
	
	// METODA 1 Program przyjmuje zbiór pojazdów i zwraca wszystkich właścicieli (bez powtórzeń*)
	public static Set<Wlasciciel> zwrocWlascicieli(Set<Pojazd> zb) {
		Set<Wlasciciel> zbiorWlascicieli = new HashSet<>();
		for (Pojazd p : zb) {
			for (Wlasciciel w : p.owners) {
				zbiorWlascicieli.add(w);
			}
		}
		return zbiorWlascicieli;
	}
	
	// METODA 2 Zwraca średnią pojemność silnika z całego zbioru pojazdów
	public static float sredniaPojemnosc(Set<Pojazd> z) {
		float average;
		int sum = 0;
		Set<Pojazd> nowyZbior = new HashSet<>();
		for (Pojazd p : z) {
			if (p.isMotor()) {
				nowyZbior.add(p);
			}
		}
		for (Pojazd p : nowyZbior) {
			sum += ((PojazdSilnikowy) p).getPojemnoscSilnika();
			
		}
		average = ((float) sum / nowyZbior.size());
		return average;
	}
	
	// METODA 3 Przyjmuje numer rejestracyjny pojazdu i drukuje pojemność, rodzaj paliwa i właściciela
	public static void poNumerzeRej(String nrRej, Set<Pojazd> zb) {
		for (Pojazd p : zb) {
			if (p.isMotor()) {
				if (p.getNrRej()
						.equals(nrRej)) {
					System.out.println(((PojazdSilnikowy) p).getPojemnoscSilnika());
					System.out.println(((PojazdSilnikowy) p).getRodzajPaliwa());
					System.out.println(((PojazdSilnikowy) p).owners);
				}
				
			}
		}
		
	}
	
	// METODA 4 Zwraca numer/numery rejestracyjny pojazdu/pojazdów z największą max liczbą pasażerów
	public static Set<String> gdzieMaxPasazer(Set<Pojazd> zb) {
		int MaxPasazer = 0;
		Set<String> zbiorek = new HashSet<>();
		for (Pojazd p : zb) {
			if (p instanceof SamochodOsobowy) {
				if (MaxPasazer < ((SamochodOsobowy) p).getMaxPasazer()) {
					MaxPasazer = ((SamochodOsobowy) p).getMaxPasazer();
				}
				
			}
			
		}
		for (Pojazd p : zb) {
			if (p instanceof SamochodOsobowy)
				if (MaxPasazer == ((SamochodOsobowy) p).getMaxPasazer()) {
					zbiorek.add(p.getNrRej());
				}
		}
		return zbiorek;
	}
	
	// METODA 5 Zwraca właścicieli pojazdów, którzy posiadają jednocześnie samochód osobowy i motocykl
	public static Set<Wlasciciel> AutoIrower(Set<Pojazd> zp) {
		Set<Wlasciciel> osobowe = new HashSet<>();
		Set<Wlasciciel> rower = new HashSet<>();
		for (Pojazd p : zp) {
			if (p instanceof Rower) {
				rower.addAll(p.owners);
			} else if (p instanceof SamochodOsobowy) {
				osobowe.addAll(p.owners);
				
			}
		}
		osobowe.retainAll(rower);
		return osobowe;
	}
	
	// METODA 6 Zwraca właścicieli, którzy współdzielą jakikolwiek pojazd
	public static Set<Wlasciciel> zwrocWspolwlascicieli(Set<Pojazd> zp) {
		Set<Wlasciciel> wspolwlasciciele = new HashSet<>();
		for (Pojazd p : zp) {
			if (p.owners.size() > 1) {
				wspolwlasciciele.addAll(p.owners);
				
			}
			
		}
		
		return wspolwlasciciele;
	}
	
}
