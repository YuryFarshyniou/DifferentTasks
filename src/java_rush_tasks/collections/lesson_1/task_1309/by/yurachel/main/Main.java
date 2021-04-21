package java_rush_tasks.collections.lesson_1.task_1309.by.yurachel.main;

import java.io.*;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Properties properties = getProperties("C:\\Java\\DifferentTasks\\src\\java_rush_tasks\\collections\\lesson_1\\task_1309\\by\\yurachel\\recources\\properties.xml");
        properties.list(System.out);

        properties = getProperties("C:\\Java\\DifferentTasks\\src\\java_rush_tasks\\collections\\lesson_1\\task_1309\\by\\yurachel\\recources\\properties.txt");
        properties.list(System.out);

        properties = getProperties("C:\\Java\\DifferentTasks\\src\\java_rush_tasks\\collections\\lesson_1\\task_1309\\by\\yurachel\\recources\\notExists");
        properties.list(System.out);
    }

    public static Properties getProperties(String fileName) {
        Properties properties = new Properties();
        try {
            File propertiesFile = new File(fileName);
            if (propertiesFile.toString().endsWith(".xml")) {
                properties.loadFromXML(new BufferedInputStream(new FileInputStream(propertiesFile)));
            } else {
                properties.load(new FileReader(propertiesFile));
            }
        } catch (IOException e) {
            return new Properties();
        }
        return properties;
    }
    }

