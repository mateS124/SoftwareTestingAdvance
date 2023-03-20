package pl.sda.person;

public class PersonFactory {


        Person createPerson(String firstName, String lastName) {
            String prefix = firstName.endsWith("a") ? "Ms" : "Mr";
            return new Person(prefix, firstName, lastName);
          // return null; żeby sprawdzić czy zadziała na null

        }

}
