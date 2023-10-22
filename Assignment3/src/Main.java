public class Main {
    public static void main(String[] args) {
        BrandSpecificDrone specificDrone = new BrandSpecificDrone(); // Create an instance of the BrandSpecificDrone
        DroneController universalController = new DroneAdapter(specificDrone);  // Create an instance of the DroneAdapter, passing the specificDrone to it.

        // Use the universal controller to control the drone.
        universalController.fly();
        universalController.land();
    }
}
