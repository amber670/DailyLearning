import java.util.ArrayList;
import java.util.List;



/**
 * 目标对象，它知道它的观察者，并提供注册和删除观察者的接口
 * @author Amber
 *
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	
	//注册删除观察者方法
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void detach(Observer observer){
		observers.remove(observer);
		
	}
	
	//通知观察者
	protected void notifyObservers(){
		for(Observer observer:observers){
			observer.update(this);
		}
	}
}
