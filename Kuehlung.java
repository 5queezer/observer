package observer;

public class Kuehlung implements Beobachter<Integer>{
	
	private final int MAX_TEMPERATUR = 40;
	private boolean kuehlungAn;
	
	@Override
	public void geaenderterWert(Integer neueTemperatur) {
		if(neueTemperatur > MAX_TEMPERATUR && !kuehlungAn) {
			kuehlungEinschalten();
		} else if (neueTemperatur <= MAX_TEMPERATUR && kuehlungAn) {
			kuehlungAusschalten();
		}
	}
	
	private void kuehlungEinschalten() {
		kuehlungAn = true;
		System.out.println("Kuehlung eingeschaltet!");
	}
	
	private void kuehlungAusschalten() {
		kuehlungAn = false;
		System.out.println("Kuehlung ausgeschaltet!");
	}

}
