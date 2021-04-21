package java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.entiry;

public class NullFileData implements FileData{

    private final Exception exception;

    public NullFileData(Exception e) {
        this.exception = e;
    }

    public Exception getException() {
        return exception;
    }
    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public boolean isExecutable() {
        return false;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isWritable() {
        return false;
    }
}
