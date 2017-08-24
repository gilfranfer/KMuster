package linking.jmuster.strategy.duck;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public abstract String display();

    public String swim(){
        return "I am swimming like the rest of the Ducks";
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public String performFly(){
        return this.flyBehavior.fly();
    }

    public String performQuack(){
        return this.quackBehavior.quack();
    }

}
