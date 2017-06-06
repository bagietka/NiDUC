import java.lang.reflect.Array;
import java.util.LinkedList;

public class FillItems 
{
	LinkedList<Item> discs = new LinkedList<Item>();
	LinkedList<Item> routers = new LinkedList<Item>();
	LinkedList<Item> switches = new LinkedList<Item>();
	LinkedList<Item> firewalls = new LinkedList<Item>();
	LinkedList<Item> cooling_systems = new LinkedList<Item>();
	LinkedList<Item> aggregates = new LinkedList<Item>();
	LinkedList<Item> power_systems = new LinkedList<Item>();
	LinkedList<Item> random = new LinkedList<Item>();	
	
	FillItems()
	{
		fill();
	}
	
	double getPrice(LinkedList<Item> list, int index)
	{
		int count = 0;
		for (Item i : list)
		{
			if (count == index) return i.getPrice();
			count++;
		}
		return -1;
	}
	
	int getQuantity(LinkedList<Item> list, int index)
	{
		int count = 0;
		for (Item i : list)
		{
			if (count == index) return i.getQuantity();
			count++;
		}
		return -1;
	}
	
	double getReliability(LinkedList<Item> list, int index)
	{
		int count = 0;
		for (Item i : list)
		{
			if (count == index) return i.getReliability();
			count++;
		}
		return -1;
	}
	
	
	String getName(LinkedList<Item> list, int index)
	{
		int count = 0;
		for (Item i : list)
		{
			if (count == index) return i.getName();
			count++;
		}
		return "ERROR";
	}
	
	
	
		
	String[] getDiscsNames()
	{
		int temp = discs.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : discs)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
	}
	
	String[] getRoutersNames()
	{
		int temp = routers.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : routers)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
		
	}
	
	String[] getSwitchesNames()
	{
		int temp = switches.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : switches)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
		
	}
	
	String[] getFirewallsNames()
	{
		int temp = firewalls.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : firewalls)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
		
	}
	
	String[] getCoolingSystemsNames()
	{
		int temp = cooling_systems.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : cooling_systems)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
		
	}
	
	String[] getPowerSystemsNames()
	{
		int temp = power_systems.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : power_systems)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
		
	}
	
	String[] getRandomNames()
	{
		int temp = random.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : random)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
	}
	
	
	String[] getAggregatesNames()
	{
		int temp = aggregates.size();
		String names[];
		names = new String[temp];
		int count = 0;
		for (Item i : aggregates)
		{
			names[count] = i.getName();
			count++;
		}
		return names;
	}
	
	
	
	
	
	
	
	
	void fill()
	{
		//------------------------------------------------------------------------------------
		//discs
		
		//that's how you add new items to lists
		discs.add(Item.makeItem("Seagate SkyHawk 1TB", 233.01, 0.90, 20));
		discs.add(Item.makeItem("Toshiba N300 4TB", 595.03, 0.95, 5));
		discs.add(Item.makeItem("Intel DC S3700 SSD 400GB", 3498.82, 0.95, 2));
		
		
		//aggregates
		aggregates.add(Item.makeItem("Fogo 59KW 74 KVA FDG 80 IS", 52000.0, 0.99, 1));
		aggregates.add(Item.makeItem("Fogo FDG 80 PD 81 KVA 65 KW ", 54400.0, 0.99, 1));
		
		
		//------------------------------------------------------------------------------------
		//routers
		routers.add(Item.makeItem("Cisco C819G-4G-GA-K9",3899.0, 0.5, 1));	
		
		
		//------------------------------------------------------------------------------------
		//switches
		switches.add(Item.makeItem("Cisco Systems N7K-C7018 ", 29000, 0.995, 1));
		switches.add(Item.makeItem("Cisco SG200-50-K9-EU ", 2100, 0.995, 10));
		
		//------------------------------------------------------------------------------------
		//firewalls
		firewalls.add(Item.makeItem("Huawei Secospace USG6380", 20500.0, 0.96, 1));
		firewalls.add(Item.makeItem("ZyXEL USG310", 5279.0, 0.96, 1));
		
		
		//------------------------------------------------------------------------------------
		//cooling systems
		cooling_systems.add(Item.makeItem("Liquid Cooling Unit LCU DX", 49555.0, 0.95, 1));
		
		//------------------------------------------------------------------------------------
		//power systems
		power_systems.add(Item.makeItem("UPS Delta DLT300 330", 50862.0, 0.91, 1));
		
		
		
		//------------------------------------------------------------------------------------
		//random
		random.add(Item.makeItem("Niebezpieczna dzielnica", 0, 0, 1));
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
