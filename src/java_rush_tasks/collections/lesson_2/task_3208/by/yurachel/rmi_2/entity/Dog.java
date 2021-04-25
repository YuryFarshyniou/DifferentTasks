package java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity;

import java.rmi.RemoteException;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void speak() throws RemoteException {
        System.out.println("Woof");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Dog " + this.name + " ");
    }
}
