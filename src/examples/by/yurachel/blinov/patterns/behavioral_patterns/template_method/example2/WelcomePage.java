package examples.by.yurachel.blinov.patterns.behavioral_patterns.template_method.example2;

public class WelcomePage extends WebsiteTemplate {

    @Override
    public void showPageContext() {
        System.out.println("Welcome");
    }
}
