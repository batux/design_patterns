package patterndemo.customtable.factory;

import patterndemo.customtable.adapter.BaseTable;

public class BaseTableFactorySelector {

	public static BaseTable getBaseTable(BaseTableAbstractFactory factory) {
		return factory.createBaseTable();
	}
	
}
