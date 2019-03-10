//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
	boolean exist = false;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String str[] = toys.split(" ");
		ArrayList<String> temp = new ArrayList<String>();
		
		for (int i=0; i<str.length; i++)
		{
			temp.add(str[i]);
		}
		
		for (int j=0; j<temp.size(); j++)
		{
			for (int k=0; k<toyList.size(); k++)
			{
				if ( temp.get(j).equals( toyList.get(k).getName() ) )
				{
					toyList.get(k).setCount(toyList.get(k).getCount()+1);
					
				}
			}
			if (!exist)
			{
				toyList.add(new Toy(temp.get(j),1));
				exist = false;
			}
			
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toyList1:toyList)
  		{
  			if (nm.equals(toyList1.getName()))
				return toyList1;
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy temp1;
  		ArrayList<Toy> temp2 = toyList;
  		for (int i=1; i<temp2.size(); i++)
  			if (temp2.get(i).getCount() > temp2.get(i-1).getCount())
  			{
  				temp1 = temp2.get(i);
  				temp2.set(i, temp2.get(i-1));
  				temp2.set(i-1, temp1);
  			}  		
  		return "max == " + temp2.get(0).toString();
  	}  
  
  	public void sortToysByCount()
  	{
  		Toy temp1;
  		for (int i=1; i<toyList.size(); i++)
  		{
  			if (toyList.get(i).getCount() > toyList.get(i-1).getCount())
  			{
  				temp1 = toyList.get(i);
  				toyList.set(i,  toyList.get(i-1));
  				toyList.set(i-1 ,  temp1);
  			}
  		}
  	}  
  	  
	public String toString()
	{
		String str = "";
		for (Toy i : toyList)
		{
			str += (i.toString() + " ");
		}
		
		return str;
	}
}