
public class TestEnum {
	
	public static void main(String[] args) {
			
		Item pen=Item.PEN;
		
		System.out.println(pen.getPrice());
				
		for(Item item : Item.values())
		{
			System.out.println(item + " " + item.getPrice());
		}
		
	}

}

