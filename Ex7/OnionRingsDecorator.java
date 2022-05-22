public class OnionRingsDecorator implements Hamburger {
    private Hamburger hamburger;

    public OnionRingsDecorator(Hamburger hamburger) {
      this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with onion rings";
    }
}
