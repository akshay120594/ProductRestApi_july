package example;


import java.util.List;

public class Job1 implements Runnable
{

	List<Integer> arrayList;
	
	@Override
	public void run() 
	{
		
		for(int i=0;i<5;i++)
		{
			int no=arrayList.get(i);
			System.out.println("From first thread " + no*no);
		}
		
	}
	
}
