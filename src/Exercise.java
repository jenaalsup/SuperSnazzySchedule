
public class Exercise extends Activity {

	private String exerciseType;
	
	public Exercise(int duration, double startTime, String exerciseType) {
		super(duration, "Exercise", startTime);
		this.exerciseType = exerciseType;
	}
	
	public void setExerciseType(String s) {
		exerciseType = s;
	}

	public String getExerciseType() {
		return exerciseType;
	}
}
