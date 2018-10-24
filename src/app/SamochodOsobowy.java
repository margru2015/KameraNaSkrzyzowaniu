package app;

public class SamochodOsobowy extends PojazdSilnikowy {
	
	private int maxPasazer;
	
	public SamochodOsobowy() {
		super();
	}
	
	public SamochodOsobowy(String nrRej, int pojemnoscSilnika, String rodzajPaliwa, int maxPasazer) {
		super(nrRej, pojemnoscSilnika, rodzajPaliwa);
		setMaxPasazer(maxPasazer);
	}
	
	public int getMaxPasazer() {
		return maxPasazer;
	}
	
	public void setMaxPasazer(int maxPasazer) {
		this.maxPasazer = maxPasazer;
	}
	
	@Override
	public String toString() {
		return "SamochodOsobowy [maxPasazer=" + maxPasazer + ", owners=" + owners + ", hasMotor=" + hasMotor + ", getPojemnoscSilnika()=" + getPojemnoscSilnika() + ", getRodzajPaliwa()="
				+ getRodzajPaliwa() + ", getNrRej()=" + getNrRej() + "]";
	}
	
}
