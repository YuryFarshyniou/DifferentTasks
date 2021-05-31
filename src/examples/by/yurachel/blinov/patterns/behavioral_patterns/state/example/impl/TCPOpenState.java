package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.impl;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.TCPConnection;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.TCPState;

public class TCPOpenState implements TCPState {
    @Override
    public void open(TCPConnection context) {
        System.out.println("State open: opening");
    }

    @Override
    public void close(TCPConnection context) {
        System.out.println("State Open: closing");
    }

    @Override
    public void synchronize(TCPConnection context) {
        System.out.println("State Open: synchronizing.");
    }
}
