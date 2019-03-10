//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		
		test.loadToys("sorry bat sorry sorry train train teddy teddy ball ball");
		System.out.println(test.toString());
		System.out.println(test.getThatToy("teddy").toString());
		System.out.println(test.getMostFrequentToy());
		test.sortToysByCount();
		
		System.out.println(test.toString());
	}
}