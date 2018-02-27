/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] one = {"giraffe","zebra","gorilla"};
		String[] two = {"red", "blue", "green"};
		int[] three = {1,2,3};
		
		Deck test = new Deck(one,two,three);
		test.isEmpty();
		test.size();
		test.deal();
		System.out.println(test);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
