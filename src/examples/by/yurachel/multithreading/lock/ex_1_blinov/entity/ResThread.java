package examples.by.yurachel.multithreading.lock.ex_1_blinov.entity;

import java.util.Random;

public class ResThread  extends Thread{
    private DoubleResource dr;

    public ResThread(String name, DoubleResource dr) {
        super(name);
        this.dr = dr;
    }
    public void run(){
        for (int i = 0; i < 4; i++) {
            if(new Random().nextInt(2)>0){
                dr.adding(getName(),i);
            }else{
                dr.deleting();
            }
        }
    }
}
