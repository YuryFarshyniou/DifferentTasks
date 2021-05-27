package examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example;

import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.tcp.TCPMediaContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.tcp.TCPVideoContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.udp.UDPMediaContent;
import examples.by.yurachel.blinov.patterns.creational_patterns.abstract_factory.example.udp.UDPVideoContent;

public class VideoFactory extends AbstractMediaFactory {
    @Override
    public TCPMediaContent createTCPObject() {
        return new TCPVideoContent();
    }

    @Override
    public UDPMediaContent createUDPObject() {
        return new UDPVideoContent();
    }
}
