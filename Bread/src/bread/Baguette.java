package bread;

public class Baguette {

	public static void main(String[] args) {
		Bread Baguette = new Bread();
		
		System.out.println("Ingredients of Baguette are:");
		System.out.println(Baguette.setflourB() + " cups of flour");
		System.out.println(Baguette.setwaterB() + " cups of water");
		System.out.println(Baguette.setsaltB() + " tsps of salt");
		System.out.println(Baguette.setyeastB() + " tsp of yeast");
		System.out.println(Baguette.setRSDSB() + " cup of ripe sourdough starter");
	}

}
