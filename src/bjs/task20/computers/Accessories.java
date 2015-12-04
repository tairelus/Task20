package bjs.task20.computers;

/**
 * Created by YM on 30.11.2015.
 * Presents abstract computer accessories
 */
interface Accessories {
    /**
     * These enumeration will be used as an indexes for map which store accessories.
     */
    enum AccessoryType {
        KEYBOARD,
        MOUSE,
        WEBCAM,
        HEADSET,
        AUDIOSYSTEM
    }

    /**
     * Returns all accessories as string
     * @return
     */
    String getAccessories();
}

/**
 * Presents accessories for laptop computers
 */
interface DesktopAccessories extends Accessories {
    /**
     * Sets the keyboard
     * @param keyboard
     */
    void setKeyboard(String keyboard);

    /**
     * Sets the mouse
     * @param mouse
     */
    void setMouse(String mouse);

    /**
     * Sets the web camera
     * @param webcam
     */
    void setWebcam(String webcam);

    /**
     * Sets the headset
     * @param headset
     */
    void setHeadset(String headset);

    /**
     * Sets the audio system
     * @param audioSystem
     */
    void setAudioSystem(String audioSystem);
}

/**
 * Presents accessories for laptop computers
 */
interface LaptopAccessories extends Accessories {
    /**
     * Sets the mouse
     * @param mouse
     */
    void setMouse(String mouse);

    /**
     * Sets the headset
     * @param headset
     */
    void setHeadset(String headset);

    /**
     * Sets the audio system
     * @param audioSystem
     */
    void setAudioSystem(String audioSystem);
}