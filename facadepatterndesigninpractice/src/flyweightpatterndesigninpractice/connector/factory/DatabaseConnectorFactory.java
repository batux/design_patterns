package flyweightpatterndesigninpractice.connector.factory;

import java.util.HashMap;

import flyweightpatterndesigninpractice.database.connectors.ApacheDatabaseConnector;
import flyweightpatterndesigninpractice.database.connectors.DatabaseConnector;
import flyweightpatterndesigninpractice.database.connectors.DatabaseType;
import flyweightpatterndesigninpractice.database.connectors.MySQLDatabaseConnector;

public class DatabaseConnectorFactory {
	
	private static final HashMap<DatabaseType, DatabaseConnector> databaseConnectors = new HashMap<DatabaseType, DatabaseConnector>();

	public static DatabaseConnector getDatabaseConnector(DatabaseConnectorInfo databaseConnectorInfo) {
		
		DatabaseConnector databaseConnector = databaseConnectors.get(databaseConnectorInfo.getDatabaseType());
		if(databaseConnector == null) {
			if(databaseConnectorInfo.getDatabaseType().equals(DatabaseType.APACHE_DERBY)) {
				databaseConnector = new ApacheDatabaseConnector(
											databaseConnectorInfo.getDatabaseType(), 
											databaseConnectorInfo.getUrl(), 
											databaseConnectorInfo.getDriver(), 
											databaseConnectorInfo.getUsername(), 
											databaseConnectorInfo.getPassword());
			}
			else if(databaseConnectorInfo.getDatabaseType().equals(DatabaseType.MYSQL)){
				databaseConnector = new MySQLDatabaseConnector(databaseConnectorInfo.getDatabaseType(), 
											databaseConnectorInfo.getUrl(), 
											databaseConnectorInfo.getDriver(), 
											databaseConnectorInfo.getUsername(), 
											databaseConnectorInfo.getPassword());
			}
			// you can add more database connectors ...
			databaseConnectors.put(databaseConnectorInfo.getDatabaseType(), databaseConnector);
		}
		return databaseConnector;
	}
	
}
