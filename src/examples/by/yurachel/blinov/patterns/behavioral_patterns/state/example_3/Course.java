package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_3;

import examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_2.Teacher;

/*Предыдущий способ определения классов состояний можно заменить на ва-
риант без использования закрытых внутренних классов. Решение для класса
Course будет выглядеть более эффектно, но вследствие статичности перечи-
слений его внутренняя реализация утратит доступ к полям класса-владельца.
Такой подход реализуем, когда взаимозависимость между состоянием и объек-
том достаточно проста и не требует манипуляций значениями полей класса
со стороны состояния.*/
public class Course { // Класс Context
    private long id;
    private String name;
    private Teacher teacher;
    private static State currentState;

    enum State {
        //Start nested enum State
        START {
            private State nextState;

            public void learning() {
                currentState = PROCESS;
            }

            public void toCancel() {
                currentState = CANCELLED;
                System.out.println("Curse canceled.");
            }
        },
        PROCESS {
            private State nextState;

            public void learning() {
                currentState = nextState;
                System.out.println("Studying was successful.");
                //Формирование отчета,сохранение релузльтатов.
            }

            public void toCancel() {
                throw new UnsupportedOperationException("Impossible to cancel course");
            }
        },
        CANCELLED {
            private State nextState;

            public void learning() {
                currentState = START;
                System.out.println("The course ready for continue studying.");

            }

            public void toCancel() {
                throw new UnsupportedOperationException("The course is canceled");
            }
        },
        END {
            private State nextState;

            public void learning() {
                currentState = nextState;
                System.out.println("The course is ready to studying.");
            }

            public void toCancel() {
                throw new UnsupportedOperationException("The course is ended.");
            }
        };

        abstract void learning();

        abstract void toCancel();
    }

    public Course(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        currentState = State.START;
    }
    public void setTeacher(Teacher teacher){
        //Проверка имени и id курса на соответствие специализации преподавателя.
        this.teacher = teacher;
    }
    public static State getCurrentState(){
        System.out.println(currentState);
        return currentState;
    }
    public void learn(){
        currentState.learning();
    }
    public void cancel(){
        currentState.toCancel();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public static void setCurrentState(State currentState) {
        Course.currentState = currentState;
    }
}
