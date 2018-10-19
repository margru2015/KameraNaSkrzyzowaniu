package app;

import java.util.HashSet;
import java.util.Set;

abstract public class Pojazd {
	
	// fields
	private String		nrRej;
	Set<Wlasciciel>		owners	= new HashSet<>();
	protected boolean	hasMotor;
	
	// constructors
	public Pojazd() {
		
	}
	
	public Pojazd(String nrRej, boolean hasMotor) {
		setNrRej(nrRej);
		this.hasMotor = hasMotor;
	}
	
	// gettery&settery
	public String getNrRej() {
		return nrRej;
	}
	
	public void setNrRej(String nrRej) {
		this.nrRej = nrRej;
	}
	
	abstract public boolean isMotor();
	
	abstract public void addOwners(Wlasciciel w);
}
