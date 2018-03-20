package observer;

public class Heizung implements Beobachter<Integer>{
	
	private final int MIN_TEMPERATUR = -10;
	private boolean heizungAn;
	
	@Override
	public void geaenderterWert(Integer neueTemperatur) {
		if(neueTemperatur < MIN_TEMPERATUR && !heizungAn) {
			heizungEinschalten();
		} else if (neueTemperatur >= MIN_TEMPERATUR && heizungAn) {
			heizungAusschalten();
		}
	}
	
	
	private void heizungEinschalten() {
		heizungAn = true;
		System.out.println("Heizung eingeschaltet!");
	}
	
	private void heizungAusschalten() {
		heizungAn = false;
		System.out.println("Heizung ausgeschaltet!");
	}

}
