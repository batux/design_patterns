package flyweightpatterndesigninpractice.database.connectors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnector {

	private Connection connection;
	private DatabaseType databaseType;
	
	private DatabaseConnector() {}
	
	protected DatabaseConnector(DatabaseType databaseType, String url, String driver, String username, String password) {
		this();
		this.setDatabaseType(databaseType);
		this.createDatabaseConnection(url, driver, username, password);
	}
	
	public DatabaseType getDatabaseType() {
		return databaseType;
	}
	
	public void setDatabaseType(DatabaseType databaseType) {
		this.databaseType = databaseType;
	}
	
	public Connection getConnection() {
		return connection;
	}
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
	
	public ResultSet executeQuery(String sql) {
		try {
			Statement statement = this.getConnection().createStatement();
			return statement.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	    return null;
	}

	public void executeUpdateQuery(String sql) {
		try {
			Statement statement = this.getConnection().createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeDatabaseConnection() {
		try {
			this.getConnection().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	protected void createDatabaseConnection(String url, String driver,
			String username, String password) {
		
		try {
			Class.forName(driver);
			System.out.println("Connecting to database...");
			this.setConnection(DriverManager.getConnection(url,username,password));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
