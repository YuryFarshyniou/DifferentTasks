package examples.by.yurachel.blinov.patterns.low_coupling;


import examples.by.yurachel.blinov.patterns.expert.Quest;

public class Course {
    //Fields, methods.

    public void makeTest(int id){
        Test test = new Test();
        //realization
        while(true){
            Quest quest= new Quest(1,1);
            //realization
            test.addQuest(quest);
        }
    }
}
