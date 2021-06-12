package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public class VisitCardWebsiteBuilder extends Builder {
    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildName() {
        website.setName("WebsiteVisit card");
    }

    @Override
    void buildPrice() {
        website.setPrice(500);
    }
}
