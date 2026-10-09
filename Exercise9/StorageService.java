package Exercise9;

import java.util.Date;
import java.util.Scanner;

public class StorageService extends CloudService {

    private int storageGB;
    private boolean encryptionEnabled;

    public StorageService() {

    }

    public StorageService(int storageGB, boolean encryptionEnabled) {
        this.storageGB = storageGB;
        this.encryptionEnabled = encryptionEnabled;
    }

    public StorageService(int storageGB, boolean encryptionEnabled, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.storageGB = storageGB;
        this.encryptionEnabled = encryptionEnabled;
    }

    public int getStorageGB() {
        return storageGB;
    }

    public void setStorageGB(int storageGB) {
        this.storageGB = storageGB;
    }

    public boolean isEncryptionEnabled() {
        return encryptionEnabled;
    }

    public void setEncryptionEnabled(boolean encryptionEnabled) {
        this.encryptionEnabled = encryptionEnabled;
    }

    Scanner sc = new Scanner(System.in);

    @Override
    public void addService() {
        super.addService();

        System.out.println("Add storageGB: ");
        setStorageGB(sc.nextInt());

        System.out.println("Add encryptionEnabled: ");
        setEncryptionEnabled(sc.nextBoolean());
    }

    @Override
    public void updateService() {
        super.updateService();

        System.out.println("Add storageGB: ");
        setStorageGB(sc.nextInt());

        System.out.println("Add encryptionEnabled: ");
        setEncryptionEnabled(sc.nextBoolean());
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("\n ===== StorageService =====");
        System.out.println("storageGB: " + this.storageGB);
        System.out.println("encryptionEnabled: " + this.encryptionEnabled);
        System.out.println("-----------------------------");
    }

    @Override
    public double calculateMonthlyCost() {

        double baseCost = getBaseMonthlyFee() * getMonthsUsed();

        if (storageGB >= 1000) {
            baseCost = baseCost + baseCost * 0.20;
        } else if (storageGB >= 500) {
            baseCost = baseCost + baseCost * 0.10;
        } else {
            baseCost = baseCost + baseCost * 0.05;
        }

        if (encryptionEnabled == true) {
            baseCost = baseCost + baseCost * 0.05;
        }

        return baseCost;
    }
}
