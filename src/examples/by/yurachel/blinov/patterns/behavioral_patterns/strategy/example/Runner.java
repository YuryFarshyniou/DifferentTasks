package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example.impl.ConversionGif;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example.impl.ConversionJpg;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example.impl.ConversionPng;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {
    public static void main(String[] args) throws MalformedURLException {
        URL fileUrl = new URL("image_file_url");
        Convert convertToJpg = new Convert(new ConversionJpg());
        convertToJpg.convert(fileUrl);
        Convert convertToGif = new Convert(new ConversionGif());
        convertToGif.convert(fileUrl);
        Convert convertToPng = new Convert(new ConversionPng());
        convertToPng.convert(fileUrl);
    }
}
