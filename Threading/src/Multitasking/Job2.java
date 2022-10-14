package example;


import java.util.List;

public class Job2 implements Runnable
{

	List<Integer> arrayList;
	
	@Override
	public void run() 
	{
		
		for(int i=5;i<10;i++)
		{
			int no=arrayList.get(i);
			System.out.println("From first thread " + no*no);
		}
		
	}
	
}
