package observer;

public class BeobachterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heizung heizung = new Heizung();
		Kuehlung kuehlung = new Kuehlung();
		
		TemperaturSensor sensor = new TemperaturSensor();
		TemperaturAnzeige anzeige = new TemperaturAnzeige();
		
		sensor.anmelden(heizung);
		sensor.anmelden(kuehlung);
		anzeige.anmelden(heizung);
		
		// nichts passiert
		sensor.setTemperatur(0);
		System.out.println();
		anzeige.getWert(20);
		// Heizung an
		sensor.setTemperatur(-20);
		System.out.println();
		// Heizung aus, Kuehlung an
		sensor.setTemperatur(60);
		System.out.println();
		// Kuehlung aus
		sensor.setTemperatur(20);

	}

}
