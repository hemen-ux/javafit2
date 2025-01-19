package controller;
import java.util.Timer;
import java.util.TimerTask;
public class Remainder {
	public void scheduleReminder(String message, int intervalSeconds) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Reminder: " + message);
            }
        }, 0, intervalSeconds * 1000);
    }
}
