import java.util.Scanner;

public class VotingManager {
    private Election election;

    public VotingManager(Election election) {
        this.election = election;
    }

    public void displayCandidates() {
        System.out.println("\n============================");
        System.out.println("    REGISTERED CANDIDATES     ");
        System.out.println("============================");
        for (Candidate c : electio.getCandidates().values()) {
            System.out.println("ID: " + c.getCandidateId() + " | Name: " + c.getName());
        }
        System.out.println("============================");
    }

    public void castVote(Scanner, scanner) {
        if (election.isElectionClosed()) {
            System.out.println("Error : The election is closed. No more votes can be cast.");
            return;
        }

        System.out.print("Enter your voter ID(1 to 100): ");
        string voterID = scanner.nextLine().trim();

        Voter voter = election.getVoters().get(voterId);
        if (voter == null) {
            System.out.println("Error: Invalid Voter ID. You are not on the eligible voter list.");
            return;
        }

        if (voter.hasVoted()) {
            System.out.println("Error: Duplicate vote attempt detected! Voter ID " + voterId + " has already voted.");
            return;
        }

        displayCandidates();
        System.out.print("Enter Candidate ID you wish to vote for (e.g., C1, C2, C3): ");
        String candidateId = scanner.nextLine().trim().toUpperCase();

        Candidate candidate = election.getCandidates().get(candidateId);
        if (candidate == null) {
            System.out.println("Error: Invalid Candidate ID choice.");
            return;
        }

        candidate.addVote();
        voter.markVoted();
        System.out.println("Success! Your vote has been securely recorded for " + candidate.getName() + ".");
    }
}
