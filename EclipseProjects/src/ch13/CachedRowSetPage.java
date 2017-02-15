package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetPage {

	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://127.0.0.1:3306/select_test";
	private final static String user = "root";
	private final static String password = "";

	public static void main(String[] args) throws Exception {
		
		Class.forName(driver);
		
		try
		(
			Connection connection = DriverManager.getConnection(url, user, password);
			PreparedStatement statement = connection.prepareStatement("select * from jdbc_test",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet resultSet = statement.executeQuery()
		)
		{
			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet rowSet = factory.createCachedRowSet();
			rowSet.setPageSize(10);
			rowSet.populate(resultSet, 5);
			
			while (rowSet.next()) {
				System.out.println(rowSet.getString(1) + "\t"
						+ rowSet.getString(2) + "\t"
						+ rowSet.getString(3));
			}
		}
		
	}

}
