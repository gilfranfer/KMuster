package linking.jmuster.decorator;

public class Cheese extends CondimentDecorator{

    PizzaComponent component;

    public Cheese(PizzaComponent component) {
        this.component = component;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " with Cheese";
    }

    @Override
    public double cost() {
        return Prices.CHEESE + component.cost();
    }

}
