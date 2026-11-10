public class Voter {
    private String id;
    private String name;
    private boolean voted;

    public Voter(String id, String name) {
        this.id = id;
        this.name = name;
        this.voted = false;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean hasVoted() {
        return voted;
    }

    public void markVoted() {
        voted = true;
    }
}
