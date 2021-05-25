package examples.by.yurachel.blinov.patterns.abstract_factory.example;

import examples.by.yurachel.blinov.patterns.abstract_factory.example.tcp.TCPMediaContent;
import examples.by.yurachel.blinov.patterns.abstract_factory.example.udp.UDPMediaContent;

public class Client {
    private UDPMediaContent contentUDP;
    private TCPMediaContent contentTCP;

    public void makeMediaFactoryWork(AbstractMediaFactory factory) {
        contentTCP = factory.createTCPObject();
        contentUDP = factory.createUDPObject();
        // using created objects
    }
}
