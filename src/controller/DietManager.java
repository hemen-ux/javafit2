package controller;

	import database.DatabaseConnection;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;

	public class DietManager {
	    private Connection connection;

	    public DietManager() {
	        connection = DatabaseConnection.connect();
	    }

	    public boolean addMeal(String meal, double calories) {
	        String sql = "INSERT INTO DietLog (userId, date, meal, calories) VALUES (1, date('now'), ?, ?)";
	        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
	            stmt.setString(1, meal);
	            stmt.setDouble(2, calories);
	            stmt.executeUpdate();
	            return true;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

		public void logMeal(String meal, double calories) {
			// TODO Auto-generated method stub
			
		}
	    }
