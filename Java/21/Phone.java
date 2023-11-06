import java.io.*;

class Phone implements Serializable {
    private String make;
    private String model;
    private int memory;
    private double camera;
    private double screenSize;
    private String isSmart;
    private double price;

    public Phone(String make, String model, int memory, double camera, double screenSize, String isSmart, double price) {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.camera = camera;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMemory() {
        return memory;
    }

    public double getCamera() {
        return camera;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String isSmart() {
        return isSmart;
    }

    public double getPrice() {
        return price;
    }
}

