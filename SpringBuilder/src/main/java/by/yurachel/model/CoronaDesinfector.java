package by.yurachel.model;

import by.yurachel.annotation.InjectByType;
import by.yurachel.announcer.Announcer;
import by.yurachel.model.policeman.Policeman;

public class CoronaDesinfector {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

    public void start(Room room) {
        announcer.announce("Desinfection is starting.Go away!");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("You cam go back to this room!");
    }

    private void desinfect(Room room) {
        System.out.println("Desinefect room");
    }
}

/*lookup - */