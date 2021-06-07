package examples.by.yurachel.blinov.patterns.structural_patterns.adapter.example;

public class XmlParserAdapter implements Parser{
    private XmlParser parser;
    private double xmlVersion; // согласование параметров для адаптации.
    private String encoding; // согласование параметров для адаптации.

    public XmlParserAdapter(XmlParser parser, double xmlVersion, String encoding) {
        this.parser = parser;
        this.xmlVersion = xmlVersion;
        this.encoding = encoding;
    }


    @Override
    public Order parse(String order) {
        return parser.parseXml(order,xmlVersion,encoding);
    }

}
