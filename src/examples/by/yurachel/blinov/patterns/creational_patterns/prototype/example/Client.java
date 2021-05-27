package examples.by.yurachel.blinov.patterns.creational_patterns.prototype.example;

import java.util.List;

/* Interface for classes for work with prototypes.
 * */
public interface Client<T> {
    T cloneElementById(Integer Id) throws CloneNotSupportedException;

    List<T> cloneElements(Object... param);
    // others methods.
}
