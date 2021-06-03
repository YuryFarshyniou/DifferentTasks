package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.Visitor;

public class ApplianceRenting extends Renting {
    private double redemptionPrice;

    public double getRedemptionPrice() {
        return redemptionPrice;
    }

    public void setRedemptionPrice(double redemptionPrice) {
        this.redemptionPrice = redemptionPrice;
    }

    @Override
    public void accept(Visitor visitor) {
        //some code here.
        visitor.visit(this);
    }
}
