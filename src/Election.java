import java.util.HashMap;
import java.util.Map;

public class Election {
    private Map<String, Candidate> candidates;
    private Map<String, Voter> voters;
    private boolean isElectionClosed;

    public Election() {
        candidates = new HashMap<>();
        voters = new HashMap<>();
        isElectionClosed = false;
        initializeData();
    }

    private void initializeData() {
        candidates.put("C1", new Candidate("C1", "Aarav"));
        candidates.put("C2", new Candidate("C2", "Meera"));
        candidates.put("C3", new Candidate("C3", "Kirti"));

        for (int i = 1; i <= 100; i++) {
            String id = String.valueOf(i);
            voters.put(id, new Voter(id, "Voter_" + i));
        }
    }

    public Map<String, Candidate> getCandidates() {
        return candidates;
    }

    public Map<String, Voter> getVoters() {
        return voters;
    }

    public boolean isElectionClosed() {
        return isElectionClosed;
    }

    public void closeElection() {
        isElectionClosed = true;
    }
}
