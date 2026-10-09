package Exercise9;

import java.util.ArrayList;

public class CloudServiceArrayList {

    ArrayList<CloudService> cloudServiceList = new ArrayList<>();

    public void addServiceToArrayList(CloudService cloud) {
        cloudServiceList.add(cloud);
        System.out.println("Add oke");
    }

    public void updateServiceById(String id) {
        for (CloudService cloud : cloudServiceList) {
            if (cloud.getId().equals(id)) {
                cloud.updateService();
                System.out.println("Cloud Updated!");
                return;
            }
        }
    }

    public void deleteServiceById(String id) {
        for (CloudService cloud : cloudServiceList) {
            if (cloud.getId().equals(id)) {
                cloudServiceList.remove(cloud);
                System.out.println("Cloud deleted1");
                return;
            }
        }
        System.out.println("ID not found!");
    }

    public void displayAllServices() {
        for (CloudService cloud : cloudServiceList) {
            cloud.displayDetails();
        }
    }
    
    public void displayActiveServices(){
        for (CloudService cloud : cloudServiceList){
            if(cloud.IsActive()){
                cloud.displayDetails();
            }
        }
    }
    
    public double findHighestMonthlyCost(){
         if (cloudServiceList.isEmpty()) {
        return 0;
    }

    double highest = 0;

    for (CloudService cloud : cloudServiceList) {
        double cost = cloud.calculateMonthlyCost();

        if (cost > highest) {
            highest = cost;
        }
    }

    return highest;
    }
}
