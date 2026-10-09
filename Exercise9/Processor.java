package Exercise9;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CloudServiceArrayList cloudList = new CloudServiceArrayList();

        int choice;

        do {

            System.out.println("\n===== CLOUD SERVICE MANAGEMENT =====");
            System.out.println("1. Add Storage Service");
            System.out.println("2. Add Compute Service");
            System.out.println("3. Update Service");
            System.out.println("4. Delete Service");
            System.out.println("5. Display All Services");
            System.out.println("6. Display Active Services");
            System.out.println("7. Find Highest Monthly Cost");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    StorageService storage = new StorageService();

                    storage.addService();

                    cloudList.addServiceToArrayList(storage);

                    break;

                case 2:
                    ComputeService compute = new ComputeService();

                    compute.addService();

                    cloudList.addServiceToArrayList(compute);

                    break;

                case 3:
                    System.out.print("Enter service ID to update: ");
                    String updateId = sc.nextLine();

                    cloudList.updateServiceById(updateId);

                    break;

                case 4:
                    System.out.print("Enter service ID to delete: ");
                    String deleteId = sc.nextLine();

                    cloudList.deleteServiceById(deleteId);

                    break;

                case 5:
                    cloudList.displayAllServices();

                    break;

                case 6:
                    cloudList.displayActiveServices();

                    break;

                case 7:
                    double highestCost = cloudList.findHighestMonthlyCost();

                    System.out.println("Highest Monthly Cost: " + highestCost);

                    break;

                case 0:
                    System.out.println("Exit program!");

                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

    }
}
