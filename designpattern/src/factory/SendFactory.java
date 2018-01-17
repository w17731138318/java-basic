package factory;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-12 10:02
 * @see
 **/
public class SendFactory {
	public Sender produce(String type) {
		if ("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("请输入正确的类型!");
			return null;
		}
	}
}
