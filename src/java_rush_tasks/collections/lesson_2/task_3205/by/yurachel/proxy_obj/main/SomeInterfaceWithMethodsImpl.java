package java_rush_tasks.collections.lesson_2.task_3205.by.yurachel.proxy_obj.main;

public class SomeInterfaceWithMethodsImpl implements SomeInterfaceWithMethods{
    public void voidMethodWithoutArgs() {
        System.out.println("inside voidMethodWithoutArgs");
    }

    public String stringMethodWithoutArgs() {
        System.out.println("inside stringMethodWithoutArgs");
        return null;
    }

    public void voidMethodWithIntArg(int i) {
        System.out.println("inside voidMethodWithIntArg");
        voidMethodWithoutArgs();
    }
}
