package demoPackage;

import Example.APIconnect;

public class demo 
{
	public static void main(String args[])
	{ 
		APIconnect.hello();
		
		int i = APIconnect.return50();
		System.out.println(i);
		
		i = APIconnect.timesTwo(i);
		System.out.println(i);
		
	}
}
