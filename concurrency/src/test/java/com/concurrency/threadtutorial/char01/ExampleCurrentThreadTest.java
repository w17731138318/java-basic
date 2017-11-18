package com.concurrency.threadtutorial.char01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/18.
 */
public class ExampleCurrentThreadTest {
	/**
	 * 打印：
	 * 构造方法的打印：main
	 * run方法的打印：Thread-0
	 * 为什么我们在ExampleCurrentThread内部用Thread.currentThread()会显示构造方法的打印是main，
	 * 是因为Thread.currentThread()返回的是代码段正在被那个线程调用的信息。这里面很显然构造方法是被main线程执行的，
	 * 而run方法是被我们自己启动的线程执行的，因为没有给他起名字，所以默认是Thread-0。
	 */
	@Test
	public void run() throws Exception {
		ExampleCurrentThread thread = new ExampleCurrentThread();
		thread.start();
		Thread.sleep(1000);
	}

}