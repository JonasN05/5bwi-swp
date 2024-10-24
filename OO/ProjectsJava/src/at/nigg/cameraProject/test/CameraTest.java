package at.nigg.cameraProject.test;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.discovery.SelectorResolver.Resolution;

import at.nigg.cameraProject.Camera;
import at.nigg.cameraProject.SDCard;

public class CameraTest {
    @Test
    void testTakePicture() {
        SDCard sdCard1 = new SDCard(10);
        // Camera camera1 = new Camera(200, 200, "red", Resolution.HIGH, sdCard1);

        // camera1.takePicture("pic1");
        // camera1.takePicture("pic2");
        // Assertions.assertEquals(, camera1);
    }
}
