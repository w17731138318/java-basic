package com.concurrency.c1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/17.
 */
public class UnsafeSequenceTest {
	private UnsafeSequence unsafeSequence = new UnsafeSequence();
	@Test
	public void getNext() throws Exception {
		new Thread(new Runnable() {
			@Override
			public void run() {
				get1();
			}
		}).run();
		new Thread(new Runnable() {
			@Override
			public void run() {
				get2();
			}
		}).run();

	}
	public void get1(){
		int i = 0;
		while (i<100){
			int next = unsafeSequence.getNext();
			System.out.println(next);
			i++;
		}
	}
	public void get2(){
		int i = 0;
		while (i<100){
			int next = unsafeSequence.getNext();
			System.out.println(next);
			i++;
		}
	}
}