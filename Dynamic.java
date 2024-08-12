import java.util.ArrayList;
import java.util.ListIterator;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Dynamic {
    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<Person> personList = new ArrayList<>();

        // Load Person objects into the ArrayList
        personList.add(new Person("sankeerthana", 22));
        personList.add(new Person("syam", 22));
        personList.add(new Person("sri", 18));

        // Iterate over the ArrayList using a ListIterator and a while loop
        ListIterator<Person> listIterator = personList.listIterator();
        while (listIterator.hasNext()) {
            // Get the next Person object
            Person person = listIterator.next();
            // Print Person details
            person.display();
        }
    }
}