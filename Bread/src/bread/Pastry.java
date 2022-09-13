package bread;

public class Pastry {
	
	public static void main(String[] args) {
		Bread Pastry = new Bread();
		
		System.out.println("Ingredients of Pastry are:");
		System.out.println(Pastry.setflourP() + " cups of flour");
		System.out.println(Pastry.setwaterP() + " cups of water");
		System.out.println(Pastry.setsaltP() + " tsps of salt");
		System.out.println(Pastry.setyeastP() + " tsp of yeast");
		System.out.println(Pastry.setRSDSP() + " cup of ripe sourdough starter");
	}

}
