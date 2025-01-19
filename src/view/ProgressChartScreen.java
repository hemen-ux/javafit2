package view;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.swing.*;
import controller.ProgressManager;
import java.util.List;

public class ProgressChartScreen {
	public static void main(String[] args) {
        ProgressManager progressManager = new ProgressManager();
        List<String> progressLogs = progressManager.getProgressLogs();

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String log : progressLogs) {
            String[] parts = log.split(":");
            String date = parts[0];
            double weight = Double.parseDouble(parts[1].replace("kg", "").trim());
            dataset.addValue(weight, "Weight", date);
        }

        JFreeChart chart = ChartFactory.createLineChart("Weight Progress", "Date", "Weight (kg)", dataset);

        JFrame frame = new JFrame("Progress Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new ChartPanel(chart));
        frame.setVisible(true);
    }
}
