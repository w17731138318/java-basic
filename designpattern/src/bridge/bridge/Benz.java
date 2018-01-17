package bridge.bridge;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:33
 * @see
 **/
public class Benz extends Car {

	public Benz(Engine engine) {
		super(engine);
	}

	public void install() {
		System.out.println("Benz车安装");
		this.getEngine().addEngine();
	}
}
