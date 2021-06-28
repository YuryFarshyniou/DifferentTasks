package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.example2;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public Save save() {
        return new Save(version);
    }

    public void Load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}
