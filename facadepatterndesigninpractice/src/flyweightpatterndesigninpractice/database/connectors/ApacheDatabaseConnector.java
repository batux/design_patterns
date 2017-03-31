package flyweightpatterndesigninpractice.database.connectors;

public class ApacheDatabaseConnector extends DatabaseConnector {
	
	public ApacheDatabaseConnector(DatabaseType databaseType, String url,
			String driver, String username, String password) {
		super(databaseType, url, driver, username, password);
	}
}
