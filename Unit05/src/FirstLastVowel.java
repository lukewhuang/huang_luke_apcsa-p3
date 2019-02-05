//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	
	   char first = a.charAt(0);
	   
	   char last = a.charAt(a.length()-1);
	   
	   first = Character.toUpperCase(first);
	   last = Character.toUpperCase(last);
	   
	   if (first == 'A' || first == 'E'|| first == 'I' || first == 'O' || first == 'U')
		   return "yes";
	   else if (last == 'A' || last == 'E' || last == 'I' || last == 'O' || last == 'U')
		   return "yes";
	   else
		   return "no";
	}
}