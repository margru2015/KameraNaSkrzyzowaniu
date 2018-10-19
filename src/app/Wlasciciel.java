package app;

import java.util.HashSet;
import java.util.Set;

public class Wlasciciel {
	
	private String	imie;
	private String	nazwisko;
	private int		wiek;
	Set<Pojazd>		zbiorPojazdow	= new HashSet<>();
	
	public Wlasciciel() {
		
	}
	
	public Wlasciciel(String imie, String nazwisko, int wiek) {
		setImie(imie);
		setNazwisko(nazwisko);
		setWiek(wiek);
	}
	
	public String getImie() {
		return imie;
	}
	
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public String getNazwisko() {
		return nazwisko;
	}
	
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public int getWiek() {
		return wiek;
	}
	
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	
	public void addVehicles(Pojazd p) {
		zbiorPojazdow.add(p);
		
	}
	
	@Override
	public String toString() {
		return "Wlasciciel [imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + "]";
	}
	
}
