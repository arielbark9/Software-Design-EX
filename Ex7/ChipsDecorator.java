public class ChipsDecorator implements Hamburger {
    private Hamburger hamburger;

    public ChipsDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with chips";
    }
}
