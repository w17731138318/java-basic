package com.concurrency.threadtutorial.char01;

/**
 * Thread，用this调用。
 * begin=========
 Thread.currentThread().getName=main
 this.getName()=Thread-0
 end===========
 run begin=======
 Thread.currentThread().getName=byhieg
 this.getName()=byhieg
 run end==========
 */
public class ComplexCurrentThread extends Thread {
	public ComplexCurrentThread() {
		System.out.println("begin=========");
		System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());

		System.out.println("this.getName()=" + this.getName());
		System.out.println("end===========");
	}

	@Override
	public void run() {
		super.run();
		System.out.println("run begin=======");
		System.out.println("Thread.currentThread().getName=" + Thread.currentThread().getName());
		System.out.println("this.getName()=" + this.getName());
		System.out.println("run end==========");
	}
}
