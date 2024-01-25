import java.util.Arrays;
import java.util.List;

public class Homework2 {

    public static void addressOfAdult(List<Person> people){
        people.stream().filter(person -> person.age > 17).map(person -> person.address)
                .forEach(address -> System.out.println(address.street + " " + address.houseNumber));
    }

    public static void main(String[] args) {




        Address address1 = new Address("Street 1  house number:",23);
        Address address2 = new Address("Street 2 house number :" , 42);
        Address address3 = new Address("Street 3  house number:",7);



        List<Person> people = Arrays.asList(
                new Person("Svetlana",48,address1),
                new Person("Maksim",16,address2),
                new Person("Monika",24,address3));


        System.out.println("Adults address");
       addressOfAdult( people );





    }

}
