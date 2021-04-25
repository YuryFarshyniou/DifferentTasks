package java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Animal extends Remote {
    void speak() throws RemoteException;

    void printName() throws RemoteException;
}
