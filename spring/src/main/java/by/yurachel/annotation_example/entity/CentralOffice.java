package by.yurachel.annotation_example.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CentralOffice {
    private int id;
    private VetClinic clinic;

    @Autowired
    public CentralOffice(VetClinic clinic) {
        this.id = 1;
        this.clinic = clinic;
    }

}
