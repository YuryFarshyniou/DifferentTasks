package by.yurachel;

import by.yurachel.applciation.Application;
import by.yurachel.context.ApplicationContext;
import by.yurachel.model.CoronaDesinfector;
import by.yurachel.model.Room;
import by.yurachel.model.policeman.Policeman;
import by.yurachel.model.policeman.impl.PolicemanImpl;

import java.util.HashMap;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("by.yurachel", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        CoronaDesinfector desinfector = context.getObject(CoronaDesinfector.class);
        desinfector.start(new Room());
    }
}
