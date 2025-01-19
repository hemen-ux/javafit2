package view;
import controller.DietManager;

import javax.swing.*;
import java.awt.*;

public class DietTrackerScreen {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Diet Tracker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel mealLabel = new JLabel("Meal:");
        JTextField mealField = new JTextField(10);
        JLabel caloriesLabel = new JLabel("Calories:");
        JTextField caloriesField = new JTextField(5);
        JButton logButton = new JButton("Log Meal");

        DietManager dietManager = new DietManager();

        logButton.addActionListener(e -> {
            String meal = mealField.getText();
            double calories = Double.parseDouble(caloriesField.getText());
            dietManager.logMeal(meal, calories);
            JOptionPane.showMessageDialog(frame, "Meal logged successfully!");
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(mealLabel);
        frame.add(mealField);
        frame.add(caloriesLabel);
        frame.add(caloriesField);
        frame.add(logButton);

        frame.setVisible(true);
    }

}
