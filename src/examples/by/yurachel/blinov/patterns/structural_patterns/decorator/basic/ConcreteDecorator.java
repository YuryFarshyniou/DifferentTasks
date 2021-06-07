package examples.by.yurachel.blinov.patterns.structural_patterns.decorator.basic;
/*ConcreteDecorator — конкретный декоратор, содержащий конкретную ре-
ализацию интерфейса, определяемого типом Decorator, может объявлять
дополнительное поведение. Может использовать как агрегированный тип,
так и переопределять унаследованный интерфейс.*/
public class ConcreteDecorator extends Decorator{
    public void addedBehavior(){
        //more code.
    }
    public void operation(){
        //Использует реализацию типа Component and method addBehavior().
    }
}
