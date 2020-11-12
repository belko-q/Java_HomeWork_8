package academy.belhard;

public class Person {
    public Address address;
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return
                "Имя: " + firstname +
                " Фамилия: " + lastname +
                " Адрес: " + address;
    }
}
