
package canedochristian.it2c;

import java.util.Scanner;

public class scholarships {
    
      Scanner sc = new Scanner(System.in);
      scholarship[] appli = new scholarship[100];

    public void getScholarshipApp() {
        
        System.out.print("Enter number of applications: ");
        int numOfApp = sc.nextInt();

        for (int i = 0; i < numOfApp; i++) {
            System.out.println("\nEnter details of Application " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            
            sc.nextLine(); // Consume the newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();

            System.out.print("Annual Family Income: ");
            double annualFamilyIncome = sc.nextDouble();

            System.out.print("Community Service Hours: ");
            int communityServiceHours = sc.nextInt();

           
            appli[i] = new scholarship();
            appli[i].addScholarship(id, name, gpa, annualFamilyIncome, communityServiceHours);
        }

        System.out.printf("\n\n%-5s %-15s %-5s %-15s %-10s %-10s\n", "ID", "Name", "GPA", "Annual Family Income", "Service Hours", "Status");
        for (int i = 0; i < numOfApp; i++) {
            appli[i].viewScholarship();
        }
    }
}
    
