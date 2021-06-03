package examples.by.yurachel.blinov.patterns.behavioral_patterns.visitor.example.entity;

public abstract class Renting implements Visitable{
    private int term;
    public int getTerm(){
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

}
