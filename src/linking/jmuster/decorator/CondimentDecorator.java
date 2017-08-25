package linking.jmuster.decorator;

public abstract class CondimentDecorator extends PizzaComponent{

    /**
     * Fforce all the condiments to implement the method, so they can add
     * themself to the final Pizza Description
     * @return The condiment price + the inner PizzaComponent´s price
     */
    public abstract String getDescription();

}

