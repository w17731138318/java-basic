package com.concurrency.threadtutorial.char01;

/**
 * Created by Administrator on 2017/11/17.
 */
public class AliveThread extends Thread {
	@Override
	public void run(){
		super.run();
		System.out.println("run方法中是否存活:"+Thread.currentThread().isAlive());
	}
}
