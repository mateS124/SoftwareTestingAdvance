package pl.sda;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameVeryfierTest {
    private NameVerifier nameVerifier;
    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    static void  afterAll(){
        System.out.println("After All");
    }


    @BeforeEach
    void beforeEach(){
        this.nameVerifier = new NameVerifier();
        System.out.println("In before each..");
    }

    @Test
    void shouldValidateName() {
        // given
        String name = "Bartosz";
//        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = true;

        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);

    }

    @Test
    void shouldNotValidateWhenAllLettersAreLowerCase() {
        // given
        String name = "bartosz";
//        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = false;

        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateWhenAllLettersAreUpperCase() {
        // given
        String name = "BARTOSZ";
//        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = false;

        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateEmptyName() {
        // given
        String name = "";
//        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = false;

        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

    @Test
    void shouldNotValidateNull() {
        // given
        String name = null;
//        NameVerifier nameVerifier = new NameVerifier();
        boolean expectedNameValid = false;

        // when
        boolean actualNameValid = nameVerifier.isNameValid(name);

        // then
        assertEquals(expectedNameValid, actualNameValid);
    }

}