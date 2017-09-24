package VehiclesProductionLine.VehicleStructure.VehicleDetails;

import VehiclesProductionLine.VehicleStructure.VehicleDetails.Component.IComponent;

/**
 * Class that responsible to create the engine of the car, its a leaf of the composite design pattern
 */
public class VehicleEngine implements IComponent{
    private String name = null;

    public VehicleEngine(String name) {
        this.name = name;
    }
    @Override
    public void make() {
        System.out.println("Item: " + name + " builded.");
    }
}
