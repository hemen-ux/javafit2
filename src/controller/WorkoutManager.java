package controller;
import database.DatabaseConnection;
import model.Workoutplan; 
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WorkoutManager {

    private Connection connection;

    public WorkoutManager() {
        connection = DatabaseConnection.connect();
    }

    public boolean addWorkout(Workoutplan workoutPlan) {
        String sql = "INSERT INTO WorkoutPlans (workoutName, duration, intensity) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, workoutPlan.getWorkoutName());
            stmt.setString(2, workoutPlan.getDuration());
            stmt.setString(3, workoutPlan.getIntensity());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Workoutplan> getWorkouts() {
        List<Workoutplan> workouts = new ArrayList<>();
        String sql = "SELECT * FROM WorkoutPlans";
        try (Statement stmt = connection.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                workouts.add(new Workoutplan(
                        rs.getString("workoutName"),
                        rs.getString("duration"),
                        rs.getString("intensity")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return workouts;
    }

}
