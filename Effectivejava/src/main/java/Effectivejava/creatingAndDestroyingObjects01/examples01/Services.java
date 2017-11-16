package Effectivejava.creatingAndDestroyingObjects01.examples01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/11/16.
 * 服务提供者框架示意图
 */
public class Services {

	// Prevents instantiation
	// 私有构造器，防止实例化
	private Services() {
	}

	// Maps service names to services
	// 将服务名称映射到服务(容器)
	private static final Map<String, Provider> providers = new ConcurrentHashMap<String, Provider>();

	public static final String DEFAULT_PROVIDER_NAME = "<def>";

	// Provider registration API
	// API提供者注册
	public static void registerDefaultProvider(Provider p) {
		registerProvider(DEFAULT_PROVIDER_NAME, p);
	}
	public static void registerProvider(String name, Provider p) {
		providers.put(name, p);
	}

	// Service access API
	// 服务访问API
	public static Service newInstance() {
		return newInstance(DEFAULT_PROVIDER_NAME);
	}

	public static Service newInstance(String name) {
		Provider p = providers.get(name);
		if (p == null)
			throw new IllegalArgumentException(
					"No provider registered with name 没有提供者用这个名字注册服务: " + name);
		return p.newService();
	}
}
