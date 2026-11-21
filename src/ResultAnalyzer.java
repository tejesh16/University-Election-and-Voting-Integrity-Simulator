
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ResultAnalyzer {
    private Election election;

    public ResultAnalyzer(Election election) {
        this.election = election;
    }

    public void displayResultsReport() {
        Map<String, Candidate> candidates = election.getCandidates();
        Map<String, Voter> voters = election.getVoters();

        int eligibleVoters = voters.size();
        int votesCast = 0;

        for (Voter v : voters.values()) {
            if (v.hasVoted()) {
                votesCast++;
            }
        }

        int notVoted = eligibleVoters - votesCast;
        double participationPercentage = (double) votesCast / eligibleVoters * 100;

        System.out.println("\n========================================");
        System.out.println("           UNIVERSITY ELECTION          ");
        System.out.println("========================================");
        System.out.printf("%-18s %s\n", "Candidate", "Votes");
        for (Candidate c : candidates.values()) {
            System.out.printf("%-18s %d\n", c.getName(), c.getVotes());
        }
        System.out.println("----------------------------------------");
        System.out.println("Eligible Voters:   " + eligibleVoters);
        System.out.println("Total Votes Cast:  " + votesCast);
        System.out.println("Not Voted:         " + notVoted);
        System.out.printf("Participation:     %.2f%%\n", participationPercentage);
        System.out.println("----------------------------------------");

        // Winner and tie detection logic
        int maxVotes = -1;
        List<Candidate> winners = new ArrayList<>();

        for (Candidate c : candidates.values()) {
            if (c.getvotes() > maxVotes) {
                maxVotes = c.getVotes();
                winners.clear();
                winners.add(c);
            } else if (c.getVotes() == maxVotes && maxVotes > 0) {
                winners.add(c);
            }
        }

        if (maxVotes == 0) {
            System.out.println("Winner: No votes recorded yet.");
        } else if (winners.size() > 1) {
            System.out.print("Result: IT'S A TIE between: ");
            for (int i = 0; i < winners.size(); i++) {
                System.out.print(winners.get(i).getName() + (i == winners.size() - 1 ? "" : ", "));
            }
            System.out.println();
        } else {
            System.out.println("Winner: " + winners.get(0).getName());
        }
        System.out.println("========================================");
    }
}