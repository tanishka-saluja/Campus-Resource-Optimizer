public class Resource {

    int resourceId;
    String resourceName;
    String resourceType;
    String location;
    int capacity;
    int currentUsage;
    String timeSlot;

    public Resource(int resourceId, String resourceName, String resourceType,
                    String location, int capacity, int currentUsage, String timeSlot) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
        this.location = location;
        this.capacity = capacity;
        this.currentUsage = currentUsage;
        this.timeSlot = timeSlot;
    }

    double getCrowdRatio() {
        return (capacity == 0) ? 1.0 : (double) currentUsage / capacity;
    }

    boolean isAvailable() {
        return currentUsage < capacity;
    }
}
