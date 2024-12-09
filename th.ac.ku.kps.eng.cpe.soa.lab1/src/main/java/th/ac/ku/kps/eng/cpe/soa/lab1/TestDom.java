package th.ac.ku.kps.eng.cpe.soa.lab1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentFactory;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import entity.BookStore;

public class TestDom {

	public static void main(String[] args) {

		/*
		 * Document doc = DocumentFactory.getInstance().createDocument(); Element root =
		 * doc.addElement("root"); root.addAttribute("myAttribute", "myValue"); Element
		 * elem = root.addElement("myelem"); elem.addText("Hello world"); try {
		 * 
		 * FileOutputStream fos = new FileOutputStream("simple.xml"); OutputFormat
		 * format = OutputFormat.createPrettyPrint(); XMLWriter writer = new
		 * XMLWriter(fos,format);
		 * 
		 * writer.write(doc); writer.flush(); writer.close(); fos.close();
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
/////////////////////////////////////////////////////////////////////////////////		
		/*
		 * File xml = new File("simple.xml"); SAXReader reader = new SAXReader();
		 * Document doc; try { doc = reader.read(xml); Element root =
		 * doc.getRootElement(); Iterator i = root.elements().iterator();
		 * 
		 * while(i.hasNext()) { Element e = (Element)i.next();
		 * System.out.println(e.getPath()); System.out.println(e.getName());
		 * System.out.println(e.getData()); } } catch (DocumentException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		try {
			File inputFile = new File("student.xml");
			SAXReader reader = new SAXReader();
			Document document = reader.read(inputFile);

			System.out.println("Root element :" + document.getRootElement().getName());

			Element classElement = document.getRootElement();
			java.util.List<org.dom4j.Node> nodes = document.selectNodes("/class/student[@rollno = '493']");
			System.out.println("----------------------------");

			for (org.dom4j.Node node : nodes) {
				System.out.println("\nCurrent Element :" + node.getName());
				System.out.println("Student roll no : " + node.valueOf("@rollno"));
				System.out.println("First Name : " + node.selectSingleNode("firstname").getText());
				System.out.println("Last Name : " + node.selectSingleNode("lastname").getText());
				System.out.println("First Name : " + node.selectSingleNode("nickname").getText());
				System.out.println("Marks : " + node.selectSingleNode("marks").getText());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}

	}

}
