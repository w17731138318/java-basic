package bridge.bridge1;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:35
 * @see
 **/
public class Bwm implements Car {

	private final Engine engine;

	public Bwm(Engine engine) {
		this.engine = engine;
	}

	@Override
	public Engine getEngine() {
		return engine;
	}


	@Override
	public void install() {
		System.out.println("Bwm车安装");
		this.getEngine().addEngine();
	}
}
