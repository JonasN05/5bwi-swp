package at.nigg.cameraProject.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.nigg.cameraProject.Manufacturer;

public class ManufacturerTest {

    private Manufacturer manufacturer;
    private String name = "Sony";
    private String country = "USA";

    @BeforeEach
    void setUp() {
        this.manufacturer = new Manufacturer(name, country);
    }

    @Test
    void testGetCountry() {
        Assertions.assertEquals(this.manufacturer.getCountry(), this.country);
    }

    @Test
    void testGetName() {
        Assertions.assertEquals(this.manufacturer.getName(), this.name);
    }
}
