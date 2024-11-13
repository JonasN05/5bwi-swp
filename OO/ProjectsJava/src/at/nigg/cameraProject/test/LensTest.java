package at.nigg.cameraProject.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.nigg.cameraProject.Lens;
import at.nigg.cameraProject.Manufacturer;

public class LensTest {
    private Lens lens;
    private Manufacturer manufacturer;
    private double focalLenght = 200.5;

    @BeforeEach
    void setUp() {
        this.manufacturer = new Manufacturer("Sony", "USA");
        this.lens = new Lens(focalLenght, this.manufacturer);
    }

    @Test
    void testGetFocalLenght() {
        Assertions.assertEquals(this.lens.getFocalLenght(), this.focalLenght);
    }

    @Test
    void testGetManufacturer() {
        Assertions.assertEquals(this.lens.getManufacturer(), manufacturer);
    }
}
