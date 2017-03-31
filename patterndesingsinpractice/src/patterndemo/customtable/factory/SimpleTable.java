package patterndemo.customtable.factory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import patterndemo.customtable.adapter.BaseTable;
import patterndemo.customtable.adapter.Row;

public class SimpleTable implements BaseTable, Serializable {

	private static final long serialVersionUID = 8704171633462228833L;

	private List<Row> rows;
	
	public SimpleTable() {
		setRows(new ArrayList<Row>());
	}

	public void addRow(Row row) {
		this.getRows().add(row);
	}
	
	public <T> void removeRow(T row) {
		this.getRows().remove(row);
	}
	
	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
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
		SimpleTable other = (SimpleTable) obj;
		if (rows == null) {
			if (other.rows != null)
				return false;
		} else if (!rows.equals(other.rows))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SimpleTable [rows=" + rows + "]";
	}
	
	// Prototype pattern - Deep Clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		SimpleTable clonnedSimpleTable = null;
		try {
			clonnedSimpleTable = SimpleTable.class.newInstance();
			for(Row row : this.getRows()) {
				Row clonnedRow = (Row) row.clone();
				clonnedSimpleTable.addRow(clonnedRow);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return clonnedSimpleTable;
	}
}
