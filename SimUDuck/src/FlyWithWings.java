import Interfaces.FlyBehaviour;

public class FlyWithWings  implements FlyBehaviour {
    @java.lang.Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
