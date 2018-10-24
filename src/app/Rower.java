package app;

public class Rower extends Pojazd {
	
	private Typ typRoweru;
	
	public Rower() {
		super();
		
	}
	
	public Rower(String nrRej, Typ typRoweru) {
		super(nrRej);
		setTypRoweru(typRoweru);
		super.hasMotor = false;
	}
	
	public Typ getTypRoweru() {
		return typRoweru;
	}
	
	public void setTypRoweru(Typ typRoweru) {
		this.typRoweru = typRoweru;
	}
	
	@Override
	public boolean isMotor() {
		return hasMotor;
	}
	
	@Override
	public void addOwners(Wlasciciel w) {
		owners.add(w);
		
	}
	
	@Override
	public String toString() {
		return "Rower [typRoweru=" + typRoweru + ", owners=" + owners + ", getTypRoweru()=" + getTypRoweru() + ", isMotor()=" + isMotor() + ", getNrRej()=" + getNrRej() + "]";
	}
	
}
