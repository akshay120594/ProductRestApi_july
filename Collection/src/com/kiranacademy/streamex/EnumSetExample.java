package com.kiranacademy.streamex;

import java.util.*;

enum WeekDays
{
	Monday,TuesDay,WendsDay,Thursay,Friday,Satursday,Sunday;
}


public class EnumSetExample {

	public static void main(String[] args) {

			Set<WeekDays> enumSet = EnumSet.of(WeekDays.Monday,WeekDays.Friday);
			
			Iterator<WeekDays> iterator=enumSet.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
					
	 
	}
}
