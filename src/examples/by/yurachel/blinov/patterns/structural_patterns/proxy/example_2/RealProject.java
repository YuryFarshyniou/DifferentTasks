package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.example_2;

public class RealProject implements Project {
    private String url;

    public void load() {
        System.out.println("Loading project from " + url + "...");

    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + " ...");
    }
}
