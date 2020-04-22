
public class Leisure extends Activity {
	
	private String typeOfLeisure;

	public Leisure(int duration, double startTime, String typeOfLeisure) {
		super(duration, "Leisure Activity", startTime);
		this.typeOfLeisure = typeOfLeisure;
	}
	
	public void setLeisure(String s) {
		typeOfLeisure = s;
	}

	public String getLeisure() {
		return typeOfLeisure;
	}
	
}
 