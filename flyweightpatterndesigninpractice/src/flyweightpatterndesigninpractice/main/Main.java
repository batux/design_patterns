package flyweightpatterndesigninpractice.main;

import java.sql.SQLException;

import flyweightpatterndesigninpractice.connector.factory.DatabaseConnectorFactory;
import flyweightpatterndesigninpractice.connector.factory.DatabaseConnectorInfo;
import flyweightpatterndesigninpractice.database.connectors.DatabaseConnector;
import flyweightpatterndesigninpractice.database.connectors.DatabaseType;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) throws SQLException {
		
		DatabaseConnectorInfo databaseConnectorInfo1 = new DatabaseConnectorInfo();
		databaseConnectorInfo1.setDatabaseType(DatabaseType.APACHE_DERBY);
		databaseConnectorInfo1.setDriver("org.apache.derby.jdbc.ClientDriver");
		databaseConnectorInfo1.setPassword("root");
		databaseConnectorInfo1.setUsername("root");
		databaseConnectorInfo1.setUrl("jdbc:derby://localhost//home/batuhan/Desktop/db-derby-10.11.1.1-bin/demo/databases/toursdb");
		
		DatabaseConnectorInfo databaseConnectorInfo2 = new DatabaseConnectorInfo();
		databaseConnectorInfo2.setDatabaseType(DatabaseType.MYSQL);
		databaseConnectorInfo2.setDriver("com.mysql.jdbc.Driver");
		databaseConnectorInfo2.setPassword("root");
		databaseConnectorInfo2.setUsername("root");
		databaseConnectorInfo2.setUrl("jdbc:mysql://localhost:3306/mysql");
		
		DatabaseConnector apacheDerbyConnector1 = DatabaseConnectorFactory.getDatabaseConnector(databaseConnectorInfo1);
		DatabaseConnector mysqlConnector1 = DatabaseConnectorFactory.getDatabaseConnector(databaseConnectorInfo2);
		
		DatabaseConnector apacheDerbyConnector2 = DatabaseConnectorFactory.getDatabaseConnector(databaseConnectorInfo1);
		DatabaseConnector mysqlConnector2 = DatabaseConnectorFactory.getDatabaseConnector(databaseConnectorInfo2);
		
		System.out.println("Apache Derby Database-1 Status : " + !apacheDerbyConnector1.getConnection().isClosed());
		System.out.println("Mysql Database-2 Status : " + !mysqlConnector1.getConnection().isClosed());
		
		if(apacheDerbyConnector1 == apacheDerbyConnector2) {
			System.out.println("Apache Derby Database Connectors are same.");
		}
		if(mysqlConnector1 == mysqlConnector2) {
			System.out.println("Mysql Database Connectors are same.");
		}
	}

}
