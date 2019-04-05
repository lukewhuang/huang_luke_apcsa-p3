//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	  super(10,10);
      speed = 5;      
   }
   
   public Paddle(int x, int y)
   {
	   super(x,y);
	   speed = 5;
   }
   
   
   public Paddle(int x, int y, int z)
   {
	   super (x,y);
	   setSpeed(z);
   }

   public Paddle(int x, int y, int w, int h)
   {
	   super(x, y, w, h);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int w, int h, int z)
   {
	   super(x, y, w, h);
	   setSpeed(z);
   }
   
   public Paddle(int x, int y, int w, int h, Color col, int z)
   {
	   super(x, y, w, h, col);
	   setSpeed(z);
   }
   //add the other Paddle constructors

   public void setSpeed(int s)
   {
	   speed = s;
   }


   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY() - speed);
	   draw(window);

   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   setY(getY() - speed);
	   draw(window);

   }

   //add get methods
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   
   public String toString()
   {
	   return getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor() + " " + getSpeed();
   }
}