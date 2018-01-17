package bridge.bridge;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:35
 * @see
 **/
public class Bwm extends Car {

	public Bwm(Engine engine) {
		super(engine);
	}

	@Override
	public void install() {
		System.out.println("Bwm车安装");
		this.getEngine().addEngine();
	}
}
