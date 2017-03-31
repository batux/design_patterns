package patterndemo.customtable.builder;

import java.io.Serializable;

public class Column<T extends Object> implements Serializable, Cloneable{

	private static final long serialVersionUID = 1716615540025987698L;
	
	private long index;
	private String name;
	private Class<T> type;
	private T value;
	
	private Column() { }
	
	private Column(ColumnBuilder<T> builder) {
		this.setIndex(builder.getIndex());
		this.setName(builder.getName());
		this.setType(builder.getType());
		this.setValue(builder.getValue());
		value.getClass();
	}
	
	public long getIndex() {
		return index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Class<T> getType() {
		return type;
	}

	private void setType(Class<T> type) {
		this.type = type;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public static class ColumnBuilder<T extends Object> {
		
		/* Required Parameters */
		private long index;
		private String name;
		
		/* Optional Parameters */
		private Class<T> type;
		private T value;
		
		public ColumnBuilder(long index, String name) {
			this.setIndex(index);
			this.setName(name);
		}
		
		public long getIndex() {
			return index;
		}
		public void setIndex(long index) {
			this.index = index;
		}
		
		private void setType(Class<T> type) {
			this.type = type;
		}
		public Class<T> getType() {
			return type;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
		
		public ColumnBuilder<T> setColumnType(Class<T> type) {
			this.setType(type);
			return this;
		}
		
		public ColumnBuilder<T> setColumnValue(T value) {
			this.setValue(value);
			return this;
		}
		
		public Column<T> build() {
			return new Column<T>(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (index ^ (index >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		Column<T> other = (Column<T>) obj;
		if (index != other.index)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n Column [index=" + index + ", name=" + name + ", type=" + type
				+ ", value=" + value + "] \n";
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return new ColumnBuilder(this.getIndex(), this.getName())
		.setColumnType(this.getType()).setColumnValue(this.getValue()).build();
		
	}
}
