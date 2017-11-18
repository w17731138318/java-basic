package com.concurrency.threadtutorial.char01;

/**
 * 打印：
 * 构造方法的打印：main
 * run方法的打印：Thread-0
 *
 */
public class ExampleCurrentThread extends Thread {
	public ExampleCurrentThread() {
		System.out.println("构造方法的打印：" + Thread.currentThread().getName());
	}

	@Override
	public void run() {
		super.run();
		System.out.println("run方法的打印：" + Thread.currentThread().getName());
	}
}
