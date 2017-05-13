package com.chench.clone;

public class Clone {

	//基本数据类型
	private int no;
	//引用变量类型
	private Attr attr;

	public Clone(int no, Attr attr) {
		super();
		this.no = no;
		this.attr = attr;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Attr getAttr() {
		return attr;
	}

	public void setAttr(Attr attr) {
		this.attr = attr;
	}
	
	
	//重载equals()方法
	@Override
	public boolean equals(Object object)
	{
		if (this == object) {
			return true;
		}
		if (object instanceof Clone) {
			Clone clone = (Clone) object;
			if ((this.no == clone.no) && (this.attr.getNo() == clone.attr.getNo())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	//浅克隆
	//返回指向旧对象的新引用变量
	public Clone shallow_clone() {
		Clone soft = this;
		return soft;
	}

	//深克隆
	//返回指向与原来的对象属性的值全相等的新对象的新引用变量
	public Clone deep_clone() {
		Clone hard = new Clone(this.no, this.attr);
		return hard;
	}
	//完全克隆
	//完全克隆返回的新对象的引用属性指向与旧对象的该引用属性的对象属性值全相等的新对象
	public Clone complete_clone() {
		Attr complete_attr = new Attr(this.attr.getNo());
		Clone comolete = new Clone(this.no, complete_attr);
		return comolete;

	}

}
