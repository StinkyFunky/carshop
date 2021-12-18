package carshop.model;

public abstract class Engine {

    protected double engineVolume;
    protected double cylinderAmount;
    protected double engineWeight;

    public Engine() {
    }

    public Engine(double engineVolume, double cylinderAmount, double engineWeight) {
        this.engineVolume = engineVolume;
        this.cylinderAmount = cylinderAmount;
        this.engineWeight = engineWeight;
    }

    protected abstract double efficiency();
    protected abstract double throttleEnergy();
    protected abstract double breakEnergy();

    public double getMaxSpeed() {
        return (throttleEnergy()-breakEnergy()) * efficiency();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public double getCylinderAmount() {
        return cylinderAmount;
    }

    public double getEngineWeight() {
        return engineWeight;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setCylinderAmount(double cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public void setEngineWeight(double engineWeight) {
        this.engineWeight = engineWeight;
    }
}
