/*
 RatScrew.java coded by James Doerhoff
 -java foundations used as an imported functions
 */
import javafoundations.*;
import java.util.*;
import java.io.*;

public class RatScrew
{
	public static void main(String args[]) throws IOException
	{
		LinkedQueue<String> player = new LinkedQueue<String>(); // player's queue of cards
		LinkedQueue<String> opponent = new LinkedQueue<String>();   // opponent's queue of cards
		int numOfCards = 52;
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		int i = random.nextInt(numOfCards);
		String[] deck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"};
		// alternates cards to populate both player's starting decks
		while (numOfCards > 0) 
		{
			int rand = random.nextInt(numOfCards);
			String temp = deck[rand];
			player.enqueue(temp);
			deck[rand] = deck[numOfCards-1];
			numOfCards--;
			rand = random.nextInt(numOfCards);
			temp = deck[rand];
			opponent.enqueue(temp);
			deck[rand] = deck[numOfCards-1];
			numOfCards--;
		}
		boolean check = true;  // toggles to keep track of when game is over
		boolean check2 = true;  // toggles to keep track of when round is over
		int gameWinner = 0;
		boolean playerturn = true;
		while (check) 
		{
			check2 = true;
			LinkedQueue<String> pile = new LinkedQueue<String>();  // queue for the pile
			int winner = 0;  // instanciates the variable that will house the winner for this round
			while (check2) 
			{
				check2 = true;
				if (playerturn)
				{
					String playerCard = player.dequeue();   // simulates player putting down first card
					System.out.println("p - " + playerCard);
					pile.enqueue(playerCard);
					
					
					//sees if player's card is a face card
					if ((playerCard.charAt(0)) == 'A' || (playerCard.charAt(0)) == 'K' || (playerCard.charAt(0)) == 'Q' || (playerCard.charAt(0)) == 'J') 
					{
						System.out.println("FACEBATTLE!!!!!");
						winner = faceBattle(player, opponent, pile, playerCard, 2); // if it is, starts a face card battle to end the round
						System.out.println("BATTLE OVER");
						check2 = false; // winner is declared above and this variable is toggled to end the round and give the winner the cards in the pile
					}
					else {
						playerturn = false;
					}
				}
				if (!playerturn && winner == 0) 
				{
					String opponentCard = opponent.dequeue();  // simulates an opponent flipping a card into the pile
					System.out.println("o - " + opponentCard);
					pile.enqueue(opponentCard);
					
					// checks to see if that card is a face card
					if ((opponentCard.charAt(0)) == 'A' || (opponentCard.charAt(0)) == 'K' || (opponentCard.charAt(0)) == 'Q' || (opponentCard.charAt(0)) == 'J') 
					{
						System.out.println("FACEBATTLE!!!!!");
						winner = faceBattle(player, opponent, pile, opponentCard, 1);  // if it is, starts a face card battle to end the round
						System.out.println("BATTLE OVER");
						check2 = false;  // winner is declared above and this variable is toggled to end the round and give the winner the cards in the pile
					}
					else {
						playerturn = true;
					}

				}
				
				//adds the pile to the winner's deck at the end of the round
			
				if (winner == 1) 
				{
					player.addLinkedQueue(pile);
					pile = new LinkedQueue<String>();
					System.out.println("The winner of the battle is the player");
					System.out.println("The player has " + player.size() + " cards left");
					System.out.println("The opponent has " + opponent.size() + " cards left");
					playerturn = true;
					
				}
				if(winner == 2)
				{
					opponent.addLinkedQueue(pile);
					pile = new LinkedQueue<String>();
					System.out.println("The winner of the battle is the opponent");
					playerturn = false;
					System.out.println("The player has " + player.size() + " cards left");
					System.out.println("The opponent has " + opponent.size() + " cards left");
				}
				//declares opponent the winner if the player's deck is empty
				if (player.isEmpty()) 
				{
					check2 = false;
					check = false;
					gameWinner = 2;
				}
				
				//declares player the winner if opponents deck is empty
				if (opponent.isEmpty()) 
				{
					check2 = false;
					check = false;
					gameWinner = 1;
				}
			}
		}
		String win;
		if (gameWinner == 1) {
			win = "player";
		}
		else {
			win = "opponent";
		}

		System.out.println("The winner is the " + win);
	}
		
