package academy.belhard;

import jdk.jfr.events.SocketReadEvent;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Иван", "Петров", new Address("Минск", "Гурского", 15)));
        personList.add(new Person("Сидор", "Иванов", new Address("Москва", "Ленина", 36)));
        personList.add(new Person("Петр", "Сидоров", new Address("Липецк", "Советская", 3)));
        personList.add(new Person(null, "Репин", new Address("Подольск", "Красивая", 5)));
        personList.add(new Person("Анна", null, new Address("Полоцк", "Речная", 40)));
        personList.add(new Person("Леонид", "Титов", null));


        List<String> res = personList
                .stream()
                .filter(x->x.getFirstname() != null && x.getLastname() != null && x.getAddress() != null)
                .sorted((o1, o2) -> o1.address.getHouseNumber()-o2.address.getHouseNumber())
                .map(person -> person.toString())
                .collect(Collectors.toList());
        System.out.println(res);


    }
}
