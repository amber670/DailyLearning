/**
 * 具体的目标对象，负责把有关状态存入相应的观察者对象
 * @author Amber
 *
 */
public class ConcreteSubject extends Subject {
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObservers();
	}
	
}
