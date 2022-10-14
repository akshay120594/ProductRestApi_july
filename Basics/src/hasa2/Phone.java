package hasa2;

public class Phone {

	private String name;
	private int price;
			
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		
		String data ="[name= " + name + " price= " + price + "]";;
		
		return data;
	}
	
	
	public static void main(String[] args) {
		
		Phone p = new Phone();
		
		System.out.println(p);
		
		p.name="sony";
		p.price=20000;
		
		System.out.println(p);
		
		
	}

}
