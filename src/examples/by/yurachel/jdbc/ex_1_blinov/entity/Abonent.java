package examples.by.yurachel.jdbc.ex_1_blinov.entity;

public class Abonent extends Entity {
    private int phone;
    private String lastName;

    public Abonent() {
    }

    public Abonent(int id, String name, int phone) {
        super(id);
        this.lastName = name;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Abonent{" + "id: " + getId() +
                ", phone=" + phone +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
