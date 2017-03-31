package patterndemo.customtable.adapter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import patterndemo.customtable.builder.Column;

public class Row implements Serializable, Cloneable{

	private static final long serialVersionUID = 1838837071779539697L;

	private List<Column<?>> columns;
	
	public Row() {
		setColumns(new ArrayList<Column<?>>());
	}
	
	public <T> void addColumn(Column<T> column) {
		columns.add(column);
	}
	
	public <T> void remove(Column<T> column) {
		columns.remove(column);
	}

	public List<Column<?>> getColumns() {
		return columns;
	}

	public void setColumns(List<Column<?>> columns) {
		this.columns = columns;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columns == null) ? 0 : columns.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Row other = (Row) obj;
		if (columns == null) {
			if (other.columns != null)
				return false;
		} else if (!columns.equals(other.columns))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n Row [columns=" + columns + "] \n";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Row clonnedRow = null;
		try {
			clonnedRow = Row.class.newInstance();
			for(Column<?> column : this.getColumns()) {
				Column<?> clonnedColumn = (Column<?>) column.clone();
				clonnedRow.addColumn(clonnedColumn);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return clonnedRow;
	}
}
