package facadepatterndesigninpractice.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import flyweightpatterndesigninpractice.connector.factory.DatabaseConnectorFactory;
import flyweightpatterndesigninpractice.database.connectors.DatabaseConnector;
import flyweightpatterndesigninpractice.database.connectors.DatabaseType;

public class ReportsHelper {

	public static void generateReport(ReportType reportType) throws SQLException {
		
		if(ReportType.FLIGHTS_AND_USERS_COUNT_SUMMARY.equals(reportType)) {
			
			// CREATE REPORT FROM TWO DIFFERENT DATABASE SOURCES !
			int usersCount = getUsersCount();
			int flightsCount = getFlightsCount();
			System.out.println("Users count : " + usersCount + " Flights count : " + flightsCount);
		}
		else if(ReportType.ALL_FLIGHTS_SUMMARY.equals(reportType)) {
			int flightsCount = getFlightsCount();
			System.out.println("Flights count : " + flightsCount);
		}
		else if(ReportType.ALL_USERS_SUMMARY.equals(reportType)) {
			int usersCount = getUsersCount();
			System.out.println("Users count : " + usersCount);
		}
	}
	
	private static int getUsersCount() throws SQLException {
		
		DatabaseConnector mysqlDatabaseConnector = DatabaseConnectorFactory.getDatabaseConnector(
				DatabaseConnectorInfoHelper.getDatabaseConnectorInfo(DatabaseType.MYSQL));
		
		ResultSet usersCountResult = mysqlDatabaseConnector.executeQuery("SELECT COUNT(*) FROM Users;");
		usersCountResult.next();
		int usersCount = usersCountResult.getInt(1);
		return usersCount;
	}
	
	private static int getFlightsCount() throws SQLException {
		
		DatabaseConnector apacheDerbyDatabaseConnector = DatabaseConnectorFactory.getDatabaseConnector(
				DatabaseConnectorInfoHelper.getDatabaseConnectorInfo(DatabaseType.APACHE_DERBY));
		
		ResultSet flightsCountResult = apacheDerbyDatabaseConnector.executeQuery("SELECT COUNT(*) FROM FLIGHTS");
		flightsCountResult.next();
		int flightsCount = flightsCountResult.getInt(1);
		return flightsCount;
	}
	
}
