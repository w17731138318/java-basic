package com.concurrency.threadtutorial.char01;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/11/18.
 */
public class ComplexCurrentThreadTest {
	/**
	 * 首先在创建对象的时候，构造器还是被main线程所执行，所以Thread.currentThread()得到的就是Main线程的名字，
	 * 但是this方法指的是调用方法的那个对象，也就是ComplexCurrentThread的线程信息，还没有setName,所以是默认的名字。
	 * 然后run方法无论是Thread.currentThread()还是this返回的都是设置了byhieg名字的线程信息。
	 * 所以Thread.currentThread指的是具体执行这个代码块的线程信息。
	 * 构造器是main执行的，而run方法则是哪个线程start，哪个线程执行run。
	 * 这么看来，this能得到的信息是不准确的，因为如果我们在run中执行了this.getName()，
	 * 但是run方法却是由另一个线程start的，我们是无法通过this.getName得到运行run方法的新城的信息的。
	 * 而且只有继承了Thread的类才能有getName等方法，这对于Java没有多继承的特性语言来说，是个灾难。
	 * 所有后面凡是要得到线程的信息，我们都用Thread.currentThread()来调用API。
	 * @throws Exception
	 */
	@Test
	public void run() throws Exception {
		ComplexCurrentThread thread = new ComplexCurrentThread();
		thread.setName("byhieg");
		thread.start();

		Thread.sleep(3000);
	}

}