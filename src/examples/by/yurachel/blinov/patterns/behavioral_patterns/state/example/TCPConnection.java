package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.impl.TCPClosedState;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.impl.TCPEstablishedState;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example.impl.TCPOpenState;

public class TCPConnection {
    private TCPState state;

    //other fields.
    public TCPConnection() {
        state = new TCPClosedState();
    }

    public void open() {
        state.open(this);
        this.changeState(new TCPOpenState());
    }

    public void close() {
        state.close(this);
        this.changeState(new TCPClosedState());
    }

    public void synchronize() {
        state.synchronize(this);
        this.changeState(new TCPEstablishedState());
    }

    private void changeState(TCPState state) {
//Check for opportunity to change state.
        this.state = state;
    }

}
