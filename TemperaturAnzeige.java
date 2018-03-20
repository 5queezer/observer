package observer;

public class TemperaturAnzeige extends Beobachtbar<Integer> {
	
	
	public void getWert(Integer temperatur) {
		System.out.println("Anzeige: ");
		informiereBeobachter(temperatur);
		System.out.println("Ende Anzeige");
		System.out.println();
	}

}
