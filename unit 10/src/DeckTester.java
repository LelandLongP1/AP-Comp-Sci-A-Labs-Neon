/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = {"ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};
		String[] suit = {"spades", "hearts", "diamonds", "clubs"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		Deck test = new Deck(rank,suit,value);
		test.shuffle();
		test.isEmpty();
		test.size();
		for (int i = 0; i< 52; i++){
			test.deal();
		}
		System.out.println(test);
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
	}
}
