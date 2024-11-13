package at.nigg.cameraProject.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.nigg.cameraProject.Camera;
import at.nigg.cameraProject.Lens;
import at.nigg.cameraProject.Manufacturer;
import at.nigg.cameraProject.Resolution;
import at.nigg.cameraProject.SDCard;

public class CameraTest {
    private SDCard sdCard;
    private Manufacturer manufacturer;
    private Lens lens;
    private Camera camera;

    @BeforeEach
    void setUp() {
        this.sdCard = new SDCard(10);
        this.manufacturer = new Manufacturer("Sony", "USA");
        this.lens = new Lens(100, manufacturer);
        this.camera = new Camera(200, 200, "red", Resolution.HIGH, sdCard, lens, manufacturer);
    }

    @Test
    void testGetColorOfPhone() {
        Assertions.assertEquals(this.camera.getColorOfPhone(), "red");
    }

    @Test
    void testGetFreeMemoryOfSD() {
        this.camera.takePicture("pic1");
        // Assertions.assertEquals(camera.getFreeMemoryOfSD(), 4);
        Assertions.assertTrue(camera.getFreeMemoryOfSD() == 4);
    }

    @Test
    void testGetLens() {
        Assertions.assertEquals(this.camera.getLens(), this.lens);
    }

    @Test
    void testGetManufacturer() {
        Assertions.assertEquals(this.camera.getManufacturer(), this.manufacturer);
    }

    @Test
    void testGetPixel() {
        Assertions.assertEquals(this.camera.getPixel(), 200);
    }

    @Test
    void testGetResolution() {
        Assertions.assertEquals(this.camera.getResolution(), Resolution.HIGH);
    }

    @Test
    void testGetSdCard() {
        Assertions.assertEquals(this.camera.getSdCard(), this.sdCard);
    }

    @Test
    void testGetWeightOfPhone() {
        Assertions.assertEquals(this.camera.getWeightOfPhone(), 200);
    }

    @Test
    void testRemoveSdCard() {
        this.camera.removeSdCard();
        Assertions.assertNull(this.camera.getSdCard());
    }

    @Test
    void testSetResolution() {
        Resolution resolution = Resolution.MEDIUM;
        this.camera.setResolution(resolution);
        Assertions.assertEquals(this.camera.getResolution(), resolution);
    }

    @Test
    void testSetSdCard() {
        SDCard sdCard = new SDCard(15);
        this.camera.removeSdCard();
        this.camera.setSdCard(sdCard);

        Assertions.assertEquals(this.camera.getSdCard(), sdCard);
    }

    @Test
    void testTakePicture() {
        this.camera.takePicture("pic1");
        Assertions.assertEquals(this.camera.getSdCard().getFiles().get(0).getName(), "pic1");
    }
}
