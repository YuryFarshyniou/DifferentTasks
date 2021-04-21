package java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.main;

import java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.entiry.ConcreteFileData;
import java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.entiry.FileData;
import java_rush_tasks.collections.lesson_1.task_1307.by.yurachel.entiry.NullFileData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    private FileData fileData;

    public Main(String pathToFile) {
        try {
            Path file = Paths.get(pathToFile);

            fileData= new ConcreteFileData(Files.isHidden(file), Files.isExecutable(file),
                    Files.isDirectory(file), Files.isWritable(file));
        } catch (IOException e) {
            fileData = new NullFileData(e);
        }
    }
    public FileData getFileData() {
        return fileData;
    }
}
