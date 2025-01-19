package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
	public static void main(String[] args) {
        
        JFrame frame = new JFrame("Fitness App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        
        JLabel titleLabel = new JLabel("Welcome to Fitness App", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(titleLabel, BorderLayout.NORTH);

        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));

        
        JButton workoutButton = new JButton("Workout Selection");
        JButton dietButton = new JButton("Diet Tracker");
        JButton progressButton = new JButton("Progress Tracker");

        
        buttonPanel.add(workoutButton);
        buttonPanel.add(dietButton);
        buttonPanel.add(progressButton);

        
        frame.add(buttonPanel, BorderLayout.CENTER);

        
        workoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WorkoutSelectionScreen.main(new String[]{});
            }
        });

        dietButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DietTrackerScreen.main(new String[]{});
            }
        });

        progressButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProgressChartScreen.main(new String[]{});
            }
        });

        // Show frame
        frame.setVisible(true);
    }

}
