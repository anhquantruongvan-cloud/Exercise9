package Exercise9;

import java.util.Date;
import java.util.Scanner;

public class ComputeService extends CloudService {
    private int cpuCores;
    private double runtimeHours;
    
    public ComputeService(){
        
    }

    public ComputeService(int cpuCores, double runtimeHours) {
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public ComputeService(int cpuCores, double runtimeHours, String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        super(id, baseMonthlyFee, startDate, isActive, monthsUsed);
        this.cpuCores = cpuCores;
        this.runtimeHours = runtimeHours;
    }

    public int getCpuCores() {
        return cpuCores;
    }

    public void setCpuCores(int cpuCores) {
        this.cpuCores = cpuCores;
    }

    public double getRuntimeHours() {
        return runtimeHours;
    }

    public void setRuntimeHours(double runtimeHours) {
        this.runtimeHours = runtimeHours;
    }
    Scanner sc = new Scanner (System.in);
    
    @Override
    public void addService (){
        super.addService();
        
        System.out.println("Add cpuCores: ");
        setCpuCores(sc.nextInt());
        
        System.out.println("Add runtimeHours: ");
        setRuntimeHours(sc.nextDouble());
    }
    @Override
    public void updateService (){
        super.updateService();
        
        System.out.println("Add cpuCores: ");
        setCpuCores(sc.nextInt());
        
        System.out.println("Add runtimeHours: ");
        setRuntimeHours(sc.nextDouble());
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        
        System.out.println("\n===== ComputeService ===== ");
        System.out.println("cpuCores: "+this.cpuCores);
        System.out.println("runtimeHours: "+this.runtimeHours);
        System.out.println("-----------------------------");
    }
     @Override
    public double calculateMonthlyCost() {

        double baseCost = getBaseMonthlyFee() * getMonthsUsed();

        if (cpuCores >= 16) {
            baseCost = baseCost + baseCost * 0.25;
        } else if (cpuCores >= 8) {
            baseCost = baseCost + baseCost * 0.15;
        } else {
            baseCost = baseCost + baseCost * 0.05;
        }

        if (runtimeHours > 200) {
            baseCost = baseCost + (runtimeHours - 200) * 0.50;
        }

        return baseCost;
    }
}
