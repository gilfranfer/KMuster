package linking.jmuster.decorator;

public class ChicagoCrust extends PizzaComponent {

    public ChicagoCrust(){
        this.setDescription("Chicago Style Pizza");
    }

    @Override
    public double cost() {
        return Prices.CHICAGO_CRUST;
    }

}
