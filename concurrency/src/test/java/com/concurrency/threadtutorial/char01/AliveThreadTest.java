package com.concurrency.threadtutorial.char01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class AliveThreadTest {
	@Test
	public void run() throws Exception {
		AliveThread thread = new AliveThread();
		System.out.println("begin == " + thread.isAlive());
		thread.start();
		Thread.sleep(100);
		System.out.println("100 ==" + thread.isAlive());
		Thread.sleep(100);
		System.out.println("200 ==" + thread.isAlive());
		Thread.sleep(3000);
	}

}