import Interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    @java.lang.Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
