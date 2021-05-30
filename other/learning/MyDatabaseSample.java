package other.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabaseSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/selenium");
		
		Statement statement = connection.createStatement();
		
		ResultSet query = statement.executeQuery("SELECT * FROM s_login");
		
		while (query.next()) {
			
			System.out.println("Login table UserId value is: "+query.getString(1)+"		Login table Username value is: "+query.getString(2)+"		Login table password value is: "+query.getString(3));
		}
		

	}

}
