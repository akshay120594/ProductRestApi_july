package hasa;

public class Phone 
{
	
	String name;
	int price;
	
	
	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	
	@Override
	public String toString() {
		
		String data ="[name= " + name + " price= " + price + "]";;
		
		return data;
	}
	
	

}
