
class Item 
{
	String name;
	double price;
	double reliability;
	int quantity_needed;
	
	String getName()
	{
		return this.name;
	}
	
	double getPrice()
	{
		return this.price;
	}
	
	double getReliability()
	{
		return this.reliability;
	}
	
	int getQuantity()
	{
		return this.quantity_needed;
	}
	
	static Item makeItem(String new_name, double new_price, double new_reliability, int new_quantity)
	{
		Item temporary = new Item();
		temporary.name = new_name;
		temporary.price = new_price;
		temporary.reliability = new_reliability;
		temporary.quantity_needed = new_quantity;		
		
		return temporary;
	}
	
	
	
}
