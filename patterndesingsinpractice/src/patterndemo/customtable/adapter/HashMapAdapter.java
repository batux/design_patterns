package patterndemo.customtable.adapter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import patterndemo.customtable.builder.Column;

public class HashMapAdapter<M extends Object,V extends List<M>,T extends HashMap<Long,V>> implements BaseTableAdapter<T> {

	@Override
	public void fillBaseTable(T source, BaseTable baseTable) {
		
		
		// Kolon - Satır ilişkisini gözden geçir ve yeniden kodla bu kısmı !!!
		Set<Long> keyset = source.keySet();
		
		V columNames = source.get(0L);
		keyset.remove(0L);
		List<Long> keys = Arrays.asList(keyset.toArray(new Long[0]));
		
		for(Long key : keys) {
			V values = source.get(key);
			
			int index = 0;
			Row row = new Row();
			for(M value : values) {
				Class<M> type = (Class<M>) value.getClass();
				Column<M> column = new Column.ColumnBuilder<M>(key, String.valueOf(columNames.get(index)))
											.setColumnType(type)
											.setColumnValue(value).build();
				
				row.addColumn(column);
				index++;
			}
			baseTable.addRow(row);
		}
	}

}
