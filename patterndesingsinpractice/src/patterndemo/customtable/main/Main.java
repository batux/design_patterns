package patterndemo.customtable.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import patterndemo.customtable.adapter.BaseTable;
import patterndemo.customtable.adapter.DataItem;
import patterndemo.customtable.adapter.DataItemAdapter;
import patterndemo.customtable.adapter.HashMapAdapter;
import patterndemo.customtable.adapter.TableCreator;
import patterndemo.customtable.factory.SimpleTableFactory;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		
		// We converts HashMap and List data types to BaseTable data structure.
		// We use Adapter pattern for converting
		
		// For BaseTable creating, we use AbstractFactory pattern
		// For Column object creating, we use Builder pattern
		
		HashMap<Long, List<Object>> source1 = new HashMap<Long, List<Object>>();
		source1.put(0L, new ArrayList<Object>(){{
		    add("ID");
		    add("NAME");
		    add("SURNAME");
		}});
		source1.put(1L, new ArrayList<Object>(){{
		    add(new Long(1001));
		    add("BATUHAN");
		    add("DUZGUN");
		}});
		source1.put(2L, new ArrayList<Object>(){{
			add(new Long(1002));
		    add("ROBIN");
		    add("VAN PERSIE");
		}});
		
		TableCreator<HashMap<Long, List<Object>>> tableCreator1 = new TableCreator<HashMap<Long, List<Object>>>();
		BaseTable baseTable = tableCreator1.createBaseTable(
				source1, 
				new SimpleTableFactory(), 
				new HashMapAdapter<Object, List<Object>, HashMap<Long,List<Object>>>());
		
		System.out.println("TABLE 1: " + baseTable);
		
		System.out.println("--------------------------------------------------------\n");
		
		
		List<DataItem<Object, List<Object>>> source2 = new ArrayList<DataItem<Object,List<Object>>>();
		
		DataItem<Object, List<Object>> column1 = new DataItem<Object, List<Object>>();
		column1.index = new Long(0);
		column1.name = "ID";
		column1.values = new ArrayList<Object>(){{
			add(new Long(0));
		    add(new Long(1));
		}};
		source2.add(column1);
		
		DataItem<Object, List<Object>> column2 = new DataItem<Object, List<Object>>();
		column2.index = new Long(0);
		column2.name = "NAME";
		column2.values = new ArrayList<Object>(){{
			add("BATUHAN");
		    add("ROBIN");
		}};
		source2.add(column2);
		
		DataItem<Object, List<Object>> column3 = new DataItem<Object, List<Object>>();
		column3.index = new Long(0);
		column3.name = "SURNAME";
		column3.values = new ArrayList<Object>(){{
			add("DUZGUN");
		    add("VAN PERSIE");
		}};
		source2.add(column3);
		
		
		TableCreator<List<DataItem<Object, List<Object>>>> tableCreator2 = new TableCreator<List<DataItem<Object,List<Object>>>>();
		BaseTable baseTable2 = tableCreator2.createBaseTable(
				source2, 
				new SimpleTableFactory(), 
				new DataItemAdapter<Object, List<Object>, DataItem<Object,List<Object>>, List<DataItem<Object,List<Object>>>>());
		
		System.out.println("TABLE 2: " + baseTable2);
		
		System.out.println("--------------------------------------------------------\n");
		
		System.out.println("Clonned Tables : ");
		BaseTable clonnedBaseTable1 = (BaseTable) baseTable.clone();
		BaseTable clonnedBaseTable2 = (BaseTable) baseTable2.clone();
		
		System.out.println("Clonned Table 1 : " + clonnedBaseTable1);
		System.out.println("Clonned Table 2 : " + clonnedBaseTable2);
	}

}
