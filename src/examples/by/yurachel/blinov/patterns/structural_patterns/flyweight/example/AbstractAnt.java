package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.example;

public abstract class AbstractAnt {
    protected int strength;
    protected int dexterity;
    protected int speed;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
