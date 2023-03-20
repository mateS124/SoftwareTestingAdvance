package pl.sda.storage;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StorageTest {
    private static Connection connection;
    private Storage storage;

    @BeforeAll
    static void beforeAll() throws InterruptedException {
        connection = new Connection();
        connection.open();
    }

    @AfterAll
    static void afterAll() throws InterruptedException {
        connection.close();
    }

    @BeforeEach
    void beforeEach(){
        this.storage = new Storage(connection);
    }

    @AfterEach
    void afterEach(){
        connection.refresh();
    }

    @Test
    @DisplayName("Should Add data to stotage when connection is open")
    void shouldAddDateToStorage(){
        //given
        String item = "Example item";
        int expectedStorageSize = 1;

        //when
      int actualStorageSize = storage.addValue(item);
        //then

        assertEquals(expectedStorageSize, actualStorageSize);
        Assertions.assertEquals(storage.getData().size(), expectedStorageSize);
        Assertions.assertNotNull(storage.getData().get(0));
        Assertions.assertTrue(storage.getData().contains(item));
    }

    @Test
    // @Disabled
    void shouldRemovingExistingData(){
        //given
        String item = "Example item";
        storage.addValue(item);

        //when
        boolean actualRemoveResult = storage.removeValue(item);

        //then
        Assertions.assertTrue(actualRemoveResult);
    }

    @Test
    void shouldNotRemovingExistingData(){
        //given
        String item = "Example item";
        storage.addValue(item);

        //when
        boolean nonExistingExampleItem = storage.removeValue("Non existing example item");

        //then

        Assertions.assertFalse(nonExistingExampleItem);
    }

}
