import java.util.ArrayList;
enum Item
{
	PEN(100),NOTEBOOK(150);
	
// public static final Item PEN = new Item(100);
// public static final Item NOTEBOOK = new Item(150);
	int price;
	
	Item(int p)
	{
		price=p;
	}
	
	public int getPrice()
	{
		return price;
	}
	
}
