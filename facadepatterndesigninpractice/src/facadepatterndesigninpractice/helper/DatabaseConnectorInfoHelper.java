package facadepatterndesigninpractice.helper;

import flyweightpatterndesigninpractice.connector.factory.DatabaseConnectorInfo;
import flyweightpatterndesigninpractice.database.connectors.DatabaseType;

public class DatabaseConnectorInfoHelper {

	public static DatabaseConnectorInfo getDatabaseConnectorInfo(DatabaseType databaseType) {
		if(DatabaseType.APACHE_DERBY.equals(databaseType)) {
			DatabaseConnectorInfo databaseConnectorInfo1 = new DatabaseConnectorInfo();
			databaseConnectorInfo1.setDatabaseType(DatabaseType.APACHE_DERBY);
			databaseConnectorInfo1.setDriver("org.apache.derby.jdbc.ClientDriver");
			databaseConnectorInfo1.setUrl("jdbc:derby://localhost:1527//home/batuhan/Desktop/db-derby-10.11.1.1-bin/demo/databases/toursdb");
			return databaseConnectorInfo1;
		}
		else if(DatabaseType.MYSQL.equals(databaseType)) {
			DatabaseConnectorInfo databaseConnectorInfo2 = new DatabaseConnectorInfo();
			databaseConnectorInfo2.setDatabaseType(DatabaseType.MYSQL);
			databaseConnectorInfo2.setDriver("com.mysql.jdbc.Driver");
			databaseConnectorInfo2.setPassword("root");
			databaseConnectorInfo2.setUsername("root");
			databaseConnectorInfo2.setUrl("jdbc:mysql://localhost:3306/bookdb");
			return databaseConnectorInfo2;
		}
		return null;
	}
	
}
