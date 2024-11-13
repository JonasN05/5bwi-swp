package at.nigg.cameraProject.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.nigg.cameraProject.File;
import at.nigg.cameraProject.SDCard;

public class SDCardTest {
    private SDCard sdCard;
    private double capacity = 10.5;

    @BeforeEach
    void setUp() {
        this.sdCard = new SDCard(capacity);
    }

    @Test
    void testGetCapacity() {
        Assertions.assertEquals(this.sdCard.getCapacity(), this.capacity);
    }

    @Test
    void testGetFiles() {
        LocalDateTime date = LocalDateTime.now();
        double sizeOfFile = 4;

        File file = new File("pic1", sizeOfFile, date);
        this.sdCard.savePicture(file);
        ArrayList<File> list = new ArrayList<>();
        list.add(file);

        Assertions.assertEquals(this.sdCard.getFiles(), list);
    }

    @Test
    void testGetUsedCapacity() {
        LocalDateTime date = LocalDateTime.now();
        double sizeOfFile = 4;

        File file = new File("pic1", sizeOfFile, date);
        this.sdCard.savePicture(file);
        Assertions.assertEquals(this.sdCard.getUsedCapacity(), sizeOfFile);
    }

    @Test
    void testSavePicture() {
        LocalDateTime date = LocalDateTime.now();
        double sizeOfFile = 4;
        File file = new File("pic1", sizeOfFile, date);

        Assertions.assertTrue(this.sdCard.savePicture(file));
    }

    @Test
    void testSetUsedCapacity() {
        this.sdCard.setUsedCapacity(capacity);
        Assertions.assertEquals(this.sdCard.getUsedCapacity(), capacity);
    }
}
