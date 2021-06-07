package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example;

public class Runner {
    public static void main(String[] args) {
        String jsonOrder = "\"id\": \"1456\", \"firstName\": \"John\", \"lastName\": \"Smith\" ...";
        Parser parser = new JsonParser();
        Order order = parser.parse(jsonOrder);
        System.out.println(order.getOrderAmount());
        String xmlOrder = "<order id=\"1456\"><person firstName=\"John\" lastName=\"Smith\">EPAM</person></order>";
        parser = new XmlParserAdapter(new XmlParser(),1.0,"UTF-8");
        order = parser.parse(xmlOrder);
        System.out.println(order.getOrderAmount());
    }
}
