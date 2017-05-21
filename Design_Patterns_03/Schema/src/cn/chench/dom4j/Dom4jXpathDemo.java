package cn.chench.dom4j;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Node;

import cn.chench.utils.Dom4jUtils;

public class Dom4jXpathDemo {
	public static void main(String[] args) {
		//ergodicName();
		getName();
	}
	//遍历所有的name

	@SuppressWarnings({ "unused", "unchecked" })
	private static void ergodicName()
	{
		//获取
		Document document=Dom4jUtils.getDocument("src/sax.xml");
		//使用selectNodes方法
		List<Node> list=document.selectNodes("//name");
		//增强for遍历
		for (Node node : list) {
			System.out.println(node.getText());
		}
		
	}
	//获取第一个p1下的name的值
	private static void getName()
	{
		//获取
		Document document=Dom4jUtils.getDocument("src/sax.xml");
		//使用selectNodes方法
		Node name=document.selectSingleNode("//p1[@id='chench']/name");
		
		System.out.println(name.getText());
	}
	
}
