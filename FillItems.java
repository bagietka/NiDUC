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
		
		
		
		
		
		
		//------------------------------------------------------------------------------------
		//routers

		
		
		//------------------------------------------------------------------------------------
		//switches
		
		
		//------------------------------------------------------------------------------------
		//firewalls
		
		
		//------------------------------------------------------------------------------------
		//cooling systems
		
		
		//------------------------------------------------------------------------------------
		//power systems
		
		
		//------------------------------------------------------------------------------------
		//random
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
