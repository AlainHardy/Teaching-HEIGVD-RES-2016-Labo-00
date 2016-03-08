package ch.heigvd.res.lab00;

import java.util.LinkedList;
import java.util.List;

public class Orchestra {

	private LinkedList<IInstrument> instruments = new LinkedList<>();

	public int getNumberOfInstruments() {
		return instruments.size();
	}
	
	public void addInstrument(IInstrument i) {
		instruments.add(i);
	}
	
	public List<String> makeMusic() {
		LinkedList<String> l = new LinkedList<>();
		
		for(int i = 0; i < getNumberOfInstruments(); i++) {
			l.add(instruments.get(i).play());
		}
		
		return l;
	}
	
}