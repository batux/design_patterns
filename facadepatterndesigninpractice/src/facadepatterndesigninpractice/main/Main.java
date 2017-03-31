package facadepatterndesigninpractice.main;

import java.sql.SQLException;

import facadepatterndesigninpractice.helper.ReportType;
import facadepatterndesigninpractice.helper.ReportsHelper;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) throws SQLException {
		// Facade Pattern Design
		ReportsHelper.generateReport(ReportType.FLIGHTS_AND_USERS_COUNT_SUMMARY);
		ReportsHelper.generateReport(ReportType.ALL_FLIGHTS_SUMMARY);
		ReportsHelper.generateReport(ReportType.ALL_USERS_SUMMARY);
	}

}
