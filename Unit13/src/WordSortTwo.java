import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay=sentence.split(" ");
	}

	public void sort()
	{
		int count = 1;
		while (count < wordRay.length) {
			int i = count;
			while (i > 0 && wordRay[i-1].compareTo(wordRay[i]) > 0)
			{
				String temp = wordRay[i-1];
				wordRay[i-1] = wordRay[i];
				wordRay[i] = temp;
				i--;
			}
		i++;
		}
	}

	public String toString()
	{
		String str="";
		for (String word: wordRay)
		{
			str = str + word+ "\n";
		}
		return str +"\n \n";
	}
}