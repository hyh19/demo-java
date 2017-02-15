package ch13;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DatabaseMetaDataTest {

	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://127.0.0.1:3306/select_test";
	private final static String user = "root";
	private final static String password = "";
	
	public static void printResultSet(ResultSet resultSet) throws SQLException {
		ResultSetMetaData metaData = resultSet.getMetaData();
		System.out.println("-------- Print Column Name --------");
		for (int i = 1; i <= metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i) + "\t");
		}
		System.out.println();
		
		System.out.println("-------- Print Record Value --------");
		while (resultSet.next()) {
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				System.out.print(resultSet.getString(i) + "\t");
			}
			System.out.println();
		}
		resultSet.close();
	}
	
	public static void main(String[] args) throws Exception {

		Class.forName(driver);

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			
			DatabaseMetaData metaData = connection.getMetaData();
			
			ResultSet resultSet = metaData.getTableTypes();
			printResultSet(resultSet);
			
			resultSet = metaData.getTables(null, null, "%", new String[]{"TABLE"});
			printResultSet(resultSet);
			
			resultSet = metaData.getPrimaryKeys(null, null, "student_table");
			printResultSet(resultSet);
		}

	}

}
