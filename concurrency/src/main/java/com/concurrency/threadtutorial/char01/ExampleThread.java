package com.concurrency.threadtutorial.char01;

/**
 * Created by Administrator on 2017/11/17.
 */
public class ExampleThread extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println("这是一个继承自Thread的ExampleThread");
	}
}
