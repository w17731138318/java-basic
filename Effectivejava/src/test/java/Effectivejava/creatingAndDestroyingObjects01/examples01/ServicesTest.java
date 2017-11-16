package Effectivejava.creatingAndDestroyingObjects01.examples01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/16.
 */
public class ServicesTest {
	private static Provider DEFAULT_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Default service";
				}
			};
		}
	};

	private static Provider COMP_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Complementary service";
				}
			};
		}
	};

	private static Provider ARMED_PROVIDER = new Provider() {
		public Service newService() {
			return new Service() {
				@Override
				public String toString() {
					return "Armed service";
				}
			};
		}
	};
	@Test
	public void servicesTest() throws Exception {

			// Providers would execute these lines
			Services.registerDefaultProvider(DEFAULT_PROVIDER);
			Services.registerProvider("comp", COMP_PROVIDER);
			Services.registerProvider("armed", ARMED_PROVIDER);

			// Clients would execute these lines
			Service s1 = Services.newInstance();
			Service s2 = Services.newInstance("comp");
			Service s3 = Services.newInstance("armed");
			System.out.printf("%s, %s, %s%n", s1, s2, s3);
	}

}