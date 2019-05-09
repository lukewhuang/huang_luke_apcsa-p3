//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(100, 100, 5);
	}

	public Ammo(int x, int y) {
		this(x, y, 5);
	}

	public Ammo(int x, int y, int s) {
		setPos(x, y);
		setSpeed(s);
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.red);
		window.fillRect(getX(), getY(), 6, 12);
	}

	public void move(String direction)
	{
		if (direction.equals("RIGHT") && getX() + getSpeed() < 800 - getWidth()) {
			setX(getX() + getSpeed());
		}
		if (direction.equals("LEFT") && getX() - getSpeed() >= 0) {
			setX(getX() - getSpeed());
		}
		if (direction.equals("UP") && getY() - getSpeed() >= 0) {
			setY(getY() - getSpeed());
		}
		if (direction.equals("DOWN") && getY() + getSpeed() < 600 - getHeight()) {
			setY(getY() + getSpeed());
		}
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}