package bjs.task20.components;

/**
 * Presents information about RAM
 */
public class RandomAccessMemory {
    /**Random access memory type*/
    private String type;
    /**Random access memory size in Gb*/
    private double size;

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

    @Override
    public String toString() {
        String result = "RAM: ";
        result += getSize() + " Gb, ";
        result += getType() + "\n";

        return result;
    }
}
