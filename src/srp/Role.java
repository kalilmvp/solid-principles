package srp;

public enum Role {
    PROGRAMMER(new TenOrTwentyPercent()),
    DBA(new FifteenOrTwentyFivePercent()),
    TESTER(new FifteenOrTwentyFivePercent());

    private Rules rules;

    Role(Rules rules) {
        this.rules = rules;
    }

    public Rules getRules() {
        return rules;
    }
}
