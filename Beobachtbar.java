package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Beobachtbar<T> {
	private final List<Beobachter<T>> alleBeobachter = new ArrayList<>();
	
	public final void anmelden(Beobachter<T> beobachter) {
		alleBeobachter.add(beobachter);
	}
	
	public final void abmelden(Beobachter<T> beobachter) {
		alleBeobachter.remove(beobachter);
	}
	
	protected final void informiereBeobachter(T neuerWert) {
		for(Beobachter<T> beobachter : alleBeobachter) {
			beobachter.geaenderterWert(neuerWert);
		}
	}

}
