
public class SchoolMeeting extends Activity{

	private String className;
	
	public SchoolMeeting(int duration, double startTime, String className) {
		super(duration, "School Meeting", startTime);
		this.className = className;
	}

	public void setClassName(String c) {
		className = c;
	}
	
	public String getClassName() {
		return className;
	}
}
