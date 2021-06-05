package examples.by.yurachel.blinov.patterns.structural.composite.example;

public class TCPChannel extends ChannelLeaf {
    public TCPChannel(int id) {
        super(id);
    }

    @Override
    public void send() {
        System.out.println(" tcp send " + getId());
    }

    @Override
    public void receive() {
        System.out.println("tcp receive.");
    }
}
