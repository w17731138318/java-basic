package factory;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-12 10:01
 * @see
 **/
public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is SmsSender");
	}
}
