package at.nigg.cameraProject;

import java.util.Scanner;

public class GUI {
    private Camera camera;
    Scanner scanner = new Scanner(System.in);

    public GUI(Camera camera) {
        this.camera = camera;
    }

    public void runCamera() {
        boolean guiRunning = true;
        while (guiRunning) {
            System.out.println("What would you like to do?");
            System.out.println("Press 1 - Take Picture");
            System.out.println("Press 2 - Add SD-Card");
            System.out.println("Press 3 - Remove SD-Card");
            System.out.println("Press 9 - Shut Down");
            int s = scanner.nextInt();

            switch (s) {
                case 1:
                    System.out.println("Enter the name of the picture:");
                    String nameOfPicture = scanner.next();
                    camera.takePicture(nameOfPicture);
                    break;

                case 9:
                    guiRunning = false;
                    break;

                default:
                    break;

            }
            System.out.println("-----------------------");

        }
    }
}