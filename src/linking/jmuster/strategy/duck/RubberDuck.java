package linking.jmuster.strategy.duck;

public class RubberDuck extends Duck {

    public RubberDuck(){
        this.setFlyBehavior( new FlyNoWay() );
        this.setQuackBehavior( new Squeak() );
    }

    @Override
    public String display() {
        return "Hi There!, I am a Rubber Duck! I can squeak but I not fly.";
    }

}
