package linking.jmuster.strategy.duck;


public class MallardDuck extends Duck{

    public MallardDuck(){
        this.setFlyBehavior( new FlyWithWings() );
        this.setQuackBehavior( new Quack() );
    }

    @Override
    public String display() {
        return "Hi There!, I am a MallardDuck! I can quack and fly.";
    }
}

