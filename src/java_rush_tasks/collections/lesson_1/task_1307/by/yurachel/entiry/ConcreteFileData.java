package java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.entiry;

public class ConcreteFileData implements FileData{

    private boolean hidden;
    private boolean executable;
    private boolean directory;
    private boolean writable;

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public void setExecutable(boolean executable) {
        this.executable = executable;
    }

    public void setDirectory(boolean directory) {
        this.directory = directory;
    }

    public void setWritable(boolean writable) {
        this.writable = writable;
    }

    @Override
    public boolean isHidden() {
        return hidden;
    }

    @Override
    public boolean isExecutable() {
        return executable;
    }

    @Override
    public boolean isDirectory() {
        return directory;
    }

    @Override
    public boolean isWritable() {
        return writable;
    }

    public ConcreteFileData(boolean hidden, boolean executable, boolean directory, boolean writable) {
        this.hidden = hidden;
        this.executable = executable;
        this.directory = directory;
        this.writable = writable;
    }


}
