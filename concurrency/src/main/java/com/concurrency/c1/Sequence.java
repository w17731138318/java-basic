package com.concurrency.c1;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

/**
 * Created by Administrator on 2017/11/17.
 */
@ThreadSafe
public class Sequence {
	@GuardedBy("this")
	private int value;

	public synchronized int getNext() {
		return value++;
	}
}
