package lambda2.task7and9;

/**
 * Created by badbug on 19.01.2015.
 */
public class Person {
    public String firstName;
    public String lastName;
    public String city;

    public Person(String firstName, String lastName, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
