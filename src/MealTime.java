
public class MealTime extends Activity {
	
	private String meal; // type of meal: breakfast, lunch, snack, dinner

	public MealTime(int duration, double startTime, String meal) {
		super(duration, "Meal Time", startTime);
		this.meal = meal;
	}
	
	public void setMeal(String s) {
		meal = s;
	}
	
	public String getMeal() {
		return meal;
	}

}
 