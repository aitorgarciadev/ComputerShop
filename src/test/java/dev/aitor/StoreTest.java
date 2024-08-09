package dev.aitor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private Computer computer1, computer2;

    @BeforeEach
    void initialize() {
        store = new Store("TechHub", "Jane Smith", "98765432-1");
        computer1 = new Computer("Acer", 16, "AMD Ryzen 7", "Linux", 1500.00);
        computer2 = new Computer("Asus", 8, "Intel i5", "Ubuntu", 700.00);
    }

    @Test
    void testAddComputer() {
        store.addComputerToStore(computer1);
        assertEquals(1, store.getAllComputers().size());
    }

    @Test
    void testRemoveComputer() {
        store.addComputerToStore(computer1);
        assertTrue(store.removeComputerByBrand("Acer"));
        assertEquals(0, store.getAllComputers().size());
    }

    @Test
    void testSearchComputer() {
        store.addComputerToStore(computer1);
        Computer result = store.searchComputerByBrand("Acer");
        assertNotNull(result);
        assertEquals("Acer", result.getBrand());
    }

    @Test
    void testGetAllComputers() {
        store.addComputerToStore(computer1);
        store.addComputerToStore(computer2);
        assertEquals(2, store.getAllComputers().size());
    }
}


