import Interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @java.lang.Override
    public void quack() {
        System.out.println("Quack!");
    }
}
