import java.util.ArrayList;

public class CollectionManager {

    private ArrayList<BorrowableResource> resourceCollection = new ArrayList<>();

    public void addResource(BorrowableResource resource) {
        resourceCollection.add(resource);
    }

    public String listResourceCollection() {

        String resourceList = "";
        for (BorrowableResource resource : resourceCollection) {
            if (resource.getAvailability()) {
                resourceList += resource.getTitle() + " by " +  resource.getAuthor() + ", " + resource.getYear();
            }
        }
        return resourceList;
    }

    public String checkoutResource(BorrowableResource resource, User user) {
        if (resourceCollection.contains(resource) && resource.getAvailability() && user.getLoggedIn()) {
            resource.makeUnavailable();
            resource.setBorrower(user);
            return "Thank you! Enjoy the resource";
        } else {
            return "That resource is not available.";
        }
    }

    public String returnResource(BorrowableResource resource, User user) {
        if (resourceCollection.contains(resource) && !resource.getAvailability() && user.getLoggedIn()) {
            resource.makeAvailable();
            return "Thank you for returning the resource.";
        } else {
            return "That is not a valid resource to return.";
        }
    }
}
