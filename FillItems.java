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
		
		//OK znaczy, �e jest to rzeczywista dost�pno��, obliczona w Excelu
		
		discs.add(Item.makeItem("Seagate SkyHawk 1TB", 233.01, 0.999999, 20));//OK
		discs.add(Item.makeItem("Toshiba N300 4TB", 595.03, 0.9999995, 5));//OK
		discs.add(Item.makeItem("Intel DC S3700 SSD 400GB", 3498.82, 0.999999, 50));//OK
		
		
		//aggregates
		aggregates.add(Item.makeItem("Fogo 59KW 74 KVA FDG 80 IS", 52000.0, 1, 1));//OK
		aggregates.add(Item.makeItem("Fogo FDG 80 PD 81 KVA 65 KW ", 54400.0, 1, 1));//OK
		aggregates.add(Item.makeItem("AN-S3/65 z ATS 50kW", 34999.0, 1, 1));//OK
		aggregates.add(Item.makeItem("GF2-30 30kW", 31500.0, 1, 1));//OK
		aggregates.add(Item.makeItem("AN-S3/130 z ATS 100kW", 49900.0, 1, 1));//OK
		
		
		
		//------------------------------------------------------------------------------------
		//routers
		routers.add(Item.makeItem("Cisco C819G-4G-GA-K9",3899.0, 0.999995, 1));//OK
		routers.add(Item.makeItem("Cisco 1941/K9",3265.26, 0.999995, 1));//OK
		routers.add(Item.makeItem("Cisco 2911-SEC/K9",8528.13, 0.999996, 1));//OK
		routers.add(Item.makeItem("Cisco 2901 W/2 GE4",4059.0, 0.999995, 1));//OK
	//	routers.add(Item.makeItem("Cisco FLASR1-CE-4KR",565329.00, 0.999999, 1));//OK
		
		
		//------------------------------------------------------------------------------------
		//switches
		switches.add(Item.makeItem("Cisco Systems N7K-C7018 ", 29000, 0.99999515, 1));//OK
		switches.add(Item.makeItem("Cisco SG200-50-K9-EU ", 2100, 0.99999579, 1));//OK
		switches.add(Item.makeItem("Cisco Systems N7K-C7009", 52490.19, 0.99999686, 1));//OK
		switches.add(Item.makeItem("Cisco Systems N5K-C5548P-Fa", 27992.0, 0.99998983, 1));//OK
		switches.add(Item.makeItem("Cisco Systems N5K-C5548UP-FA", 56022.0, 0.99998983, 1));//OK
		switches.add(Item.makeItem("Cisco Systems N4k-40001l-XPX", 26160.0, 0.99999466, 1));//OK
		
		//------------------------------------------------------------------------------------
		//firewalls
		firewalls.add(Item.makeItem("Huawei Secospace USG6380", 20500.0, 0.99998092, 1));//OK
		firewalls.add(Item.makeItem("ZyXEL USG310", 5279.0, 0.99999643, 1));//OK
		firewalls.add(Item.makeItem("Huawei Secospace USG6320", 4128.15, 0.99998802, 1));//OK
		firewalls.add(Item.makeItem("Huawei Secospace USG6390 ", 24172.93, 0.99998092, 1));//OK
		
		
		//------------------------------------------------------------------------------------
		//cooling systems
		cooling_systems.add(Item.makeItem("Liquid Cooling Unit LCU DX", 49555.0, 0.9999463, 1));
		cooling_systems.add(Item.makeItem("Top Therm Blue", 16456.61, 0.999886, 1));
		cooling_systems.add(Item.makeItem("Panasonic E9PKEA ", 4485.0, 0.998996, 1));
		cooling_systems.add(Item.makeItem("Fujitsu ASYG 12LTCA/AOYG 12LTC ", 6002.0, 0.999566, 1));
		cooling_systems.add(Item.makeItem("Samsung Prestige", 6030.0, 0.999686, 1));

		
		//------------------------------------------------------------------------------------
		//power systems
		power_systems.add(Item.makeItem("UPS Delta DLT300 330", 50862.0, 0.9998597, 1));
		power_systems.add(Item.makeItem("UPS Delta DLT300 3200 ", 247624.00, 0.99998757, 1));
		power_systems.add(Item.makeItem("UPS Delta DLT300 3120", 144493.00, 0.9999214, 1));
		power_systems.add(Item.makeItem("UPS APC Smart-UPS VT ISX", 87922.00, 0.9998947, 1));
		
		
		
		//------------------------------------------------------------------------------------
		//random
		random.add(Item.makeItem("Niebezpieczna dzielnica", 0, 0.99, 1));
		random.add(Item.makeItem("Normalne warunki", 0, 0.9975, 1));
		random.add(Item.makeItem("Brak czynnika w symulacji", 0, 1.0, 1));
		
		
		
		
		
		
		
		
	}
	
	
	
	
}