package com.concurrency.threadtutorial.char01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class NotShareDataThreadTest {
	@Test
	public void run() throws Exception {
		NotShareDataThread a = new NotShareDataThread("A");
		NotShareDataThread b = new NotShareDataThread("B");
		NotShareDataThread c = new NotShareDataThread("C");

		a.start();
		b.start();
		c.start();

		Thread.sleep(1000);
	}

}