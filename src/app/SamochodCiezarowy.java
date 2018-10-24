package app;

public class SamochodCiezarowy extends PojazdSilnikowy {
	
	private int maxLadownosc;
	
	public SamochodCiezarowy() {
		super();
		
	}
	
	public SamochodCiezarowy(String nrRej, int pojemnoscSilnika, String rodzajPaliwa, int maxLadownosc) {
		super(nrRej, pojemnoscSilnika, rodzajPaliwa);
		setMaxLadownosc(maxLadownosc);
	}
	
	public int getMaxLadownosc() {
		return maxLadownosc;
	}
	
	public void setMaxLadownosc(int maxLadownosc) {
		this.maxLadownosc = maxLadownosc;
	}
	
	@Override
	public String toString() {
		return "SamochodCiezarowy [maxLadownosc=" + maxLadownosc + ", owners=" + owners + ", hasMotor=" + hasMotor + ", getMaxLadownosc()=" + getMaxLadownosc() + ", getPojemnoscSilnika()="
				+ getPojemnoscSilnika() + ", getRodzajPaliwa()=" + getRodzajPaliwa() + ", getNrRej()=" + getNrRej() + "]";
	}
	
}
