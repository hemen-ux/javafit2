package view;
import controller.WorkoutManager;
import model.Workoutplan;

import javax.swing.*;
import java.awt.*;
import java.util.List;


public class WorkoutSelectionScreen {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Fitness App - Workout Selection");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        frame.add(panel);

        JLabel label = new JLabel("Available Workouts", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(label, BorderLayout.NORTH);

        DefaultListModel<String> workoutListModel = new DefaultListModel<>();
        JList<String> workoutList = new JList<>(workoutListModel);
        panel.add(new JScrollPane(workoutList), BorderLayout.CENTER);

        JButton selectButton = new JButton("Select Workout");
        panel.add(selectButton, BorderLayout.SOUTH);

        WorkoutManager workoutManager = new WorkoutManager();
        List<Workoutplan> workouts = workoutManager.getWorkouts();

        for (Workoutplan workout : workouts) {
            workoutListModel.addElement(workout.getWorkoutName() + " (" + workout.getDuration() + ", " + workout.getIntensity() + ")");
        }

        selectButton.addActionListener(e -> {
            String selectedWorkout = workoutList.getSelectedValue();
            if (selectedWorkout != null) {
                JOptionPane.showMessageDialog(panel, "You selected: " + selectedWorkout);
            } else {
                JOptionPane.showMessageDialog(panel, "Please select a workout.");
            }
        });

        frame.setVisible(true);
    }

}
