package patterndemo.customtable.adapter;

import java.util.List;

import patterndemo.customtable.builder.Column;

public class DataItemAdapter<Z extends Object, K extends List<Z>, M extends DataItem<Z,K>, T extends List<M>> implements BaseTableAdapter<T> {

	@Override
	public void fillBaseTable(T source, BaseTable baseTable) {
		
		M firstItem = source.get(0);
		int rowCount = firstItem.values.size();
		
		for(int i=0; i < rowCount; i++) {
			Row row = new Row();
			for(M item : source) {

				Z value = item.values.get(i);
				
				Class<Z> type = (Class<Z>) value.getClass();
				Column<Z> column = new Column.ColumnBuilder<Z>(item.index, item.name)
											.setColumnType(type)
											.setColumnValue(value).build();
				
				row.addColumn(column);
			}
			baseTable.addRow(row);
		}
	}

}
