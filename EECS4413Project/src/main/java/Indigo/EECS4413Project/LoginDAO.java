package Indigo.EECS4413Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.stereotype.Repository;
@Repository
public class LoginDAO extends User{
	UserRepository userrepo;

	public boolean read(String username, String password){ // getting the username and password from front end form and authenticating
		String query = "SELECT password FROM users WHERE username = ?";

		boolean result = false;
		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1,username);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			if(resultSet.getString(1).equals(password)) {
				result  = true;
			}else {
				result = false;
			}


		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return result;

	}

	public void update(String username, String password) {
		String query = "UPDATE users SET password = ? WHERE username = ?";

		try(Connection conn = DatabaseConnection.connect()){
			PreparedStatement preparedStatement = conn.prepareStatement(query);
			preparedStatement.setString(1,password);
			preparedStatement.setString(2, username);
			preparedStatement.executeUpdate();
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}

