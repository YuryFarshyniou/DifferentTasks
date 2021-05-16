package examples.by.yurachel.blinov.xml.marsh_demarsh.entity;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name=" address ",propOrder = {
        "city",
        "country",
        "street"
})
public class Address {
    private String city;
    private String country;
    private String street;

    public Address() {
    }

    public Address( String city,String country, String street) {
        this.city = city;
        this.country = country;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
