package java_rush_tasks.collections.lesson_1.task_1305.by.yurachel.entity;

import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Content {
    String fileName;
    byte[] body;

    public Content(String fileName, byte[] body) {
        this.fileName = fileName;
        this.body = body;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void safeToZip(ZipOutputStream zos) throws IOException {
        ZipEntry entry = new ZipEntry(this.fileName);
        zos.putNextEntry(entry);
        zos.write(this.body);
        zos.closeEntry();
    }
}
