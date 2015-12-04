package bjs.task20;

import bjs.task20.computers.*;
import bjs.task20.computerstore.ComputerStore;

public class Main {
    public static void main(String[] args) {
        ComputerStore computerStore = new ComputerStore();

        Desktop desktop = new Desktop();
        desktop.setArticle("DT-bf47c40e");
        desktop.setComputerDescription("Base game PC");
        desktop.setProcessor("Intel Core i3-6100", 3.7, 3);
        desktop.setRandomAccessMemory("DDR3-1600", 8);
        desktop.setStorage("HDD", 1000, "7200 rpm");
        desktop.setMotherboard("Intel H110/B150 (LGA1151)");
        desktop.setVideoCard("NVIDIA GeForce GTX 750 Ti", 2, "GDDR5");
        desktop.setDisplay("23″, IPS matrix, DVI/HDMI");
        desktop.setChassis("Middle Tower ATX, 450 W");
        desktop.setAudioCard("Realtek HD Audio");
        //Accessories
        desktop.setKeyboard("Logitech G410 Atlas Spectrum");
        desktop.setMouse("Lenovo Y Gaming Precision Mouse");
        desktop.setWebcam("Logitech HD Webcam C270");
        desktop.setHeadset("Lenovo Y Gaming Surround Sound Headset");
        desktop.setAudioSystem("Logitech Speaker System Z320 ");
        desktop.setPrice(710);

        computerStore.addComputer(desktop);

        Laptop laptop = new Laptop();
        laptop.setArticle("LT-93fee7a1");
        laptop.setComputerDescription("Lenovo IdeaPad 100-15");
        laptop.setProcessor("Intel Celeron N2840", 2.1, 2);
        laptop.setRandomAccessMemory("DDR3-1600", 2);
        laptop.setStorage("HDD", 250, "7200 rpm");
        laptop.setMotherboard("Intel H110/B150");
        laptop.setVideoCard("Intel HD Graphics", 1, "GDDR5");
        laptop.setDisplay("15.6″, IPS/PLS");
        laptop.setAudioCard("Realtek HD Audio");
        //Accessories
        laptop.setMouse("Wireless Mouse");
        laptop.setHeadset("Surround Sound Headset");
        laptop.setAudioSystem("Logitech Speaker System Z320 ");
        laptop.setPrice(999.99);

        computerStore.addComputer(laptop);

        Tablet tablet = new Tablet();
        tablet.setArticle("TB-93fee7f3");
        tablet.setComputerDescription("Lenovo ThinkPad Helix");
        tablet.setProcessor("Intel Core i5-3427U", 2.8, 3);
        tablet.setRandomAccessMemory("DDR3-1600", 4);
        tablet.setStorage("SSD", 128, "");
        tablet.setMotherboard("Intel");
        tablet.setDisplay("11,6″, IPS/PLS");
        tablet.setPrice(1670);

        computerStore.addComputer(tablet);

        computerStore.printDesktopComputers();
        computerStore.printLaptopComputers();
        computerStore.printTabletComputers();
    }
}

/*
Article: DT-bf47c40e
Description: Base game PC
Processor: Intel Core i3-6100, 3.7 GHz, 3.0 Mb
RAM: 8.0 Gb, DDR3-1600
Storage: HDD, 1000.0 Gb, 7200 rpm
Motherboard: Intel H110/B150 (LGA1151)
Video: NVIDIA GeForce GTX 750 Ti, 2.0 Gb, GDDR5
Display: 23″, IPS matrix, DVI/HDMI
Chassis: Middle Tower ATX, 450 W
Audio card: Realtek HD Audio
Accessories:
	Logitech G410 Atlas Spectrum
	Logitech HD Webcam C270
	Logitech Speaker System Z320
	Lenovo Y Gaming Precision Mouse
	Lenovo Y Gaming Surround Sound Headset

Price:  710.0
--------------------------------------------

Article: LT-93fee7a1
Description: Lenovo IdeaPad 100-15
Processor: Intel Celeron N2840, 2.1 GHz, 2.0 Mb
RAM: 2.0 Gb, DDR3-1600
Storage: HDD, 250.0 Gb, 7200 rpm
Motherboard: Intel H110/B150
Video: Intel HD Graphics, 1.0 Gb, GDDR5
Display: 15.6″, IPS/PLS
Audio card: Realtek HD Audio
Accessories:
	Logitech Speaker System Z320
	Wireless Mouse
	Surround Sound Headset

Price:  999.99
--------------------------------------------

Article: TB-93fee7f3
Description: Lenovo ThinkPad Helix
Processor: Intel Core i5-3427U, 2.8 GHz, 3.0 Mb
RAM: 4.0 Gb, DDR3-1600
Storage: SSD, 128.0 Gb,
Motherboard: Intel
Display: 11,6″, IPS/PLS

Price:  1670.0
--------------------------------------------
 */
