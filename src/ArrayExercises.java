import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Tyler");
        people[1] = new Person("Jessica");
        people[2] = new Person("Bob");

        people = addPerson(people, new Person("Bill"));

        for(int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person) {
//        Person[] newPeopleArray = new Person[people.length + 1];
//
//        for(int i = 0; i < people.length; i++) {
//            newPeopleArray[i] = people[i];
//        }

        Person[] newPeopleArray = Arrays.copyOf(people, people.length +1);

        newPeopleArray[newPeopleArray.length - 1] = person;

        return newPeopleArray;
    }

}
