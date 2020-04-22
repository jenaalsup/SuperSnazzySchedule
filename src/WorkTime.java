
public class WorkTime extends Activity{

	private String details; // specifics entered by user about task
	
	public WorkTime(int duration, double startTime, String details) {
		super(duration, "Work Time", startTime);
		this.details = details;
	} 

	public void setDetails(String s) {
		details = s;
	}
	
	public String getDetails() {
		return details;
	}
}
