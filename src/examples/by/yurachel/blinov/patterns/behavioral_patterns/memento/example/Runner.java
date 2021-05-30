package examples.by.yurachel.blinov.patterns.behavioral_patterns.memento.example;

import java.util.HashMap;

public class Runner {
    public static void main(String[] args) {
        HashMap<String, String> p = new HashMap<String, String>() {
            {
                this.put("1", "Winner");
            }
        };
        RequestParameter req = new RequestParameter(p);
        System.out.println("first " + req.getParams());
        Memento memento = req.getMemento();
        Caretaker care = new Caretaker(memento);
        req.addParam("1", "loser");
        System.out.println("Second " + req.getParams());
        memento = care.getMemento();
        req.setMemento(memento);
        System.out.println("undo to first " + req.getParams());
    }
}
