package c;

public class HybridVehicle implements GasolineInterface, ElectricInterface {

    private double MilesfromGas;
    private double GallonsfromGas;

    private double ElectricMiles;
    private double TotalkWh;

    private double CostperGallon;
    private double CostperkWh;

    @Override 
    public double calcGasMPG() {
        return MilesfromGas / GallonsfromGas;
    }

    @Override 
    public void setMilesfromGas(double miles) {
        MilesfromGas = miles;
    }

    @Override 
    public void setGallonsfromGas(double gallons) {
        GallonsfromGas = gallons;
    }

    @Override 
    public void setCostperGallon(double cost) {
        CostperGallon = cost;

    }

    @Override 
    public double getCostperGallon() {
        return CostperGallon;
    }

    @Override
    public double calcMPGe() {
        return (ElectricMiles / TotalkWh) * 33.7;
    }

    @Override 
    public void setElectricMiles(double totalElectricMiles) {
        ElectricMiles = totalElectricMiles;

    }

    @Override 
    public void setTotalkWh(double totalkWh) {
        this.TotalkWh = totalkWh;

    }

    @Override 
    public void setCostperkWh(double totalCostperkWh) {
        CostperkWh = totalCostperkWh;

    }

    @Override 
    public double getCostperkWh() {
        return CostperkWh;
    }

    }