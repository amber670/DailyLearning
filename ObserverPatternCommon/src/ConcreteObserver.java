/**
 * 这是一个具体的观察者对象，实现更新的方法，使自身的状态和目标的状态保持一致
 * @author Amber
 *
 */
public class ConcreteObserver implements Observer{
	
	private String observerState;
	@Override
	
	//获取目标类的状态，同步到观察者的状态
	public void update(Subject subject){
		observerState = ((ConcreteSubject)subject).getSubjectState();
	}
}
