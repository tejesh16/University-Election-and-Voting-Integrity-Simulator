# University Election and Voting Integrity Simulator

A modular, object-oriented Java console application designed to simulate secure university elections, prevent double-voting, compute participation metrics, and handle winner/tie detection.

## Features
- 3 predefined candidates and 100 predefined voters (IDs 1 to 100)
- Voter ID verification
- One vote per voter (duplicate votes are rejected)
- Invalid voter ID and invalid candidate handling
- Election can be closed, no votes accepted after that
- Vote tally, participation percentage, winner and tie detection

## Project Structure
```text
UniversityElection/
├── src/
│   ├── Candidate.java
│   ├── Voter.java
│   ├── Election.java
│   ├── VotingManager.java
│   ├── ResultAnalyzer.java
│   └── Main.java
├── .gitignore
└── README.md
```

## Team Members and Contributions

| Member | Files | Responsibility |
|---|---|---|
| Sarvi Jain (Member 1) | `Candidate.java`, `Voter.java` | Data management: candidate and voter records |
| Tejesh (Member 2) | `Election.java`, `VotingManager.java` | Election setup, voter verification, duplicate vote prevention, vote recording |
| Lalit Patel (Member 3) | `ResultAnalyzer.java`, `Main.java` | Vote counting, participation %, winner/tie logic, main menu, integration |

## How to Compile and Run

From the project root folder:

```bash
javac src/*.java
java -cp src Main
```

## Menu Options
1. View Candidates
2. Cast a Vote
3. View Live Report and Turnout
4. Close Election and Finalize Results
5. Exit

## Sample Voter and Candidate IDs
- Voter IDs: `1` to `100`
- Candidate IDs: `C1` (Aarav), `C2` (Meera), `C3` (Kirti)

## Test Cases Covered
- Eligible voter casts a vote
- Duplicate vote attempt is rejected
- Invalid voter ID is rejected
- Invalid candidate ID is rejected
- No votes cast: 0% participation, no winner
- Tie between candidates is detected
- Voting after the election is closed is rejected