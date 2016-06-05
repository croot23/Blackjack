
// all code written by Joseph Croot

import java.util.Scanner;

public class run {

	private static Scanner scanner;

	public static void main(String[] args) {
		Player dealer = new Player();
		Player player = new Player();
		
		/* create deck, declare variables, deal initial cards */

		Deck.createDeck();
		Deck.shuffleDeck(Deck.getCards());
		
		dealer.addCard(Deck.getCard());

		System.out.println("  Dealers card is: " + dealer.getLastCardInfo()+"\n");

		player.addCard(Deck.getCard());

		System.out.println("Your first card is: " + player.getLastCardInfo());

		/* game begins */

		scanner = new Scanner(System.in);
		String response = "Yes";

		while (response.equalsIgnoreCase("Yes")) {
			player.addCard(Deck.getCard());
			System.out.println("Next Card is: " + player.getLastCardInfo() + ". Total is : " + player.getTotal());
			if (player.getTotal() > 21) {
				System.out.println("\n    Hot potato! You've gone bust!");
				break;
			} else if (player.getTotal() == 21) {
				System.out.println("\n    Bleeding Nora! You have blackjack. You won!");
				break;
			} else {
				System.out.println("\nWould you like another card?");
			}
			response = scanner.nextLine();
		}
		
		if (player.getTotal()<21) {
			while (dealer.getTotal()<17) {
				dealer.addCard(Deck.getCard());
				System.out.println("  Dealers next card is: "+dealer.getLastCardInfo()+". Total is : "+dealer.getTotal());
			}
		
			if (dealer.getTotal()>21) {
				System.out.println("\n    Shiver me timbers! The dealers gone bust. You win!");
			} else if (dealer.getTotal() < player.getTotal()) {
				System.out.println("\n    Blue blistering barnacles! You've beat the dealer!");
			} else if (dealer.getTotal() > player.getTotal()) {
				System.out.println("\n    Bad luck kid. You got beat.");
			} else if (dealer.getTotal() == player.getTotal()) {
				System.out.println("\n    I don't belieeeeve it! It's a draw.");
			}
		}
		System.out.println("\nPlay again?");
		response = scanner.nextLine();
		if (response.equalsIgnoreCase("yes")) {
			player.reset();
			dealer.reset();
			Deck.reset();
			run.main(null);
		}
	}
}
