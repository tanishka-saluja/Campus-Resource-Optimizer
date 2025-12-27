import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Create manager
        ResourceManager manager = new ResourceManager();

        // Add sample resources
        manager.addResource(new Resource(1, "Central Library", "Library",
                "Block A", 100, 40, "10-11"));

        manager.addResource(new Resource(2, "CS Lab 1", "Lab",
                "Block B", 30, 25, "10-11"));

        manager.addResource(new Resource(3, "Reading Room", "Library",
                "Block A", 50, 10, "10-11"));

        manager.addResource(new Resource(4, "Sports Hall", "Sports",
                "Block C", 40, 35, "10-11"));

        // Simulated user request
        String preferredType = "Library";
        String timeSlot = "10-11";
        String userLocation = "Block A";

        // Get available resources
        List<Resource> available =
                manager.getAvailableResources(preferredType, timeSlot);

        // Get best resource
        Resource best =
                manager.getBestResource(available, userLocation);

        // Output
        if (best == null) {
            System.out.println("No available resource found.");
        } else {
            System.out.println("Best Resource Recommendation:");
            System.out.println("Name: " + best.resourceName);
            System.out.println("Location: " + best.location);
            System.out.println("Crowd Ratio: " + best.getCrowdRatio());
        }
    }
}
