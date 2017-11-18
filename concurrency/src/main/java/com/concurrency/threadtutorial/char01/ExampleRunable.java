package com.concurrency.threadtutorial.char01;

/**
 * Created by Administrator on 2017/11/17.
 */
public class ExampleRunable implements Runnable {
	@Override
	public void run() {
		System.out.println("这是实现Runnable接口的类");
	}
}
