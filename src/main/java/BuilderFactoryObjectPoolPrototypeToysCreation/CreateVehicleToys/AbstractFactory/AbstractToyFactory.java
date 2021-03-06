package BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory;

import FacadeDecoratorAdapterCompositeFlyWeightVehiclesProductionLine.Vehicles.IVehicle;
import BuilderFactoryObjectPoolPrototypeToysCreation.CreateVehicleToys.AbstractFactory.ToyFactoryBox.FactoryToyBox;

public abstract class AbstractToyFactory {
    public abstract FactoryToyBox createToy(IVehicle iVehicle);
}
