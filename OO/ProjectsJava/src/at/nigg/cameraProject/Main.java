package at.nigg.cameraProject;

public class Main {
    public static void main(String[] args) {
        SDCard sdCard1 = new SDCard(10);
        Manufacturer manufacturer1 = new Manufacturer("Sony", "USA");
        Lens lens1 = new Lens(100, manufacturer1);
        Camera camera1 = new Camera(200, 200, "red", Resolution.HIGH, sdCard1, lens1, manufacturer1);

        camera1.takePicture("pic1");
        camera1.takePicture("pic2");

        camera1.getFreeMemoryOfSD();

        camera1.setResolution(Resolution.LOW);
        camera1.takePicture("pic3");

        camera1.takePicture("pic4");

        camera1.getFreeMemoryOfSD();

    }
}
