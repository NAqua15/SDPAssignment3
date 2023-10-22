public class DroneAdapter implements DroneController {
    private BrandSpecificDrone drone; // Reference to the adaptee

    public DroneAdapter(BrandSpecificDrone drone) {
        this.drone = drone; // Constructor that takes a BrandSpecificDrone object.
    }

    @Override
    public void fly() {
        drone.startFlying(); // Implementation of the fly() method from the DroneController interface.
                            // This method translates the call to the adaptee's startFlying() method.

    }

    @Override
    public void land() {
        drone.initiateLanding(); // Implementation of the land() method from the DroneController interface.
                                 // This method translates the call to the adaptee's initiateLanding() method.
    }
}
