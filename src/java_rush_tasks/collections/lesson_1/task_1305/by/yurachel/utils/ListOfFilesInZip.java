package java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.utils;

import java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.entity.Content;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ListOfFilesInZip {

    public static List<Content> getContents(String arg) {
        List<Content> contents = new ArrayList<>();
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(arg))) {
            ZipEntry currentEntry;
            byte[] buffer = new byte[1024];
            while ((currentEntry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int length = 0;
                while ((length = zipInputStream.read(buffer)) > 0) {
                    baos.write(buffer, 0, length);
                }
                contents.add(new Content(currentEntry.getName(), baos.toByteArray()));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }
}
