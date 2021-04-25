package java_rush_tasks.collections.lesson_2.task_3206.by.yurachel.genr_proxy_obj.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Main solution = new Main();
        test(solution.getProxy(Item.class));                        //true false false
        test(solution.getProxy(Item.class, Small.class));           //true false true
        test(solution.getProxy(Item.class, Big.class, Small.class));//true true true
        test(solution.getProxy(Big.class, Small.class));            //true true true т.к. Big наследуется от Item
        test(solution.getProxy(Big.class));                         //true true false т.к. Big наследуется от Item
    }


    private static void test(Object proxy) {
        boolean isItem = proxy instanceof Item;
        boolean isBig = proxy instanceof Big;
        boolean isSmall = proxy instanceof Small;

        System.out.format("%b %b %b\n", isItem, isBig, isSmall);
    }

    public Item getProxy(Class item, Class... classes) {

        Class[] cl = new Class[classes.length + 1];
        System.arraycopy(classes, 0, cl, 0, classes.length);
        cl[cl.length - 1] = item;
        InvocationHandler ih = new ItemInvocationHandler();
        return (Item) Proxy.newProxyInstance(this.getClass().getClassLoader(), cl, ih);
    }
}
