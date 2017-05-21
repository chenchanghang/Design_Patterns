package com.chench.XML;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class XMLEditor {

	private String path;
	private Document document;

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public XMLEditor(String path) {
		this.path = path;
		// 创建解析器工厂
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory
				.newInstance();

		// 创建解析器
		DocumentBuilder builder = null;
		try {
			builder = builderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {

		}
		// 解析XML
		try {
			document = builder.parse(path);
		} catch (SAXException | IOException e) {

		}

	}
	// 保存XML文件
	public void saveXML() {
		TransformerFactory transformerFactory=TransformerFactory.newInstance();
		Transformer transformer = null;
		try {
			transformer = transformerFactory.newTransformer();
		} catch (TransformerConfigurationException e) {
			
		}
		try {
			transformer.transform(new DOMSource(document),new StreamResult(path));
		} catch (TransformerException e) {
			
		}
	}



	// 增删改查
	
	// 在name末尾插入element
	public void insert(String name, Element element) {
		NodeList nodeList = document.getElementsByTagName(name);
		// 插入element
		nodeList.item(0).getParentNode().appendChild(element);
		// 保存XML
		saveXML();
		

	}

	// 删除在name中的第index个
	public void delete(String name, int index) {
		NodeList nodeList = document.getElementsByTagName(name);
		// 检查索引越界
		if (index > nodeList.getLength()) {
			System.out.println("索引越界！");
			return;
		}
		Node node = nodeList.item(index - 1);
		// 删除node
		node.getParentNode().removeChild(node);
		// 保存XML
		saveXML();

	}

	// 修改在name中的第index个中的element
	public void update(String name, int index, Element element) {
		NodeList nodeList = document.getElementsByTagName(name);
		// 检查索引越界
		if (index > nodeList.getLength()) {
			System.out.println("索引越界！");
			return;
		}
		Node node = nodeList.item(index - 1);
		// 
		NodeList children = node.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			if (element.getNodeName().equals(children.item(i).getNodeName())) {
				// 修改element
				children.item(i).setTextContent(element.getTextContent());
				// 保存XML
				saveXML();
				return;
			}
		}
		System.out.println("没有" + element.getNodeName());
	}

	// 打印查询结果
	public void select(String name) {
		NodeList nodeList = document.getElementsByTagName(name);
		for (int i = 0; i < nodeList.getLength(); i++) {
			System.out.println(nodeList.item(i).getNodeName() + ":" + nodeList.item(i).getTextContent());
		}
	}
}
