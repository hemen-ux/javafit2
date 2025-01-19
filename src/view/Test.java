package view;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class SQLiteExample {
	public static void main(String[] args) {
		String url = "jdbc:sqlite:fitness_app.db";

		try (Connection connection = DriverManager.getConnection(url);
				Statement statement = connection.createStatement()) {

			// Insert data
			String insertSQL = "SELECT * FROM User";
			statement.executeUpdate(insertSQL);
			System.out.println("Data inserted successfully!");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}