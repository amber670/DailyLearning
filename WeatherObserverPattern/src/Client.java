/**
 * 
 * @author Amber
 *
 */
public class Client {
	public static void main(String[] args) {
		//1.创建一个目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		//2.创建观察者
		ConcreteObserver observer1 = new ConcreteObserver();
		ConcreteObserver observer2 = new ConcreteObserver();
		
		observer1.setObserverName("mom");
		observer1.setRemindThing("nice weather,go for shopping");
		
		observer2.setObserverName("darling");
		observer2.setRemindThing("wait for at Central Park at 12:00am~");
		//4.注册观察者
		weather.attach(observer1);
		weather.attach(observer2);
		//4.在目标处发布天气
		weather.setWeatherContent("明天天气晴朗，微风，温度适应，湿度宜人");
		
	}
}
