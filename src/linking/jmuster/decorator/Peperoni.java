package linking.jmuster.decorator;

public class Peperoni extends CondimentDecorator{

    PizzaComponent component;

    public Peperoni(PizzaComponent c){
        component = c;
    }

    @Override
    public String getDescription() {
        return component.getDescription() + " with Peperoni";
    }

    @Override
    public double cost() {
        return Prices.PEPERONI + component.cost();
    }
}
