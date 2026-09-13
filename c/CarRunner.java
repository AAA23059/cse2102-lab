package c;

public class CarRunner {

    public static void main(String[] args) {

        HybridVehicle car = new HybridVehicle();

        car.setCostperGallon(3.50);
        car.setCostperkWh(0.24);

        car.setMilesfromGas(350);
        car.setGallonsfromGas(10);

        car.setElectricMiles(300);
        car.setTotalkWh(70);

        double mpg = car.calcGasMPG();
        System.out.println("Fully Gas Mode MPG: " + mpg);

        double mpge = car.calcMPGe();
        System.out.println("Fully Electric Mode MPGe: " + mpge);

        double averageMPG = (mpg + mpge) / 2;
        System.out.println("Half-Gas/Half-Electric Average MPG: " + averageMPG);


        System.out.println("Cost per Gallon: $" + car.getCostperGallon());
        System.out.println("Cost per kWh: $" + car.getCostperkWh());
    }
}