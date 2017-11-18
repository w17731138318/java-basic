package com.concurrency.threadtutorial.char01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class ShareDataThreadTest {

	@Test
	public void run() throws Exception {
		ShareDataThread shareData = new ShareDataThread("A");
		ShareDataThread shareData1 = new ShareDataThread("B");
		new Thread(shareData,"A").start();
		new Thread(shareData,"B").start();
		new Thread(shareData,"C").start();
		new Thread(shareData,"D").start();
		new Thread(shareData,"E").start();
//		shareData.start();
//		shareData1.start();
		Thread.sleep(1000);
	}

}