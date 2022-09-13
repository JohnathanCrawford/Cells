package bread;

public class Muffin {

	public static void main(String[] args) {
		Bread Muffin = new Bread();
		
		System.out.println("Ingredients of Muffin are:");
		System.out.println(Muffin.setflourM() + " cups of flour");
		System.out.println(Muffin.setwaterM() + " cups of water");
		System.out.println(Muffin.setsaltM() + " tsps of salt");
		System.out.println(Muffin.setyeastM() + " tsp of yeast");
		System.out.println(Muffin.setRSDSM() + " cup of ripe sourdough starter");
	}

}
