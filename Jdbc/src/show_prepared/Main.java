package show_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	
	PreparedStatement preparedStatement = connection.prepareStatement("insert into emp values(?,?)");
	
	preparedStatement.setInt(1, 4);
	preparedStatement.setString(2, "sweaty");
	
	preparedStatement.executeUpdate();
	System.out.println("data inserted");
	
	connection.close();
}
}
