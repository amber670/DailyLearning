/**
 * 这是一个观察者接口，定义一个更新的接口给那些在目标发生改变的时候通知的对象
 * @author Amber
 *
 */
public interface Observer {
	public void update(Subject subject);
}
