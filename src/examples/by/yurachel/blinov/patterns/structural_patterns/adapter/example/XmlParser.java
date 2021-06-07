package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example;

//Адаптируемый функионал.
public class XmlParser {
    public Order parseXml(String str,double xmlVersion,String encoding){
        Order order = new Order();
        System.out.println("Parse xml file.");
        return order;
    }
}
