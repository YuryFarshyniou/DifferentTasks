package examples.by.yurachel.blinov.patterns.behavioral_patterns.template_method.example2;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContext();
        System.out.println("Footer");
    }

    public abstract void showPageContext();
}
