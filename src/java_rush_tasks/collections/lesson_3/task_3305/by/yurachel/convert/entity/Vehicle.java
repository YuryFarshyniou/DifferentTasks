package java_rush_tasks.collections.lesson_3.task_3305.by.yurachel.convert.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "className")
@JsonSubTypes(@JsonSubTypes.Type(value = Vehicle.class))
public abstract class Vehicle {
    protected String name;
    protected String owner;
    protected int age;
}
