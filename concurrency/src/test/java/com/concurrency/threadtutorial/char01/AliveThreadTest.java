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
		Thread.sleep(1000);
		System.out.println("end ==" + thread.isAlive());

		Thread.sleep(3000);
	}

}