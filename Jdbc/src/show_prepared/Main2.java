package show_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	
	PreparedStatement preparedStatement = connection.prepareStatement("update emp set name=? where id=?");
	
	preparedStatement.setInt(2, 5);
	preparedStatement.setString(1, "Marina");
	
	preparedStatement.executeUpdate();
	
	connection.close();
}
}
