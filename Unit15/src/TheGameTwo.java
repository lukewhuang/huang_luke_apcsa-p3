//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.JFrame;
import java.awt.Component;

public class TheGameTwo extends JFrame
{
	private static final int WIDTH = 742;
	private static final int HEIGHT = 600;

	public TheGameTwo()
	{
		super("BREAKOUT");
		setSize(WIDTH,HEIGHT);

		Breakout game = new Breakout();
		
		((Component)game).setFocusable(true);
		getContentPane().add(game);

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String args[] )
	{
		TheGameTwo run = new TheGameTwo();
	}
}