import java.util.Scanner;

public class Blackjack
	{
		static boolean end = false;
		static int player = 0;
		static int dealer = 0;
		static int count = 4;
		static boolean dealer1 = false;
		public static void main(String[] args)
			{
				System.out.println("---------------------------------");
				System.out.println("In this game of Blackjack you have to beat the dealer, and of course the other players.");
				System.out.println("In Blackjack you are dealt two cards and you try and add them up to get 21.");
				System.out.println("If you are dealt a jack and an ace you get Blackjack!!!");
				System.out.println("If not, you keep adding on to get 21.");
				System.out.println("You can hit, or stay, but if you go over 21, you bust.");
				System.out.println("Have a great game!!!");
				System.out.println("---------------------------------");
				runner();
			}
		public static void runner()
			{
				Deck.theDeck();
				System.out.println("The dealer will deal you a card, then him, then you, then him.");
				System.out.println("The dealer gave you a " + Deck.deck.get(0).getCardName() + " of " + Deck.deck.get(0).getSuit() + " which is worth " + Deck.deck.get(0).getValue() + ". He also gave you a " + Deck.deck.get(2).getCardName() + " of " + Deck.deck.get(2).getSuit() + " which is worth " + Deck.deck.get(2).getValue() + ".");
				System.out.println("The dealer gave himself a " + Deck.deck.get(1).getCardName() + " of " + Deck.deck.get(1).getSuit() + " which is worth " + Deck.deck.get(1).getValue() + ". He also gave himself a " + Deck.deck.get(3).getCardName() + " of " + Deck.deck.get(3).getSuit() + " which is worth " + Deck.deck.get(3).getValue() + ".");
				player = Deck.deck.get(0).getValue() + Deck.deck.get(2).getValue();
				System.out.println("You have a total of " + player);
				dealer = Deck.deck.get(1).getValue() + Deck.deck.get(3).getValue();
				System.out.println("The dealer has a total of " + dealer);
				System.out.println();
				while(end == false)
					{
						System.out.println("Would you like to hit or stay?");
						Scanner userInput = new Scanner(System.in);
						String hit = userInput.nextLine();
						if(hit.equals("hit") || hit.equals("Hit"))
							{
								System.out.println("The dealer gave you a " + Deck.deck.get(count).getCardName() + " of " + Deck.deck.get(count).getSuit() + " which is worth " + Deck.deck.get(count).getValue() + ".");
								player = player + Deck.deck.get(count).getValue();
								System.out.println("You have a total of " + player);
								count++;
								if(player > 21)
									{
										System.out.println("You busted with a " + player);
										end = true;
									}
							}
						if(hit.equals("stay") || hit.equals("Stay"))
							{
								end = true;
							}
					}
				while(dealer <= 17)
					{
						System.out.println("The dealer gave himself a " + Deck.deck.get(count).getCardName() + " of " + Deck.deck.get(count).getSuit() + " which is worth " + Deck.deck.get(count).getValue() + ".");
						dealer = dealer + Deck.deck.get(count).getValue();
						System.out.println("The dealer has a total of " + dealer);
						count++;
						if(dealer > 21)
							{
								System.out.println("The dealer busted with a " + dealer);
								dealer1 = true;
							}
						dealer1 = true;
						if(player = Deck.deck.get(0).getCardName())
						if(player > dealer && player <= 21)
							{
								System.out.println("YAY!!!! You win!!!!");
							}
						if(player < dealer && dealer <= 21)
							{
								System.out.println("Man... the dealer won.");
							}
					}
			}
	}