package bridge.bridge1;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:35
 * @see
 **/
public class Client {
	public static void main(String[] args) {
		Engine engine200=new Engine200();
		//第二种 引擎
		Engine engine300=new Engine300();
		//创建抽象    ->车
		Car benz=new Benz(engine200);
		benz.install();
		/**
		 * 
		 */

		Car bwm=new Bwm(engine300);
		bwm.install();
	}
}
