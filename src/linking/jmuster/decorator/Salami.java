package linking.jmuster.decorator;

public class Salami extends CondimentDecorator {

    PizzaComponent component;

    public Salami(PizzaComponent component) {
        this.component = component;
    }


    @Override
    public String getDescription() {
        return component.getDescription() + " with Salami";
    }

    @Override
    public double cost() {
        return Prices.SALAMI + component.cost();
    }
}
