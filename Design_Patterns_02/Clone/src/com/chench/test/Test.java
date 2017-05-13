package com.chench.test;

import com.chench.clone.Attr;
import com.chench.clone.Clone;

public class Test {
	public static void main(String[] args) {

		Attr attr1 = new Attr(1);
		Clone clone1 = new Clone(1, attr1);
		
		Attr attr2 = new Attr(2);
		Clone clone2 = new Clone(2, attr2);
		
		Attr attr3 = new Attr(1);
		Clone clone3 = new Clone(1, attr3);
		
		System.out.println("测试==运算符：");
		System.out.println(clone1 == clone2);
		System.out.println(clone1.equals(clone2));
		System.out.println("测试equals()方法：：");
		System.out.println(clone1 == clone3);
		System.out.println(clone1.equals(clone3));
		
		//通过观察引用变量所指向的对象的地址来验证这三个克隆的异同点。
		System.out.println("测试浅克隆，深克隆，完全克隆：");
		Clone me = new Clone(0, new Attr(0));
		System.out.println(me);
		System.out.println(me.getAttr());
		System.out.println("浅克隆：");
		Clone me_soft = me.shallow_clone();
		System.out.println(me_soft);
		System.out.println(me_soft.getAttr());
		System.out.println("深克隆：");
		Clone me_hard = me.deep_clone();
		System.out.println(me_hard);
		System.out.println(me_hard.getAttr());
		System.out.println("完全克隆：");
		Clone me_complete = me.complete_clone();
		System.out.println(me_complete);
		System.out.println(me_complete.getAttr());
		
	}
}
