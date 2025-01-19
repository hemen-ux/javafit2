package controller;
import model.User;

import java.sql.*;

public class UserManager {
	private Connection connection;

    public UserManager() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:fitness_app.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean registerUser(User user) {
        String sql = "INSERT INTO Users (username, password, age, height, weight, fitnessGoal) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setInt(3, user.getAge());
            stmt.setDouble(4, user.getHeight());
            stmt.setDouble(5, user.getWeight());
            stmt.setString(6, user.getFitnessGoal());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean loginUser(String username, String password) {
        String sql = "SELECT * FROM User WHERE username = ? AND password = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            System.out.println(stmt);
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("there is no data");
            return false;
        }
    }
}
