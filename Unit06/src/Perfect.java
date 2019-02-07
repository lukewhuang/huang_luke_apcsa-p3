//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect() {
	    
   }
   public Perfect(int n) {
	   setNum(n);
	   isPerfect();
   }

	//add a set method

   public void setNum(int n) {
	   number = n;
   }
   
	public boolean isPerfect()
	{
		int sum = 0; 

		for (int x = 1; x < number; x++) {
			if (number % x == 0) {
				sum = sum + x;
			}
		}
		
		if (sum == number)
			return true;
		else
			return false;
	}

	//add a toString	
	public String toString() {
		if ( isPerfect() ) {
			return (number + " is perfect.");
		}
		else {
			return (number + " is not perfect.");
		}
	}
}