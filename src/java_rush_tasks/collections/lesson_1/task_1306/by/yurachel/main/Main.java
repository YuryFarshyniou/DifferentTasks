package java_rush_tasks.collections.lesson_1.task_1306.by.yurachel.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File(args[0]);
            if (!file.exists()) {
                file.createNewFile();
            }
            List<FileInputStream> streams = new ArrayList<>();

            List<String> fileNames = new ArrayList<>();
            fileNames.addAll(Arrays.asList(args).subList(1, args.length));
            Collections.sort(fileNames);

            for (String name : fileNames) {
                streams.add(new FileInputStream(name));
            }

            try (ZipInputStream zi = new ZipInputStream(new SequenceInputStream(Collections.enumeration(streams)))) {

                while (true) {
                    ZipEntry entry = zi.getNextEntry();
                    if (entry == null) {
                        break;
                    }
                    try (OutputStream os = new BufferedOutputStream(new FileOutputStream(file))) {

                        final int bufferSize = 1024;
                        byte[] buffer = new byte[bufferSize];
                        for (int readBytes; (readBytes = zi.read(buffer, 0, bufferSize)) > -1; ) {
                            os.write(buffer, 0, readBytes);
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
