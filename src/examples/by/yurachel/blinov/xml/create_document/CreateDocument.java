package examples.by.yurachel.blinov.xml.create_document;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

public class CreateDocument {
    public static void main(String[] args) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = null;
        try {
            documentBuilder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        Document document = documentBuilder.newDocument();
        String root = "book";
        Element rootElement = document.createElement(root);
        document.appendChild(rootElement);
        for (int i = 0; i < 1; i++) {
            String elementName = "name";
            Element emName = document.createElement(elementName);
            String name = "technique java ";
            emName.appendChild(document.createTextNode(name));
            String elementAuthor = "author";
            Element emAuthor = document.createElement(elementAuthor);
            String author = "Blinov";
            emAuthor.appendChild(document.createTextNode(author));
            emAuthor.setAttribute("id", "3");
            rootElement.appendChild(emName);
            rootElement.appendChild(emAuthor);
        }

        // Для записи XML документа используется класс Transformer.
        TransformerFactory transformFactory = TransformerFactory.newInstance();
        try {
            Transformer transformer = transformFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new FileWriter("book.xml"));
            transformer.transform(source, result);
        } catch (TransformerException | IOException e) {
            e.printStackTrace();
        }

    }
}
