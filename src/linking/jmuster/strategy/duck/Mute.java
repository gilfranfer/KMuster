package linking.jmuster.strategy.duck;

public class Mute implements QuackBehavior{


    @Override
    public String quack() {
        return "... on mute ...";
    }

}
