package bjs.task20.computers;

import bjs.task20.components.*;

/**
 * Created by YM on 26.11.2015.
 * Base class for other computer types
 */
public abstract class Computer {
    /**Unique identifier of the computer.*/
    private String article;
    /**The type of the computer. E.g. "PC", "Notebook", etc.*/
    private String computerDescription;

    /**CPU*/
    private Processor processor;
    /**RAM*/
    private RandomAccessMemory randomAccessMemory;
    /**Fixed memory. HDD, flash, etc.*/
    private Storage storage;
    /**Describes motherboard type and model*/
    private String motherboard;

    /**Price*/
    private double price;

    /**Constructor of the base class*/
    Computer() {
        processor = new Processor();
        randomAccessMemory = new RandomAccessMemory();
        storage = new Storage();
    }

    @Override
    public String toString() {
        String result = "Article: " + getArticle() + "\n";
        result += "Description: " + getComputerDescription() + "\n";
        result += getProcessor().toString();
        result += getRandomAccessMemory().toString();
        result += getStorage().toString();
        result += "Motherboard: " + getMotherboard() + "\n";

        return result;
    }

    /**Gets processor object*/
    public Processor getProcessor() {
        return processor;
    }

    /**
     * Sets processor fields
     * @param type Processor type
     * @param clockRate Clock rate, GHh
     * @param cacheSize Processor cache size, Mb
     */
    public void setProcessor(String type, double clockRate, double cacheSize) {
        this.processor.setType(type);
        this.processor.setClockRate(clockRate);
        this.processor.setCacheSize(cacheSize);
    }

    /**Gets RAM object*/
    public RandomAccessMemory getRandomAccessMemory() {
        return randomAccessMemory;
    }

    /**
     * Sets RAM
     * @param type Type of the RAM
     * @param size Size of the RAM, Gb
     */
    public void setRandomAccessMemory(String type, double size) {
        this.randomAccessMemory.setType(type);
        this.randomAccessMemory.setSize(size);
    }

    /**
     * @return Computer type
     */
    public String getComputerDescription() {
        return computerDescription;
    }

    /**
     * Sets computer type
     * @param computerDescription The type of the computer.
     */
    public void setComputerDescription(String computerDescription) {
        this.computerDescription = computerDescription;
    }

    /**
     * Gets storage information
     * @return Storage object
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Sets storage information
     * @param type Storage type
     * @param size Storage size, Gb
     * @param speed Storage speed
     */
    public void setStorage(String type, double size, String speed) {
        this.storage.setType(type);
        this.storage.setSize(size);
        this.storage.setSpeed(speed);
    }

    /**
     * Gets unique article of the computer
     * @return
     */
    public String getArticle() {
        return article;
    }

    /**
     * Sets unique article of the computer
     * @param article
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /**Gets motherboard*/
    public String getMotherboard() {
        return motherboard;
    }

    /**Sets motherboard type*/
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    /**Gets price*/
    public double getPrice() {
        return price;
    }

    /**
     * Sets price
     * @param price Price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns computer class name. It may be useful if we store all computer in one collection
     * @return Computer class name
     */
    public abstract String getComputerClass();
}
