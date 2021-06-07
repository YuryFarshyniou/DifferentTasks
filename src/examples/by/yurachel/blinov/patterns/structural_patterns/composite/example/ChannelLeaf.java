package examples.by.yurachel.blinov.patterns.structural_patterns.composite.example;

/*Реализация интерфейса для неделимых классов.*/
public abstract class ChannelLeaf implements Component {
    private int id;

    public ChannelLeaf(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public int countChannels() {
        return 1;
    }
}
