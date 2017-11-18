package com.concurrency.threadtutorial.char01;

/**
 * Created by Administrator on 2017/11/17.
 */
public class NotShareDataThread extends Thread {
	private Integer count = 5;

	public NotShareDataThread(String name) {
		super();
		this.setName(name);
	}

	@Override
	public void run() {
		super.run();
		System.out.println("===========");
		while (count > 0) {
			count--;
			System.out.println(currentThread().getName() + "计算，count=" + count);
		}
	}
}
