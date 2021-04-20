package java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.main;

import java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.entity.Content;
import java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.utils.ListOfFilesInZip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class Main {
    public static void main(String[] args) {

        List<Content> entries = ListOfFilesInZip.getContents(args[1]);

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(args[1]))) {
            File file = new File(args[0]);
            zos.putNextEntry(new ZipEntry("new/" + file.getName()));
            Files.copy(file.toPath(), zos);
            for (Content content : entries) {
                if (!content.getFileName().equals("new/" + file.getName())) {
                    content.safeToZip(zos);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
