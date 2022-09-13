package bread;

public class SourDoughBread {

	public static void main(String[] args) {
		Bread sdb = new Bread();
		
		System.out.println("Ingredients of Sourdough Bread are:");
		System.out.println(sdb.setfloursd() + " cups of flour");
		System.out.println(sdb.setwatersd() + " cups of water");
		System.out.println(sdb.setsaltsd() + " tsps of salt");
		System.out.println(sdb.setyeastsd() + " tsp of yeast");
		System.out.println(sdb.setRSDSsd() + " cup of ripe sourdough starter");

	}

}
