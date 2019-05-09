//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Ship extends MovingThing {
	private int speed;
	private Image image;

	public Ship() {
		this(10,10,10,10,10);
	}

	public Ship(int x, int y) {
		super(x,y);	
}

	public Ship(int x, int y, int s) {
		super(x,y);
		speed = s;
	}

	public Ship(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			image = ImageIO.read(new File("C:\\\\Users\\\\lucky\\\\Documents\\\\GitHub\\\\huang_luke_apcsa-p3\\\\Unit17\\\\src\\\\alien.JPG"));
		} catch (Exception e) {
			System.out.println("<thinking>");
		}
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {

		if (direction.equals("LEFT")) {
			setX(getX() - speed);
		} else if (direction.equals("RIGHT")) {
			setX(getX() + speed);
		} else if (direction.equals("UP")) {
			setY(getY() - speed);
		} else if (direction.equals("DOWN")) {
			setY(getY() + speed);
		}
	}

	public void draw(Graphics window) {
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString() {
		return super.toString() + " " + getSpeed();
	}
}