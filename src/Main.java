
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Election election = new Election();
        VotingManager votingManager = new VotingManager(election);
        ResultAnalyzer resultAnalyzer = new ResultAnalyzer(election);

        System.out.println("==================================================");
        System.out.println("   UNIVERSITY ELECTION & VOTING INTEGRITY SYSTEM  ");
        System.out.println("==================================================");

        while (true) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. View Candidates");
            System.out.println("2. Cast a Vote");
            System.out.println("3. View Live Report & Turnout");
            System.out.println("4. Close Election & Finalize Results");
            System.out.println("5. Exit Simulator");
            System.out.print("Enter your choice (1-5): ");

            String choiceInput = scanner.nextLine().trim();

            switch (choiceInput) {
                case "1":
                    votingManager.displayCandidates();
                    break;
                case "2":
                    votingManager.castVote(scanner);
                    break;
                case "3":
                    resultAnalyzer.displayResultsReport();
                    break;
                case "4":
                    election.closeElection();
                    System.out.println("\n[NOTICE] Election has been officially CLOSED.");
                    resultAnalyzer.displayResultsReport();
                    break;
                case "5":
                    System.out.println("Exiting University Voting Simulator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}