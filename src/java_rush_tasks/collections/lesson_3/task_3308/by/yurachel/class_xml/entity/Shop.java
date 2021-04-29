package java_rush_tasks.collections.lesson_3.task_3308.by.yurachel.class_xml.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;
import java.util.List;

@XmlRootElement
@XmlType(name = "shop")
public class Shop {

    public Goods goods;

    @XmlElement
    public int count;

    @XmlElement
    public double profit;

    @XmlElement
    public String[] secretData;

    @XmlRootElement
    public static class Goods {

        @XmlElement
        public List<String> names;

        public Goods() {
        }

        @Override
        public String toString() {
            return "Goods{" +
                    "names=" + names +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Shop{" +
                "goods=" + goods +
                ", count=" + count +
                ", profit=" + profit +
                ", secretData=" + Arrays.toString(secretData) +
                '}';
    }
}
