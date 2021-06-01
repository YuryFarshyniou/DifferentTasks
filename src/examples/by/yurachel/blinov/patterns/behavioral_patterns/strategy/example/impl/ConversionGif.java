package examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example.impl;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.strategy.example.IConversion;

import java.net.URL;

public class ConversionGif implements IConversion {
    @Override
    public void convert(URL urlFileImg) {
        System.out.println("GIF conversion.");
    }
}
