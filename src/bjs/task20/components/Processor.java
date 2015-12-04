package bjs.task20.components;

/**
 * Presents information about CPU
 */
public class Processor {
    /**The type of the CPU. E.g. "Intel", "ARM", etc.*/
    private String type;
    /**The CPU clock rate in GHz*/
    private double clockRate;
    /**Cache size, Mb*/
    private double cacheSize;

    public double getCacheSize() {
        return cacheSize;
    }

    public void setCacheSize(double cacheSize) {
        this.cacheSize = cacheSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getClockRate() {
        return clockRate;
    }

    public void setClockRate(double clockRate) {
        this.clockRate = clockRate;
    }

    @Override
    public String toString() {
        String result = "Processor: ";
        result += getType() + ", ";
        result += getClockRate() + " GHz, ";
        result += getCacheSize() + " Mb\n";

        return result;
    }
}
