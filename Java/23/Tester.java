
public class Tester {
	
	public static void main(String args[]) {
		
		FootballSupporter l = new LiverpoolSupporter();
		FootballSupporter c = new ChelseaSupporter();
		FootballSupporter u = new UnitedSupporter();
		
		System.out.println("Chelsea: " + c.getStadium());
		System.out.println("Liverpool: " + c.getStadium());
		System.out.println("United: " + c.getStadium());
		
		System.out.println("Chelsea: " + c.getManager());
		System.out.println("Liverpool: " + c.getManager());
		System.out.println("United: " + c.getManager());
	}
}
