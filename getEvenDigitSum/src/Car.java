public class Car {

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;
    private String make;

    public Car() {
        color = null;
    }

    @Override
    public String toString(){
        return "Make: " + make + " \tColor: " + color;
    }
}
