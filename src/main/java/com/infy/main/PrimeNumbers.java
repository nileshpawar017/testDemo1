package com.infy.main;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {

	
	public List<Integer> getFirstHundredPrimeNo(){
		
		
		List<Integer> hundredPrimeNumbers = new ArrayList<>();
		int number =1000;
		for(int i=1; i<=number; i++)
		{
			int count =0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0) 
				{
					count++;
				}
			}
			if(count<=2 && hundredPrimeNumbers.size()<100)
			{
				hundredPrimeNumbers.add(i);
			}
		}
		System.out.println("List size :" +hundredPrimeNumbers.size());
		for(int i:hundredPrimeNumbers)
		{
			System.out.println(i);
		}
		
		return hundredPrimeNumbers;
	}
}
