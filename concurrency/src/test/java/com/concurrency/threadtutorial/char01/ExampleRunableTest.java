package com.concurrency.threadtutorial.char01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class ExampleRunableTest {
	@Test
	public void run() throws Exception {
		new Thread(new ExampleRunable()).start();
		Thread.sleep(1000);
	}

}