package java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.main;

import java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity.Animal;
import java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity.Cat;
import java_rush_tasks.collections.lesson_2.task_3208.by.yurachel.rmi_2.entity.Dog;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static Registry registry;

    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                for (String bindingName : registry.list()) {
                    Animal service = (Animal) registry.lookup(bindingName);
                    service.printName();
                    service.speak();
                }


            } catch (RemoteException | NotBoundException e) {
                e.printStackTrace();
            }
        }
    });

    public static Thread SERVER_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                registry = LocateRegistry.createRegistry(2099);
                final Animal cat = new Cat("Marsy");
                final Animal dog = new Dog("Sparky");
                Remote catStub = UnicastRemoteObject.exportObject(cat, 0);
                registry.bind("class.cat", catStub);
                Remote dogStub = UnicastRemoteObject.exportObject(dog, 0);
                registry.bind("class.dog", dogStub);

            } catch (RemoteException | AlreadyBoundException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) {
        try {
            SERVER_THREAD.start();
            Thread.sleep(1000);
            CLIENT_THREAD.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
