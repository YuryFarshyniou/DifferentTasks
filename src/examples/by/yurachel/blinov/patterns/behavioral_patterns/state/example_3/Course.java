package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_3;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_2.Teacher;

public class Course { // Класс Context
    private long id;
    private String name;
    private Teacher teacher;
    private static State currentState;
    enum State{
        //Start nested enum State
        START{
            private State nextState;
            public void leaning(){
                currentState = PROCESS;
            }
            public void toCancel(){
                currentState = CANCELLED;
                System.out.println("Curse canceled.");
            }
        },
        PROCESS{
            private State nextState;
            public void learning(){
                currentState = nextState;
                so
            }
        }
    }
}
