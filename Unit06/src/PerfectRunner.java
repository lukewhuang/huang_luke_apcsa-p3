//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect p = new Perfect();
		
		p.setNum(496);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(45);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(6);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(8128);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(1245);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(33);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(28);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(27);
		p.isPerfect();
		System.out.println(p.toString());
		
		p.setNum(33550336);
		p.isPerfect();
		System.out.println(p.toString());
																
	}
}