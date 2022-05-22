public class SaladDecorator implements Hamburger {
    private Hamburger hamburger;

    public SaladDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with salad";
    }
}
