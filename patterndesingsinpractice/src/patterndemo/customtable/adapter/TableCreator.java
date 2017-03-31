package patterndemo.customtable.adapter;

import patterndemo.customtable.factory.BaseTableAbstractFactory;
import patterndemo.customtable.factory.BaseTableFactorySelector;

public class TableCreator<T> {

	public BaseTable createBaseTable(T source, BaseTableAbstractFactory factory, BaseTableAdapter<T> adapter) {
		BaseTable baseTable = BaseTableFactorySelector.getBaseTable(factory);
		adapter.fillBaseTable(source, baseTable);
		return baseTable;
	}
}
