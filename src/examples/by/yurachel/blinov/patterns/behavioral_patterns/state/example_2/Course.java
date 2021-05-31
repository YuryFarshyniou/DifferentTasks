package examples.by.yurachel.blinov.patterns.behavioral_patterns.state.example_2;

// Класс Context.
public class Course {
    private long id;
    private String name;
    private Teacher teacher;
    private IState currentState;

    public Course(long id, String name, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        currentState = new StartState();
    }

    public void setTeacher(Teacher teacher) {
        //Проверка имени и id урса на соотвествие специализации преподавателя.
        this.teacher = teacher;
    }

    //Get and set methods.
    public IState getCurrentState() {
        System.out.println(currentState.getClass().getSimpleName());
        return currentState;
    }

    public void learning() {
        currentState.learning();
    }

    public void cancel() {
        currentState.toCancel();
    }

    //Классы состояний.
    public class StartState implements IState {
        private IState nextState;


        @Override
        public void learning() {
            if (Course.this.teacher != null) {
                currentState = new ProcessState();
                System.out.println("Study is starting");
            } else {
                this.toCancel();
                System.out.println("Study doesn't start: There is no teacher.");
            }
        }

        @Override
        public void toCancel() {
            currentState = new CancelledState();
            System.out.println("Study have been canceled.");
        }
    }

    public class ProcessState implements IState {
        private IState nextState = new EndState();

        @Override
        public void learning() {
            currentState = nextState;
            System.out.println("Study ended successful");
            //Формирование отчета.Сохранение результатов.
        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("Impossible to cancel this course.");
        }
    }

    public class EndState implements IState {
        private IState nextState = new StartState();

        @Override
        public void learning() {
            currentState = nextState;
//Назначение нового преподавателя.
            Course.this.setTeacher(new Teacher());
            System.out.println("The course is ready to start.");
        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("The course has already ended");
        }
    }

    public class CancelledState implements IState {
        private IState nextState = new EndState();

        @Override
        public void learning() {
            currentState = new StartState();
            //Назначение нового преподавателя.
            Course.this.setTeacher(new Teacher());
            System.out.println("The course is ready to start.");

        }

        @Override
        public void toCancel() {
            throw new UnsupportedOperationException("The course has already canceled");
        }
    }
}
