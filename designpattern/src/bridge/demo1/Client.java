package bridge.demo1;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:25
 * @see
 **/
public class Client {
	public static void main(String[] args) {
		//奔驰车安装200引擎
		Car benz=new Benz();
		benz.installEngine200();
		//宝马车安装300引擎
		Car bwm=new Bwm();
		bwm.installEngine300();
	}
}
