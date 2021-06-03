package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity.ApplianceRenting;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity.DVDRenting;

public interface Visitor {
    void visit(DVDRenting service);

    void visit(ApplianceRenting service);
}
