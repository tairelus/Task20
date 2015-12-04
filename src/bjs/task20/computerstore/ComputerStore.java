package bjs.task20.computerstore;

import java.util.HashMap;
import bjs.task20.computers.*;

/**
 * Created by YM on 27.11.2015.
 */

/**
 * Presents computer store
 */
public class ComputerStore {
    /**Collection of the desktop computers*/
    private DesktopCatalog desktopComputers;
    /**Collection of the laptop computers*/
    private LaptopCatalog laptopComputers;
    /**Collection of the tablet computers*/
    private TabletCatalog tabletComputers;

    /**
     * Provides storage for the desktop computer
     */
    protected class DesktopCatalog extends HashMap<String, Desktop> {
       //Add user defined functions if necessary, e.g. some search
    }

    /**
     * Provides storage for the laptop computer
     */
    protected class LaptopCatalog extends HashMap<String, Laptop> {
        //Add user defined functions if necessary, e.g. some search
    }

    /**
     * Provides storage for the laptop computer
     */
    protected class TabletCatalog extends HashMap<String, Tablet> {
        //Add user defined functions if necessary, e.g. some search
    }

    /**
     * Helper, print Desktop object in the console
     */
    protected void printComputer(Computer computer) {
        /**
         * toString() overwritten for each class and it is virtual by default in Java.
         * So, correspondent version of the toString() will be called by type
         */
        System.out.print(computer.toString());
        System.out.println("--------------------------------------------\n");
    }

    /**
     * Current constructor
     */
    public ComputerStore() {
        desktopComputers = new DesktopCatalog();
        laptopComputers = new LaptopCatalog();
        tabletComputers = new TabletCatalog();
    }

    /**
     * Gets Desktop object by index
     * @param article
     * @return
     */
    public Desktop getDesktop(String article) {
        return desktopComputers.get(article);
    }

    /**
     * Gets Desktop object by index
     * @param article
     * @return
     */
    public Laptop getLaptop(String article) {
        return laptopComputers.get(article);
    }

    /**
     * Adds computer to the correspondent collection by type
     * @param computer
     */
    public void addComputer(Computer computer) {
        String computerClass = computer.getComputerClass();

        switch (computerClass) {
            case "Desktop":
                desktopComputers.put(computer.getArticle(), (Desktop)computer);
                break;
            case "Laptop":
                laptopComputers.put(computer.getArticle(), (Laptop)computer);
                break;
            case "Tablet":
                tabletComputers.put(computer.getArticle(), (Tablet)computer);
                break;
        }
    }

    /**
     * Prints Desktop collection with for cycle
     */
    public void printDesktopComputers() {
        for (HashMap.Entry<String, Desktop> entry : desktopComputers.entrySet()) {
            printComputer(entry.getValue());
        }
    }

    /**
     * Prints Laptop collection with for cycle
     */
    public void printLaptopComputers() {
        for (HashMap.Entry<String, Laptop> entry : laptopComputers.entrySet()) {
            printComputer(entry.getValue());
        }
    }

    /**
     * Prints Tablet collection with for cycle
     */
    public void printTabletComputers() {
        for (HashMap.Entry<String, Tablet> entry : tabletComputers.entrySet()) {
            printComputer(entry.getValue());
        }
    }
}
