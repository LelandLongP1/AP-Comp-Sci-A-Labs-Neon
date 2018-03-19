/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Clubs","King", 10);
		System.out.println(one);
		
		Card two = new Card("Clubs","King", 10);
		System.out.println(two.matches(one));
		System.out.println(two);
		
		Card three = new Card("Spades","Queen", 9);
		System.out.println(three.matches(one));
		System.out.println(three);
	}
}
