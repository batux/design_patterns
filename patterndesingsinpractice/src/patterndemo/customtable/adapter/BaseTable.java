package patterndemo.customtable.adapter;

import java.util.List;

public interface BaseTable extends Cloneable {

	public void addRow(Row row);
	public <T> void removeRow(T row);
	public List<Row> getRows();
	public void setRows(List<Row> rows);
	public Object clone() throws CloneNotSupportedException;
}
