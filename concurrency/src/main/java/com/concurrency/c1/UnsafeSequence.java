package com.concurrency.c1;

import net.jcip.annotations.NotThreadSafe;

/**
 * Created by Administrator on 2017/11/17.
 */
@NotThreadSafe
public class UnsafeSequence {
	private int value;
	public int getNext() {
		return value++;
	}
}
