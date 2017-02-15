package ch13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionTest {

	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String url = "jdbc:mysql://127.0.0.1:3306/select_test";
	private final static String user = "root";
	private final static String password = "";

	public static void main(String[] args) throws Exception {
		
		Class.forName(driver);
		
		try
		(
			Connection connection = DriverManager.getConnection(url, user, password)
		)
		{
			connection.setAutoCommit(false);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO student_table VALUES(NULL, ?, ?)", 
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			for (int i = 0; i <= 10; i++) {
				statement.setString(1, "yyy" + i);
				statement.setInt(2, 1);
//				statement.setInt(2, 5); // 违反外键约束，因为teacher_table表中没有ID为5的记录，出现异常将自动回滚。
				statement.executeUpdate();
			}
			connection.commit();
		}

	}

}
