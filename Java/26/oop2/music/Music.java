package cysec.oop2.music;

public class Music {
	public static void main (String[] args) {
		
		Instrument[] orchestra = new Instrument[5];
		
		orchestra[0] = new Wind();
		orchestra[1] = new Stringed();
		orchestra[2] = new Percussion();
		orchestra[3] = new Woodwind();
		orchestra[4] = new Brass();
		
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


abstract class Instrument{
	public abstract void play();
	public String what(){
		return "";
	}
	public abstract void adjust();
}


class Stringed extends Instrument{
	public void play(){
		System.out.println("Wind.play");
	}
	
//	public String what(){
//		return "Wind.play";
//	}
	
	public void adjust(){
		System.out.println("Wind.play");
	}
}

	
	
class Wind extends Instrument{
	public void play(){
		System.out.println("Wind.play");
	}
	
	public String what(){
		return "Wind.play";
	}
	
	public void adjust(){
		System.out.println("Wind.play");
	}
}

class Percussion extends Instrument{
	public void play(){
		System.out.println("Wind.play");
	}
	
	public String what(){
		return "Wind.play";
	}
	
	public void adjust(){
		System.out.println("Wind.play");
	}
}

class Woodwind extends Wind{
	
}

class Brass extends Wind{
	
}