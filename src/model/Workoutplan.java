package model;

public class Workoutplan {

    private String workoutName;
    private String duration; 
    private String intensity; 

    public Workoutplan(String workoutName, String duration, String intensity) {
        this.workoutName = workoutName;
        this.duration = duration;
        this.intensity = intensity;
    }

    
    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "Workout: " + workoutName + ", Duration: " + duration + ", Intensity: " + intensity;
    }

}
