package bridge.demo1;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:24
 * @see
 **/
public class Bwm implements Car {

	@Override
	public void installEngine200() {
		System.out.println("Bwm车组装Engine200");
	}

	@Override
	public void installEngine300() {
		System.out.println("Bwm车组装Engine300");
	}
}
