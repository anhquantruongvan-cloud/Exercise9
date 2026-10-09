package Exercise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class CloudService implements ICloudService {

    private String id;
    private double baseMonthlyFee;
    private Date startDate;
    private boolean isActive;
    private int monthsUsed;
    
    public CloudService() {
        
    }
    
    public CloudService(String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }
    
    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }
    
    public Date getStartDate() {
        return startDate;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public boolean IsActive() {
        return isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    public int getMonthsUsed() {
        return monthsUsed;
    }
    
    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }
    Scanner sc = new Scanner(System.in);
    
    public void addService() {
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        
        System.out.print("Enter Fee: ");
        setBaseMonthlyFee(sc.nextDouble());
        sc.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter Date:");
        String Date = sc.nextLine();
        try {
            setStartDate(sdf.parse(Date));
        } catch (ParseException ex) {
            System.getLogger(CloudService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        System.out.print("Enter Active: ");
        setIsActive(sc.nextBoolean());
        
        System.out.print("Enter Months Used: ");
        setMonthsUsed(sc.nextInt());
    }

    public void updateService() {
        System.out.print("Enter Fee: ");
        setBaseMonthlyFee(sc.nextDouble());
        sc.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter Date:");
        String Date = sc.nextLine();
        try {
            setStartDate(sdf.parse(Date));
        } catch (ParseException ex) {
            System.getLogger(CloudService.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        System.out.print("Enter Active: ");
        setIsActive(sc.nextBoolean());
        
        System.out.print("Enter Months Used: ");
        setMonthsUsed(sc.nextInt());
    }

    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n<><><><><> Cloud-Servce <><><><><> ");
        System.out.println("ID" + this.id);
        System.out.println("Fee: " + this.baseMonthlyFee);
        System.out.println("Date: " + sdf.format(startDate));
        System.out.println("Active: " + this.isActive);
        System.out.println("Months Used: " + this.monthsUsed);
        System.out.println("-------------------------------------");
    }
}
