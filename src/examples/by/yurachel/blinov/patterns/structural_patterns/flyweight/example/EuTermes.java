package examples.by.yurachel.blinov.patterns.structural_patterns.flyweight.example;

import java.io.Serializable;

public class EuTermes implements Serializable {
    private Termes ant; //внутренняя часть.
    // Внешнее состояние: начало описания.
    private int health;
    private float xCoord;
    private float yCoord;

    //Внешнее состояние: окончание описания.
    public EuTermes(String type, float xCoord, float yCoord, float zCoord) {
        this.ant = TermesFactory.getClassFromFactory(type);
        health = 100;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
    public void go(){
        //more code here
    }
    public void flight(){
        //more code here.
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getxCoord() {
        return xCoord;
    }

    public void setxCoord(float xCoord) {
        this.xCoord = xCoord;
    }

    public float getyCoord() {
        return yCoord;
    }

    public void setyCoord(float yCoord) {
        this.yCoord = yCoord;
    }

}
