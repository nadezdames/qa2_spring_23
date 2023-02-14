package HomeWorkTWO;

//---------ATTRIBUTES---------
public class Transport {
    private String transportType;
    private String transportColor;
    private int fuelTankVolume;
    private int fuelConsumptionPerHundredKm;
    private int distance;

//---------GETTERS/SETTERS---------

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportColor() {
        return transportColor;
    }

    public void setTransportColor(String transportColor) {
        this.transportColor = transportColor;
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        this.fuelTankVolume = fuelTankVolume;
    }

    public int getFuelConsumptionPerHundredKm() {
        return fuelConsumptionPerHundredKm;
    }

    public void setFuelConsumptionPerHundredKm(int fuelConsumptionPerHundredKm) {
        this.fuelConsumptionPerHundredKm = fuelConsumptionPerHundredKm;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
