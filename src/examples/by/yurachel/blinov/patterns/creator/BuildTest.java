package examples.by.yurachel.blinov.patterns.creator;

import examples.by.yurachel.blinov.patterns.expert.Quest;

import java.util.Queue;

/* Класс,отвечающий за создание нового экземпляра объекта Quest.
 * */

public class BuildTest {
    //fields,methods.

    public void buildTest(Queue<Quest> quests) {
        quests.add(makeQuest("Params"));
    }

    private Quest makeQuest(String params) {
        //realization.
        return new Quest(1, 2);
    }
}
