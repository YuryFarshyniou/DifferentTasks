package examples.by.yurachel.blinov.patterns.structural.composite.example;

import java.util.ArrayList;
import java.util.List;

/* Реализация для составного элемента.*/
public class CompositeTool implements Component {
    private int id;
    private List<Component> channels;

    public CompositeTool(int id) {
        this.id = id;
        channels = new ArrayList<>();
    }

    public void add(Component channel) {
        channels.add(channel);
    }

    public void remove(Component channel) {
        channels.remove(channel);
    }

    @Override
    public void send() {
        System.out.println("Composite tool " + id + ", size pool: " +
                channels.size() + ", number channels: " + countChannels());
        for (Component channel : channels) {
            channel.send();
        }
    }

    @Override
    public void receive() {
//some code here.
    }

    @Override
    public int countChannels() {
        int count = 0;
        for (Component channel : channels) {
            count += channel.countChannels();
        }
        return count;
    }
}
