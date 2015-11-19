/**
 * 具体的目标对象，负责把有关状态存入相应的观察者对象
 * @author Amber
 *
 */
public class ConcreteWeatherSubject extends WeatherSubject {
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String subjectState) {
		this.weatherContent = subjectState;
		this.notifyObservers();
	}
	
}
