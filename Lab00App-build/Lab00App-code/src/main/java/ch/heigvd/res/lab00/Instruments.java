package ch.heigvd.res.lab00;

interface IInstrument {
	public abstract String play();
	public abstract int getSoundVolume();
	public abstract String getColor();
}

class Trumpet implements IInstrument {
	
	public  String play() {
		return "pouet";
	}
	public int getSoundVolume() {
		return 20;
	}
	
	public String getColor() {
		return "golden";
	}
}

class Flute implements IInstrument {
	
	public  String play() {
		return "trilili";
	}
	public int getSoundVolume() {
		return 10;
	}
	
	public String getColor() {
		return "???";
	}
}