	//--------------------------------------------
	//  variables:
	//  player; LinkedQueue; represents the player's deck
	//  opponent; LinkedQueue; represents the opponent's deck
	//  pile; LinkedQueue; represents the pile
	//  inCard; String; the face card that started the battle
	//  first; int; the number that represents who will start flipping cards
	//--------------------------------------------
	private static int faceBattle(LinkedQueue<String> player, LinkedQueue<String> opponent, LinkedQueue<String> pile, String inCard, int first)
	{
		String fir, sec, third, four;
		int battleWinner;  //the variable that will later pass on the winner of the face card battle
		char card = inCard.charAt(0);
		if(first == 1)
		{
			battleWinner = 0;
			switch (card) // defines the possible senarios for each face card
			{
				case 'A':
					if (player.isEmpty()) 
					{
						battleWinner = 2;
						break;
					}
					fir = player.dequeue();
					System.out.println("p - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J')  
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 2);
					}
					else
					{
						if (player.isEmpty()) 
						{
							battleWinner = 2;
							break;
						}
						sec = player.dequeue();
						System.out.println("p - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J') 
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 2);
						}
						else 
						{
							if (player.isEmpty()) 
							{
								battleWinner = 2;
								break;
							}
							third = player.dequeue();
							System.out.println("p - " + third);
							pile.enqueue(third);
							if ((third.charAt(0)) == 'A' || (third.charAt(0)) == 'K' || (third.charAt(0)) == 'Q' || (third.charAt(0)) == 'J') 
							{
								battleWinner = faceBattle(player, opponent, pile, third, 2);
							}
							else 
							{
								if (player.isEmpty()) 
								{
									battleWinner = 2;
									break;
								}
								four = player.dequeue();
								System.out.println("p - " + four);
								pile.enqueue(four);
								if ((four.charAt(0)) == 'A' || (four.charAt(0)) == 'K' || (four.charAt(0)) == 'Q' || (four.charAt(0)) == 'J')
								{
									battleWinner = faceBattle(player, opponent, pile, four, 2);
								}
								else 
								{
									battleWinner = 2;
								}
							}
						}
					}
					break;
				case 'K':
					if (player.isEmpty()) 
					{
						battleWinner = 2;
						break;
					}
					fir = player.dequeue();
					System.out.println("p - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J')  
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 2);
					}
					else
					{
						if (player.isEmpty()) 
						{
							battleWinner = 2;
							break;
						}
						sec = player.dequeue();
						System.out.println("p - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J')
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 2);
						}
						else 
						{
							if (player.isEmpty()) 
							{
								battleWinner = 2;
								break;
							}
							third = player.dequeue();
							System.out.println("p - " + third);
							pile.enqueue(third);
							if ((third.charAt(0)) == 'A' || (third.charAt(0)) == 'K' || (third.charAt(0)) == 'Q' || (third.charAt(0)) == 'J') 
							{
								battleWinner = faceBattle(player, opponent, pile, third, 2);
							}
							else 
							{
								battleWinner = 2;
							}
						}
					}
					break;
				case 'Q':
					if (player.isEmpty()) 
					{
						battleWinner = 2;
						break;
					}
					fir = player.dequeue();
					System.out.println("p - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J') 
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 2);
					}
					else
					{
						if (player.isEmpty()) 
						{
							battleWinner = 2;
							break;
						}
						sec = player.dequeue();
						System.out.println("p - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J')
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 2);
						}
						else 
						{
							battleWinner = 2;
						}
					}
					break;
				case 'J':
					if (player.isEmpty()) 
					{
						battleWinner = 2;
						break;
					}
					fir = player.dequeue();
					System.out.println("p - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J') 
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 2);
					}
					else 
					{
						battleWinner = 2;
					}
					break;
				default:
					break;
			}
			
		}
		else if (first == 2)
		{
			battleWinner = 0;
			switch (card) 
			{
				case 'A':
					if (opponent.isEmpty()) 
					{
						battleWinner = 1;
						break;
					}
					fir = opponent.dequeue();
					System.out.println("o - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J')  
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 1);
					}
					else
					{
						if (opponent.isEmpty()) 
						{
							battleWinner = 1;
							break;
						}
						sec = opponent.dequeue();
						System.out.println("o - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J') 
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 1);
						}
						else 
						{
							if (opponent.isEmpty()) 
							{
								battleWinner = 1;
								break;
							}
							third = opponent.dequeue();
							System.out.println("o - " + third);
							pile.enqueue(third);
							if ((third.charAt(0)) == 'A' || (third.charAt(0)) == 'K' || (third.charAt(0)) == 'Q' || (third.charAt(0)) == 'J')  
							{
								battleWinner = faceBattle(player, opponent, pile, third, 1);
							}
							else 
							{
								if (opponent.isEmpty()) 
								{
									battleWinner = 1;
									break;
								}
								four = opponent.dequeue();
								System.out.println("o - " + four);
								pile.enqueue(four);
								if ((four.charAt(0)) == 'A' || (four.charAt(0)) == 'K' || (four.charAt(0)) == 'Q' || (four.charAt(0)) == 'J') 
								{
									battleWinner = faceBattle(player, opponent, pile, four, 1);
								}
								else 
								{
									battleWinner = 1;
								}
							}
						}
					}
					break;
				case 'K':
					if (opponent.isEmpty()) 
					{
						battleWinner = 1;
						break;
					}
					fir = opponent.dequeue();
					System.out.println("o - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J')  
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 1);
					}
					else
					{
						if (opponent.isEmpty()) 
						{
							battleWinner = 1;
							break;
						}
						sec = opponent.dequeue();
						System.out.println("o - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J') 
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 1);
						}
						else 
						{
							if (opponent.isEmpty()) 
							{
								battleWinner = 1;
								break;
							}
							third = opponent.dequeue();
							System.out.println("o - " + third);
							pile.enqueue(third);
							if ((third.charAt(0)) == 'A' || (third.charAt(0)) == 'K' || (third.charAt(0)) == 'Q' || (third.charAt(0)) == 'J') 
							{
								battleWinner = faceBattle(player, opponent, pile, third, 1);
							}
							else 
							{
								battleWinner = 1;
							}
						}
					}
					break;
				case 'Q':
					if (opponent.isEmpty()) 
					{
						battleWinner = 1;
						break;
					}
					fir = opponent.dequeue();
					System.out.println("o - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J')  
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 1);
					}
					else
					{
						if (opponent.isEmpty()) 
						{
							battleWinner = 1;
							break;
						}
						sec = opponent.dequeue();
						System.out.println("o - " + sec);
						pile.enqueue(sec);
						if ((sec.charAt(0)) == 'A' || (sec.charAt(0)) == 'K' || (sec.charAt(0)) == 'Q' || (sec.charAt(0)) == 'J') 
						{
							battleWinner = faceBattle(player, opponent, pile, sec, 1);
						}
						else 
						{
							battleWinner = 1;
						}
					}
					break;
				case 'J':
					if (opponent.isEmpty()) 
					{
						battleWinner = 1;
						break;
					}
					fir = opponent.dequeue();
					System.out.println("o - " + fir);
					pile.enqueue(fir);
					if ((fir.charAt(0)) == 'A' || (fir.charAt(0)) == 'K' || (fir.charAt(0)) == 'Q' || (fir.charAt(0)) == 'J') 
					{
						battleWinner = faceBattle(player, opponent, pile, fir, 1);
					}
					else 
					{
						battleWinner = 1;
					}
					break;
				default:
					break;
			}
		}
		else {
			battleWinner = 0;
		}

		return battleWinner;
	}
}






