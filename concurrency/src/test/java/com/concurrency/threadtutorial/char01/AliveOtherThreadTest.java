package com.concurrency.threadtutorial.char01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class AliveOtherThreadTest {
	@Test
	public void aliveOtherThreadTest() throws InterruptedException {
		AliveOtherThread run = new AliveOtherThread();
		Thread thread = new Thread(run);
		System.out.println("main begin thread isAlive=" + thread.isAlive());
		thread.setName("byhieg");
		thread.start();
		System.out.println("===========");
		System.out.println("main end thread isAlive=" + thread.isAlive());
		System.out.println("===========");
		Thread.sleep(3000);
	}

}