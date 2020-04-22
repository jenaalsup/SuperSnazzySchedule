
public class Activity {

	private int duration;
	private String activityName;
	private double startTime;
	
	public Activity(int duration, String activityName, double startTime) {
		this.duration = duration;
		this.activityName = activityName;
		this.startTime = startTime;
	}
	
	public void setDuration(int amount) {
		duration = amount;
	}
	
	public void setStartTime(double time) {
		startTime = time;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public double getStartTime() {
		return startTime;
	}
	
}
