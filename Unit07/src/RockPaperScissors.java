//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	String winner="";
	
	public RockPaperScissors()
	{
		setPlayers(" ");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int num = (int) (Math.random() * 3);
		if (num == 0) {
			compChoice = "R";
		}
		else if (num == 1) {
			compChoice = "P";
		}
		else if (num == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		
		if (compChoice.equals(playChoice)) {
			winner = "Draw";
		}
		else if (playChoice.equals("S") && compChoice.equals("P") 	|| 	
				playChoice.equals("R") && compChoice.equals("S")
					|| playChoice.equals("P") && compChoice.equals("R")) {
			winner = "Player";
		}
		else
			winner = "Computer";
		return winner;
	}

	public String toString()
	{
		String output= "";
		output = "Player plays " + playChoice + "\ncomputer plays " + compChoice + "\nwinner is " + determineWinner();
		return output;

	}
}