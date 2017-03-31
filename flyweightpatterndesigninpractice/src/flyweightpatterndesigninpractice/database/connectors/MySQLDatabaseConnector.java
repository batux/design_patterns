package flyweightpatterndesigninpractice.database.connectors;

public class MySQLDatabaseConnector extends DatabaseConnector {

	public MySQLDatabaseConnector(DatabaseType databaseType, String url,
			String driver, String username, String password) {
		super(databaseType, url, driver, username, password);
	}

}
