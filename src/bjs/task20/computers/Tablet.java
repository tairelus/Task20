package bjs.task20.computers;

/**
 * Created by YM on 04.12.2015.
 * Presents tablet computer
 */
public class Tablet extends Computer {
    /**Display description*/
    private String display;

    public Tablet() {
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Display: " + display + "\n";
        result += "\nPrice:  " + getPrice() + "\n";

        return result;
    }

    /**
     * Sets display
     * @param display Display name and type
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Returns computer class name. It allow to distinguish objects if we store them in one collection
     * @return Computer class name
     */
    public String getComputerClass() {
        return this.getClass().getSimpleName();
    }
}
