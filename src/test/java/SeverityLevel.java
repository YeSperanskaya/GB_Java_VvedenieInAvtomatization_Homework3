
public enum SeverityLevel {
    BLOCKER("blocker"),
    CRITICAL("critical"),
    NORMAL("normal"),
    MINOR("mimor"),
    TRIVIAL("trivial");

    private final String value;
    SeverityLevel(final String v) {
        value = v;
    }
    public String value() {return value;}
    @Override
    public String toString() {return value();}


}
