package linking.jmuster.strategy.duck;

public class FlyNoWay implements FlyBehavior{

    @Override
    public String fly() {
        return "I don't know how to fly!!";
    }

}
