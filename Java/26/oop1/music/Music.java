package cysec.oop1.music;


public class Music {
	public static void main (String[] args) {
		
		Instrument[] orchestra = new Instrument[5];
		
		orchestra[0] = new Instrument();
		orchestra[1] = new Instrument();
		orchestra[2] = new Instrument();
		orchestra[3] = new Instrument();
		orchestra[4] = new Instrument();
		
		tuneAll (orchestra);
	}
		
		public static void tuneAll (Instrument[] anything) {
			for(int i=0; i < anything.length; i++){
				tune(anything[i]);
			}
		}
		public static void tune (Instrument ddd) {
			ddd.play();
		}
	}


class Instrument{
	public void play(){
		System.out.println("Wind.play");
	}
	
	public void adjust(){
		System.out.println("Wind.play");
	}
	
}
class Stringed extends Instrument{
	
}

class Wind extends Instrument{
	
}

class Percussion extends Instrument{
	
}

class Woodwind extends Wind{
	
}

class Brass extends Wind{
	
}