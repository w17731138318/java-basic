package java8;

import io.reactivex.Flowable;

/**
 * @author 王伟鑫
 * @version 0.1v
 * @create 2018-01-10 13:58
 * @see
 **/
public class ReactivexDemo {
	public static void main(String[] args) {
		Flowable.just("Hello world").subscribe(System.out::println);
	}
}
