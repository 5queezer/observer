package observer;

public class TemperaturSensor extends Beobachtbar<Integer> {
	
	private int temperatur;
	
	public void setTemperatur(Integer temperatur) {
		this.temperatur = temperatur;
		statusMeldung();
		informiereBeobachter(temperatur);
	}
	
	public void statusMeldung() {
		System.out.println("Sensor meldet: " + temperatur + " Grad Celsius");
	}

}
