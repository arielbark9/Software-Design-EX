public enum Season {
    WINTER, SPRING, SUMMER, FALL;

    // Season next for quick enumeration
    private static final Season[] values = values();
    public Season next()
    {
        return values[(this.ordinal()+1) % values.length];
    }
}
