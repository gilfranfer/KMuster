package linking.jmuster.strategy.duck;

public class DecoyDuck extends Duck{

    public DecoyDuck(){
        this.setFlyBehavior( new FlyNoWay() );
        this.setQuackBehavior( new Mute() );
    }

    @Override
    public String display() {
        return "Hi There!, I am a DecoyDuck! I can not quack or fly.";
    }

}
