package com.singleton;

public class Singleton {

	private Singleton() {

	}

	private static class singletonHolder {

		private static final Singleton INSATNCE = new Singleton();

	}

	public static Singleton getInstance() {

		return singletonHolder.INSATNCE;
	}
}
