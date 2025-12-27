import java.util.ArrayList;
import java.util.List;

public class ResourceManager {

    private List<Resource> resources;

    public ResourceManager() {
        resources = new ArrayList<>();
    }

    // Add a resource
    public void addResource(Resource r) {
        resources.add(r);
    }

    // Step 1: filter available resources
    public List<Resource> getAvailableResources(String type, String timeSlot) {
        List<Resource> available = new ArrayList<>();

        for (Resource r : resources) {
            if (r.resourceType.equalsIgnoreCase(type)
                    && r.timeSlot.equals(timeSlot)
                    && r.isAvailable()) {
                available.add(r);
            }
        }
        return available;
    }

    // Step 2: pick best resource
    public Resource getBestResource(List<Resource> available, String userLocation) {
        if (available.isEmpty()) return null;

        Resource best = available.get(0);
        double bestScore = calculateScore(best, userLocation);

        for (Resource r : available) {
            double score = calculateScore(r, userLocation);
            if (score < bestScore) {
                bestScore = score;
                best = r;
            }
        }
        return best;
    }

    // Step 3: scoring logic
    private double calculateScore(Resource r, String userLocation) {
        double crowdScore = r.getCrowdRatio() * 10;
        int locationScore = r.location.equalsIgnoreCase(userLocation) ? 0 : 1;
        return crowdScore + locationScore;
    }
}
