package com.concurrency.threadtutorial.char01;

/**
 * Created by Administrator on 2017/11/17.
 */
public class AliveOtherThread extends Thread {
	public AliveOtherThread(){
		System.out.println("AliveOtherThread--------begin");
		System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread.isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("AliveOtherThread--------end");
	}
	@Override
	public void run() {
		super.run();
		System.out.println("run---------begin");
		System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("this.isAlive()=" + this.isAlive());
		System.out.println("run---------end");

	}
}
