package devices;

public enum DeviceFarm {
    ANDROİD_OREO("src/test/resources/capabilities/android-oreo.json");

    public String path;

    DeviceFarm(String path) {
        this.path = path;
    }
}
