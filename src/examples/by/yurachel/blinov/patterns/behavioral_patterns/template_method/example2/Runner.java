package examples.by.yurachel.blinov.patterns.behavioral_patterns.template_method.example2;

public class Runner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();
        System.out.println("++++++++=");
        newsPage.showPage();
    }
}
