package model;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Dietlog {

    public void logMeal(String meal, double calories) {
        try (Connection conn = DatabaseConnection.connect()) {
            String sql = "INSERT INTO DietLog (meal, calories, date, userId) VALUES (?, ?, date('now'), 1)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, meal);
            stmt.setDouble(2, calories);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
