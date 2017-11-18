package com.concurrency.ch1;

/**
 * Created by Administrator on 2017/11/17.
 */
public class JavaThreadAnywhere {
	static class Helper implements Runnable {
		private final String message;

		public Helper(String message) {
			this.message = message;
		}

		private void doSomething(String message) {
			System.out.println("通过多线程执行某个方法:"
					+ Thread.currentThread().getName());
			System.out.println("操作" + message);
		}

		@Override
		public void run() {
			doSomething(message);
		}
	}
	public static void main(String[] args) {
		System.out.println("通过main方法执行多线程:"
				+ Thread.currentThread().getName());
		Helper helper = new Helper("Java Thread AnyWhere");
		helper.run();
	}
}
