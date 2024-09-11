
package canedochristian.it2c;

public class scholarship {
   
    int id;
    String name;
    double gpa;
    double Income;
    int Hours;
    String status;

    public void addScholarship(int id, String name, double gpa, double annualFamilyIncome, int communityServiceHours) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.Income = annualFamilyIncome;
        this.Hours = communityServiceHours;
        checkEligibility();
    }

    private void checkEligibility() {
        if (gpa >= 3.5 && Income <= 400000 && Hours >= 50) {
            status = "Approved";
        } else {
            status = "Denied";
        }
    }

    public void viewScholarship() {
        System.out.printf("%-5d %-15s %-5.2f %-15.2f %-10d %-10s\n", id, name, gpa, Income, Hours, status);
    }
}
          
        
    

