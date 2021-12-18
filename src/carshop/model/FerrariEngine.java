package carshop.model;

public class FerrariEngine extends Engine{

    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, double cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    protected double efficiency() {
        return 0.25;
    }

    @Override
    protected double throttleEnergy() {
        return engineVolume * cylinderAmount * 100;
    }

    @Override
    protected double breakEnergy() {
        return engineWeight * 2;
    }
}
