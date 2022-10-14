package encapusalation;

public class Student {
	
	private int rno;
	private String name;
	
	/* default value of reference variable is null */
	 Student()
	 {
	  	rno=0;
	  	name=null;
	 }
	

		public void setName(String name) {
			this.name = name;
		}
		
		
// toString gives data of object
	 
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}


	public int getRno() 
	{
		return this.rno;
	}

	// setRno(1)
	
	public void setRno(int rno) 
	{
		if(rno>0)
			this.rno = rno;
	}


	public String getName() {
		return name;
	}
	
}
