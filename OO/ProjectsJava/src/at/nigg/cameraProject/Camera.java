package at.nigg.cameraProject;

import java.time.LocalDateTime;

public class Camera {
    private int pixel;
    private int weightOfPhone;
    private String colorOfPhone;
    private Resolution resolution;
    private SDCard sdCard;
    private Lens lens;
    private Manufacturer manufacturer;

    public Camera(int pixel, int weightOfPhone, String colorOfPhone, Resolution resolution, SDCard sdCard, Lens lens,
            Manufacturer manufacturer) {
        this.pixel = pixel;
        this.weightOfPhone = weightOfPhone;
        this.colorOfPhone = colorOfPhone;
        this.resolution = resolution;
        this.sdCard = sdCard;
        this.lens = lens;
        this.manufacturer = manufacturer;
    }

    public void takePicture(String name) {
        Resolution resolutionForPicture = this.resolution;
        int sizeOfFile = 2;
        LocalDateTime date = LocalDateTime.now();

        if (resolutionForPicture == Resolution.MEDIUM) {
            sizeOfFile = 4;
        } else if (resolutionForPicture == Resolution.HIGH) {
            sizeOfFile = 6;
        }

        if (this.sdCard != null) {
            File file = new File(name, sizeOfFile, date);
            this.sdCard.savePicture(file);
            if (this.sdCard.getCapacity() - this.sdCard.getUsedCapacity() <= this.sdCard.getCapacity() * 0.1) {
                System.out.println("Memeory running low");
            }
        } else {
            System.out.println("there is no SD Card");
        }

    }

    public void setSdCard(SDCard sdCard) {
        if (this.sdCard != null) {
            System.out.println("You already have a SD Card inserted");
        } else {
            this.sdCard = sdCard;
            System.out.println("SD Card added");
        }
    }

    public void removeSdCard() {
        if (this.sdCard == null) {
            System.out.println("There is no SD Card to remove");
        } else {
            this.sdCard = null;
            System.out.println("SD Card removed");
        }
    }

    public double getFreeMemoryOfSD() {
        if (this.sdCard == null) {
            System.out.println("There is no SD Card");
            return 0;
        } else {
            double freeMemory = this.sdCard.getCapacity() - this.sdCard.getUsedCapacity();
            System.out.println("Freier Speicher: " + freeMemory);
            return freeMemory;
        }
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public int getPixel() {
        return pixel;
    }

    public int getWeightOfPhone() {
        return weightOfPhone;
    }

    public String getColorOfPhone() {
        return colorOfPhone;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public Lens getLens() {
        return lens;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

}
