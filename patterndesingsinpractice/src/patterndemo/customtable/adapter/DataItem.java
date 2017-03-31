package patterndemo.customtable.adapter;

import java.util.List;

public class DataItem<K extends Object, T extends List<K>> {

	public long index;
	public String name;
	public T values;
}
