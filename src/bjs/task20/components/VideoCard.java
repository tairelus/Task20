package bjs.task20.components;

/**
 * Presents information about video card
 */
public class VideoCard {
    /**Card type*/
    private String type;
    /**RAM size, Mb*/
    private double ramSize;
    /**RAM type*/
    private String ramType;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRamSize() {
        return ramSize;
    }

    public void setRamSize(double ramSize) {
        this.ramSize = ramSize;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    @Override
    public String toString() {
        String result = "Video: ";
        result += getType() + ", ";
        result += getRamSize() + " Gb, ";
        result += getRamType() + "\n";

        return result;
    }
}
