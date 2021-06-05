package examples.by.yurachel.blinov.patterns.structural.composite.example;

public class UDPChannel extends ChannelLeaf{
    public UDPChannel(int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println("udp send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("udp receive.");
    }
}
