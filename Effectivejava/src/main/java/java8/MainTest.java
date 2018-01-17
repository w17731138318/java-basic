package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-22 9:17
 * @see
 **/
public class MainTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		List<String> list = new ArrayList<>();
		for (String aList : list) {
			System.out.println(aList);
		}
	}
}
