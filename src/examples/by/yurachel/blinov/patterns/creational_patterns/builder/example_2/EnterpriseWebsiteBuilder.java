package examples.by.yurachel.blinov.patterns.creational_patterns.builder.example_2;

public class EnterpriseWebsiteBuilder extends Builder {

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESCO);
    }

    @Override
    void buildName() {
        website.setName("Enterprice");
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
