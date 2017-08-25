package linking.jmuster.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.System.*;

class PizzaDecoratorTest {

    @Test
    void pizzaDescription(){
        PizzaComponent nyOnlyCheese = new NewYorkCrust();
        nyOnlyCheese = new Cheese(nyOnlyCheese);
        out.println(nyOnlyCheese.getDescription());

        PizzaComponent chicagoPeperoni = new ChicagoCrust();
        chicagoPeperoni = new Cheese( new Peperoni( chicagoPeperoni ));
        out.println(chicagoPeperoni.getDescription());


        assertEquals( "NewYork Style Pizza with Cheese",
                nyOnlyCheese.getDescription());

        assertEquals( "Chicago Style Pizza with Peperoni with Cheese",
                chicagoPeperoni.getDescription() );

    }

    @Test
    void pizzaCost() {

        PizzaComponent nyOnlyCheese = new NewYorkCrust();
        nyOnlyCheese = new Cheese(nyOnlyCheese);
        out.println( nyOnlyCheese.getDescription() + " costs:"+ nyOnlyCheese.cost() );

        PizzaComponent chicagoPeperoni = new ChicagoCrust();
        chicagoPeperoni = new Cheese( new Peperoni( chicagoPeperoni ));
        out.println( chicagoPeperoni.getDescription() + " costs:"+ chicagoPeperoni.cost() );

        PizzaComponent flatSalami2Cheese = new FlatbreadCrust();
        flatSalami2Cheese = new Cheese( new Cheese( new Salami( flatSalami2Cheese )));
        out.println( flatSalami2Cheese.getDescription() + " costs:"+ flatSalami2Cheese.cost() );

        assertEquals( Prices.NY_CRUST + Prices.CHEESE,
                nyOnlyCheese.cost());
        assertEquals( Prices.CHICAGO_CRUST + Prices.CHEESE + Prices.PEPERONI,
                chicagoPeperoni.cost() );
        assertEquals(Prices.FLATBREAD_CRUST + Prices.CHEESE + Prices.CHEESE + Prices.SALAMI,
                flatSalami2Cheese.cost());
    }

}