import java.util.List;
import java.util.Random;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {


	
	// ARRAY VERSION --> private Card[] cards;

	private List<Card> cards = new ArrayList<Card>();
	
	
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		
		
		/* ARRAY VERSION
		
		size = ranks.length * suits.length;
		cards = new Card[size];
		
		int counter = 0;
		for (int i=0; i<suits.length; i++) {
			for (int x=0; x<ranks.length; x++) {
				cards[counter] = new Card(ranks[x], suits[i], values[x]);
				counter++;
			}
		}
		
		*/
		
		
		// ARRAY LIST VERSION
		
		for (int i=0; i<suits.length; i++)
		{
			for (int x =0; x<ranks.length; x++)
			{
				cards.add(new Card(ranks[x], suits[i], values[x]));
			}
		}
		
		size = cards.size();
		
	}

	public boolean isEmpty() {
		return (size == 0);
	}


	public int size() {
		return size;
	}

	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		/* ARRAY VERSION
		
		Card[] cardArr = new Card[cards.length];
		Random rand = new Random();
		int position = 0;
		for(int i = cards.length-1; i>=1; i--){
			position = rand.nextInt((i-1)+1);
			Card temp = cardArr[i];
			cardArr[i] = cardArr[position];
			cardArr[position] = temp;
		}
		
		
		*/
		
		for (int i=cards.size()-1; i >= 1; i--)
		{
			int howMany = i+1;
			int start = 0;
			int randPos = (int) (Math.random() * howMany) + start;
			
			Card temp = cards.get(i);
			cards.set(i,  cards.get(randPos));
			cards.set(randPos,  temp);
		}
	}

	public Card deal() {
		/* ARRAY VERSION
		
		if (size>0) {
			size--;
		}
		else 
			return null;
		
		return cards[size];
		
		*/ 
		
		//ARRAY LIST VERSION
		if (cards.size() <= 0)
			return null;
		size -= 1;
		return cards.get(size);
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";
		
		
		/* ARRAY VERSION
		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
		*/
		
		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k>=size; k--)
		{
			rtn = rtn + cards.get(k);
			if (k != size)
				rtn = rtn + ", ";
			
			if ((k-size) %2 == 0)
				rtn =rtn + "\n";
		}
		
		rtn = rtn + "\n";
		return rtn;
	}
}
