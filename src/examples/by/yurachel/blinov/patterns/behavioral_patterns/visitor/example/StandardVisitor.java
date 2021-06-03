package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity.ApplianceRenting;
import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity.DVDRenting;

public class StandardVisitor implements Visitor {
    @Override
    public void visit(DVDRenting service) {
        System.out.println("Standard DVD renting service.");
    }

    @Override
    public void visit(ApplianceRenting service) {
        System.out.println("Standard Appliance renting service.");
    }
}
