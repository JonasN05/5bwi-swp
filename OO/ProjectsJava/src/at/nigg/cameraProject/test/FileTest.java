package at.nigg.cameraProject.test;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import at.nigg.cameraProject.File;

public class FileTest {
    private File file;
    private LocalDateTime date;

    @BeforeEach
    void setUp() {
        this.date = LocalDateTime.now();
        this.file = new File("pic1", 4, date);
    }

    @Test
    void testGetDateOfFile() {
        Assertions.assertEquals(this.file.getDateOfFile(), this.date);
    }

    @Test
    void testGetName() {
        Assertions.assertEquals(this.file.getName(), "pic1");
    }

    @Test
    void testGetSizeOfFile() {
        Assertions.assertEquals(this.file.getSizeOfFile(), 4);
    }

    @Test
    void testSetName() {
        this.file.setName("pic2");
        Assertions.assertEquals(this.file.getName(), "pic2");
    }
}
