package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
