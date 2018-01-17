package bridge.demo1;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:26
 * @see
 **/
public class Benz implements Car {

	@Override
	public void installEngine200() {
		System.out.println("Benz车组装Engine200");
	}

	@Override
	public void installEngine300() {
		System.out.println("Benz车组装Engine300");
	}
}
