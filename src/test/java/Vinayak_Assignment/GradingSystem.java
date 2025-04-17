package Vinayak_Assignment;

public class GradingSystem {
	
	public static void main(String[] args) {
        int marks = 88;  

        if (marks < 35) {
            System.out.println("Fail");
        } else if (marks >= 35 && marks <= 60) {
            System.out.println("Grade B");
        } else if (marks > 60 && marks <= 80) {
            System.out.println("Grade A");
        } else if (marks > 80) {
            System.out.println("Grade A+");
        }
    }
}


