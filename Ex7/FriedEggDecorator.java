public class FriedEggDecorator implements Hamburger {
    private Hamburger hamburger;

    public FriedEggDecorator(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    @Override
    public String serve() {
        return hamburger.serve() + " with fried egg";
    }
}
