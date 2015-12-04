package bjs.task20.components;

/**
 * Presents information about fixed memory.
 */
public class Storage {
    /**Storage type*/
    private String type;
    /**Storage size, Gb*/
    private double size;
    /**Speed. Gb/s, rpm, etc.*/
    private String speed;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        String result = "Storage: ";
        result += getType() + ", ";
        result += getSize() + " Gb, ";
        result += getSpeed() + "\n";

        return result;
    }
}