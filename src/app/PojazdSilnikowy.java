package app;

public class PojazdSilnikowy extends Pojazd {
	
	private int		pojemnoscSilnika;
	private String	rodzajPaliwa;
	
	public PojazdSilnikowy() {
		super();
		
	}
	
	public PojazdSilnikowy(String nrRej, boolean hasMotor, int pojemnoscSilnika, String rodzajPaliwa) {
		super(nrRej, hasMotor);
		setPojemnoscSilnika(pojemnoscSilnika);
		setRodzajPaliwa(rodzajPaliwa);
		
	}
	
	public int getPojemnoscSilnika() {
		return pojemnoscSilnika;
	}
	
	public void setPojemnoscSilnika(int pojemnoscSilnika) {
		this.pojemnoscSilnika = pojemnoscSilnika;
	}
	
	public String getRodzajPaliwa() {
		return rodzajPaliwa;
	}
	
	public void setRodzajPaliwa(String rodzajPaliwa) {
		this.rodzajPaliwa = rodzajPaliwa;
	}
	
	@Override
	public boolean isMotor() {
		return hasMotor;
	}
	
	@Override
	public void addOwners(Wlasciciel w) {
		owners.add(w);
	}
	
}
