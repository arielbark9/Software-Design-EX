
public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        switch (code){
            case "sp":
                return new SpicyHamburger();
            case "la":
                return new LambHamburger();
            case "hm":
                return new HomemadeHamburger();
            case "cl":
                return new ClassicHamburger();
            default:
                return null;
        }
    }
}

