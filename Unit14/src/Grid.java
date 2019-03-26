//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				grid[row][col] = vals[(int)(Math.random() * vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String str = vals[0];
		for (String s : vals)
		{
			if (countVals(s) > countVals(str))
				str = s;
		}
		
		return str;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for (int row = 0 ; row < grid.length; row++)
		{
			for (int col = 0 ; col < grid[row].length; col++)
				if (grid[row][col].contentEquals(val))
					count++;
		}
				
		return count;
	}

	//display the grid
	public String toString()
	{
		String output = "";
		for (int row = 0 ; row < grid.length; row++)
		{
			output += "\n" + Arrays.deepToString(grid[row]);
		}
		
		return output;
	}
}