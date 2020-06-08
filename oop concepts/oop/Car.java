package oop;

public class Car {

    //five fields for the car class
    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String colour;

    //update the model field
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carerra") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
