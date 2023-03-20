package pl.sda.person;




import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    class PersonFactoryTest {

        @Test
        void shouldCreateFemalePerson() {
            // given
            PersonFactory personFactory = new PersonFactory();
            String firstName = "Ala";
            String lastName = "Nowak";

            // when
            Person actualPerson = personFactory.createPerson(firstName, lastName);

            // then
            Assertions.assertNotNull(actualPerson);

//        Assertions.assertEquals("Ms", actualPerson.getPrefix());
//        Assertions.assertEquals(firstName, actualPerson.getFirstName());
//        Assertions.assertEquals(lastName, actualPerson.getLastName());

            Assertions.assertAll(
                    () -> Assertions.assertEquals("Ms", actualPerson.getPrefix()),
                    () -> Assertions.assertEquals(firstName, actualPerson.getFirstName()),
                    () -> Assertions.assertEquals(lastName, actualPerson.getLastName())
            );
        }

        @Test
        void shouldCreateMalePerson() {
            // given
            String firstName = "Bartosz";
            String lastName = "Andreatto";
            PersonFactory personFactory = new PersonFactory();

            // when
            Person actualPerson = personFactory.createPerson(firstName, lastName);

            // then
            org.assertj.core.api.Assertions.assertThat(actualPerson)
                    .isNotNull()
                    .extracting("prefix")
//                .extracting(person -> person.getPrefix()) // Person::getPrefix
                    .isNotNull()
                    .isEqualTo("Mr");

            org.assertj.core.api.Assertions.assertThat(actualPerson.getFirstName())
                    .isNotNull()
                    .isEqualToIgnoringCase(firstName);
        }
    }

