package u;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import c.HybridVehicle;

public class HybridVehicleTest {
    
    @Test
    public void testGasMPG() {
        HybridVehicle car = new HybridVehicle();

        car.setMilesfromGas(350);
        car.setGallonsfromGas(10);

        assertEquals(35.0, car.calcGasMPG(), 0.01);
    }

    @Test
    public void testMPGe() {
        HybridVehicle car = new HybridVehicle();

        car.setElectricMiles(300);
        car.setTotalkWh(70);

        assertEquals(144.43, car.calcMPGe(), 0.01);
    }

    @Test
    public void testCostPerGallon() {
        HybridVehicle car = new HybridVehicle();

        car.setCostperGallon(3.50);

        assertEquals(3.50, car.getCostperGallon(), 0.01);
    }

    @Test
    public void testCostPerKwh() {
        HybridVehicle car = new HybridVehicle();

        car.setCostperkWh(0.24);

        assertEquals(0.24, car.getCostperkWh(), 0.01);
    }

    @Test
    public void testAverageMPG() {
        HybridVehicle car = new HybridVehicle();

        car.setMilesfromGas(350);
        car.setGallonsfromGas(10);

        car.setElectricMiles(300);
        car.setTotalkWh(70);

        double average = (car.calcGasMPG() + car.calcMPGe()) / 2;

        assertEquals(89.715, average, 0.01);
    }
}
