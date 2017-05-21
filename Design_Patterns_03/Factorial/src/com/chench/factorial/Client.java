package com.chench.factorial;

public class Client {
	public static void main(String[] args) {
		int n = 9;
		System.out.println("计算出" + n + "的阶乘是" + new Composite(n).factorial());
	}
}
