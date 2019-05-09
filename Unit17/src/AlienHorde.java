//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {
	private List<Alien> aliens;
	private int size;
	private int counter;

	public AlienHorde(int s) {
		aliens = new ArrayList<Alien>();
		size = s;
	}

	public void add(Alien alien) {
		aliens.add(alien);
	}

	public void drawEmAll(Graphics window) {
		for (Alien alien : aliens)
			alien.draw(window);
	}
	
	public void moveEmAll() {
		counter++; 
		for (Alien alien : aliens) {
			if (counter <= 120)
				alien.move("RIGHT");
			else if (counter <= 320)
				alien.move("DOWN");
			else if (counter <= 440)
				alien.move("LEFT");
			else if (counter <= 640)
				alien.move("UP");
			else if (counter <= 1000)
				counter = 0;
		}
	}

	public void removeDeadOnes(List<Ammo> shots) {
		for (int i = 0; i < shots.size(); i++)
			for (int j = 0; j < aliens.size(); j++)
				try { 
					if (shots.get(i).Collide(aliens.get(j))) {
						shots.remove(i);
						aliens.remove(j);
						size--;
					}
				} catch (Exception e) {
					System.out.println(aliens.size() + " aliens left");
				}
	}
	

	public int getSize() {
		return size;
	}

	public String toString() {
		return "";
	}
}