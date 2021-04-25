package java_rush_tasks.collections.lesson_2.task_3207.by.yurachel.rmi_server.main;

import java.rmi.RemoteException;

public class DoubleStringImpl implements DoubleString {
    @Override
    public String doubleString(String str) throws RemoteException {
        return str + str;
    }
}
