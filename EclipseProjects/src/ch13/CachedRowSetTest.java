package ch13;

import java.sql.*;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetTest {
	
	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://127.0.0.1:3306/select_test";
	private final static String user = "root";
	private final static String password = "";

	public static void main(String[] args) throws Exception {
		
		Class.forName(driver);
		
		try {
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement statement = connection.prepareStatement("select * from student_table", 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = statement.executeQuery();
			RowSetFactory rowSetFactory = RowSetProvider.newFactory();
			CachedRowSet cachedRowSet = rowSetFactory.createCachedRowSet();
			cachedRowSet.populate(resultSet);
			resultSet.close();
			statement.close();
			connection.close();
			
			cachedRowSet.last();
			while (cachedRowSet.previous()) {
				System.out.println(cachedRowSet.getString(1) + "\t"
						+ cachedRowSet.getString(2) + "\t"
						+ cachedRowSet.getString(3) + "\t");
				
				if (cachedRowSet.getInt("student_id") == 3) {
					cachedRowSet.updateString("student_name", "hehe");
					cachedRowSet.updateRow();
				}
			}
			
			connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			cachedRowSet.acceptChanges(connection);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
