package java_rush_tasks.collections.lesson_1.task_1308.by.yurachel.main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Path path1 = Paths.get("F:\\Downloads\\Movies\\Little Big - Go Bananas.mp3");
        Path path2 = Paths.get("F:\\Downloads\\Movies\\Folder\\test.001.txt");
        Path resultPath = getDiffBetweenTwoPaths(path1, path2);
        System.out.println(resultPath);   //expected output '../secondDir/third' or '..\secondDir\third'

    }
    public static Path getDiffBetweenTwoPaths(Path path1, Path path2) {
        return  path1.relativize(path2);
    }

}
