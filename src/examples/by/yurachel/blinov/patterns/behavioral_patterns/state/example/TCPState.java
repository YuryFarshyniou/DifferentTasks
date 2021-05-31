package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example;

public interface TCPState {
    void open(TCPConnection context);

    void close(TCPConnection context);

    void synchronize(TCPConnection context);
}
