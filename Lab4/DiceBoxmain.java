public class DiceBoxmain {
	public static void main( String args[]) {
		final Dice d1 = new Dice();
		System.out.println(d1);
		d1.roll();
		System.out.println(d1);

		final DiceBox box = new DiceBox();
		box.adddice(d1);
		box.adddice(new Dice());
		box.adddice(new Dice());

		System.out.println("Before shaking: total = " + box.gettotal());
		box.shake();
		System.out.println("After shaking: total = " + box.gettotal());

		//box.printDices();
	}
}
