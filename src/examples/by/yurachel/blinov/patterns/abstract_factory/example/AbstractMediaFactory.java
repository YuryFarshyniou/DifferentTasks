package examples.by.yurachel.blinov.patterns.abstract_factory.example;

import examples.by.yurachel.blinov.patterns.abstract_factory.example.tcp.TCPMediaContent;
import examples.by.yurachel.blinov.patterns.abstract_factory.example.udp.UDPMediaContent;

public abstract  class AbstractMediaFactory {
    public abstract TCPMediaContent createTCPObject();
    public abstract UDPMediaContent createUDPObject();

}
