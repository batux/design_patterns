package patterndemo.customtable.factory;

import patterndemo.customtable.adapter.BaseTable;

public class SimpleTableFactory implements BaseTableAbstractFactory {

	@Override
	public BaseTable createBaseTable() {
		return new SimpleTable();
	}

}
