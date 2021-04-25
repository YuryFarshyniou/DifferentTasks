package java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity;

import java.rmi.RemoteException;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void speak() throws RemoteException {
        System.out.println("Meow");
    }

    @Override
    public void printName() throws RemoteException {
        System.out.print("Cat " + this.name + " ");
    }
}
