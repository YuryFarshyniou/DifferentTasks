package examples.by.yurachel.blinov.patterns.structural_patterns.proxy.example_2;

public class ProxyProject implements Project {
    private String url;
    private RealProject project;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (project == null) {
            project = new RealProject(url);
        }
        project.run();
    }
}
