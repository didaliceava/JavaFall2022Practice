package group_exercises.email_app;

import java.util.HashMap;
import java.util.Scanner;

public class TestEmailApp {

    /*
    Scenario: You are an IT Support Administrator Specialist and are charged with the task of creating email accounts for new hires.
    Your application should do the following:
         Generate an email with the following syntax: firstname.lastname@department.company.com
         Determine the department (sales, development, accounting), if none leave blank
         Generate a random String for a password
         Have set methods to change the password, set the mailbox capacity, and define an alternate email address
         Have get methods to display the name, email, and mailbox capacity
     */

    // Company
    // Employee
    // Mailbox


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Welcome to your first day at " + Company.NAME + "\n\nPlease enter your first name: \t");
        String firstName = stdin.nextLine();

        System.out.println("Please enter your last name: \t");
        String lastName = stdin.nextLine();

        System.out.println("Welcome " + firstName + " " + lastName + "\n\nWhich department do you work in?");
        printDepartments();
        int deptNumber = stdin.nextInt();
        String deptName = convertDeptNumToDeptNameSalary(deptNumber);
        String email = firstName + "." + lastName + "@" + deptName + "." + Company.NAME.toLowerCase() + ".com";

        Employee emp = new Employee(firstName, lastName, email, 50_000);

        System.out.println("Your new email address is " + emp.getEmailAddress() + "\nSALARY: " + emp.getSalary());
    }

    private static void printDepartments() {
        Company.Department[] deptArray = Company.Department.values();
        int length = deptArray.length;

        HashMap<Integer, String> depts = new HashMap<>();
        for (int i = 0; i < length; i++) {
            depts.put(i + 1, deptArray[i].toString());
        }

        for (int i = 1; i <= depts.size(); i++) {
            System.out.println(i + " - " + depts.get(i));
        }
    }

    private static String convertDeptNumToDeptNameSalary(int deptNum) {
        String deptName = "";

        switch (deptNum) {
            case 1:
                deptName = "sales";
                break;
            case 2:
                deptName = "it";
                break;
            case 3:
                deptName = "hr";
                break;
            case 4:
                deptName = "administration";
                break;
            case 5:
                deptName = "finance";
                break;
            case 6:
                deptName = "executive";
                break;
            case 7:
                deptName = "marketing";
                break;
            default:
                deptName = "unknown";
        }
        return deptName;
    }

}
