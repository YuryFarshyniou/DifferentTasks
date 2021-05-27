package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.tcp.TCPAudioContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.tcp.TCPMediaContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.udp.UDPAudioContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.udp.UDPMediaContent;

public class AudioFactory extends AbstractMediaFactory{
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPAudioContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPAudioContent();
    }
}
