//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;


@SuppressWarnings("serial")
public class OuterSpace extends Canvas implements KeyListener, Runnable {

	private Ship ship;
	private Bullets shots;
	private int counter;
	private AlienHorde horde;
	private boolean[] keys;
	private BufferedImage back;

	/** Constructs hordes and ship
	 * 
	 */
	public OuterSpace() {
		setBackground(Color.black);
		keys = new boolean[5];
		
		ship = new Ship(400, 500, 35, 35, 1);
		shots = new Bullets();
		
		shots.add(new Ammo(-10, -10, 0));
		horde = new AlienHorde(30);
		
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true); 
	}

	/** Updates window
	 * @param w is graphics window
	 */
	public void update(Graphics w) {
		paint(w);
	}

	/** Creates visual representations of everything in the graphics window
	 * @param w is graphics window
	 */
	public void paint(Graphics w) {
		Graphics2D twoDGraph = (Graphics2D) w;
		
		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		
		Graphics graphToBack = back.createGraphics();
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, 800, 600);
		counter++;

		if (keys[0] == true) {
			ship.move("LEFT");
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
		}
		if (keys[2] == true) {
			ship.move("UP");
		}
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		if (keys[4] == true) {
			if (counter >= 70) {
				shots.add(new Ammo(ship.getX() + ship.getWidth() / 2 - 2, ship.getY(), 5));
				counter = 0;
			}
		}

		horde.moveEmAll();
		shots.moveEmAll();
		horde.removeDeadOnes(shots.getList());
		shots.cleanEmUp();		
		graphToBack.setColor(Color.WHITE);
		graphToBack.drawString(""+horde.getSize(), 740, 530);
		ship.draw(graphToBack);
		shots.drawEmAll(graphToBack);
		horde.drawEmAll(graphToBack);
		twoDGraph.drawImage(back, null, 0, 0);
	}

	/** Causes action as a result of key being pressed
	 * @param e is if key is pressed
	 */
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) { 
			keys[4] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_K) { 
			keys[5] = true;
		}
	}

	/** Stops action as a result of key being released
	 * @param e is if key is released
	 */
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_K) {
			keys[5] = false;
		}
	}

	/**
	 * @param e key is used to type
	 */
	public void keyTyped(KeyEvent e) {
	}

	/** runs Outerspace
	 * 
	 */
	public void run() {
		try {
			while (true) {
				Thread.currentThread();
				Thread.sleep(5);
				repaint();
			}
		} catch (Exception e) {
			System.out.println("unlucky");
		}
	}
}
