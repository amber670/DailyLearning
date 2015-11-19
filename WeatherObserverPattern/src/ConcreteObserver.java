/**
 * 这是一个具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @author Amber
 *
 */
public class ConcreteObserver implements Observer{
	//获取天气信息
	private String weatherContent;
	//获取观察者信息
	private String observerName;
	//获取提示信息
	private String remindThing;
	
	public String getWeatherContent() {
		return weatherContent;
	}
	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}
	public String getObserverName() {
		return observerName;
	}
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	public String getRemindThing() {
		return remindThing;
	}
	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}
	@Override
	
	//获取目标类的状态，同步到观察者的状态
	public void update(WeatherSubject subject){
		System.out.println(observerName+"收到了"+weatherContent+","+remindThing);
		weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
	}
}
