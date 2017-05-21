package com.chench.test;

import org.w3c.dom.Element;
import org.w3c.dom.Text;

import com.chench.XML.XMLEditor;

public class Test {

	public static void main(String[] args) {
		XMLEditor xmlEditor = new XMLEditor("XML.xml");

		// 创建Element
		Element element_load = xmlEditor.getDocument().createElement("land");
		Element element_name = xmlEditor.getDocument().createElement("name");
		Element element_size = xmlEditor.getDocument().createElement("size");
		// 创建Text
		Text text_name = xmlEditor.getDocument().createTextNode("Oceania");
		Text text_size = xmlEditor.getDocument().createTextNode("100");
		// 把Text添加到Element
		element_name.appendChild(text_name);
		element_size.appendChild(text_size);
		// 把name和size添加到land
		element_load.appendChild(element_name);
		element_load.appendChild(element_size);
		// 插入load
		// xmlEditor.insert("land", element_load);

		// 删除
		// xmlEditor.delete("land", 4);

		Element element = xmlEditor.getDocument().createElement("size");
		Text text = xmlEditor.getDocument().createTextNode("111");
		element.appendChild(text);
		// 修改
		xmlEditor.update("land", 4, element);

		// 查询
		// xmlEditor.select("land");

	}

}
