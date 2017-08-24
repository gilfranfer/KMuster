package linking.jmuster.strategy.duck;

public class RedheadDuck extends Duck{

    public RedheadDuck(){
        this.setFlyBehavior( new FlyWithWings() );
        this.setQuackBehavior( new Quack() );
    }

    @Override
    public String display() {
        return "Hi There!, I am a RedheadDuck! I can quack and fly.";
    }
}
