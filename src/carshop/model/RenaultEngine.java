package carshop.model;

public class RenaultEngine extends Engine{

    private double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, double cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    @Override
    protected double efficiency() {
        return 0.27;
    }

    @Override
    protected double throttleEnergy() {
        return engineVolume * cylinderAmount * 110 + extraTurboEnergy;
    }

    @Override
    protected double breakEnergy() {
        return engineWeight * 2.1;
    }
}
