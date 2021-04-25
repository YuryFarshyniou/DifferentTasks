package java_rush_tasks.collections.lesson_2.task_3207.by.yurachel.rmi_server.main;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static final String UNIC_BINDING_NAME = "double.string";
    public static Registry registry;

    public static Thread CLIENT_THREAD = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                DoubleString service = (DoubleString) registry.lookup(UNIC_BINDING_NAME);
                String result = service.doubleString("Hello World");
                System.out.println(result);
            } catch (NotBoundException | RemoteException e) {
                e.printStackTrace();
            }
        }
    });

    public static void main(String[] args) {
        Remote stub;
        try {
            registry = LocateRegistry.createRegistry(2099);
            final DoubleStringImpl service = new DoubleStringImpl();
            stub = UnicastRemoteObject.exportObject(service, 0);
            registry.bind(UNIC_BINDING_NAME, stub);
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }
        CLIENT_THREAD.start();
    }
}
