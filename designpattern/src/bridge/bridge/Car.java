package bridge.bridge;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 9:32
 * @see
 **/
public abstract class Car {
	private Engine engine;

	public Car(Engine engine){
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public abstract void install();
}
