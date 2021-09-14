package by.yurachel.recommendator.impl;

import by.yurachel.annotation.InjectProperty;
import by.yurachel.annotation.Singleton;
import by.yurachel.recommendator.Recommendator;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {

    @InjectProperty()
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid, drink " + alcohol);
    }
}
