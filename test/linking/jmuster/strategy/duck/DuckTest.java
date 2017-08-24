package linking.jmuster.strategy.duck;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void display() {
        Duck d = new DecoyDuck();
        assertEquals("Hi There!, I am a DecoyDuck! I can not quack or fly.",d.display());

        d = new MallardDuck();
        assertEquals("Hi There!, I am a MallardDuck! I can quack and fly.",d.display());

        d = new RedheadDuck();
        assertEquals("Hi There!, I am a RedheadDuck! I can quack and fly.",d.display());

        d = new RubberDuck();
        assertEquals("Hi There!, I am a Rubber Duck! I can squeak but I not fly.",d.display());
    }

    @Test
    void swim() {
        String swimMessage = "I am swimming like the rest of the Ducks";

        Duck d = new DecoyDuck();
        assertEquals(swimMessage, d.swim());

        d = new MallardDuck();
        assertEquals(swimMessage, d.swim());

        d = new RedheadDuck();
        assertEquals(swimMessage, d.swim());

        d = new RubberDuck();
        assertEquals(swimMessage, d.swim());
    }

    @Test
    void performFly() {
        String dontFly = "I don't know how to fly!!";
        String canFly = "I am flying with wings";

        Duck d = new DecoyDuck();
        assertEquals(dontFly , d.performFly());
        d.setFlyBehavior( new FlyWithWings() );
        assertEquals(canFly , d.performFly());

        d = new MallardDuck();
        assertEquals(canFly, d.performFly());

        d = new RedheadDuck();
        assertEquals(canFly, d.performFly());

        d = new RubberDuck();
        assertEquals(dontFly, d.performFly());
    }

    @Test
    void performQuack() {
        String quack = "Quack! Quack!";
        String squeak = "Squeaking!";
        String mute = "... on mute ...";

        Duck d = new DecoyDuck();
        assertEquals(mute , d.performQuack());
        d.setQuackBehavior( new Quack() );
        assertEquals(quack , d.performQuack());
        d.setQuackBehavior( new Squeak() );
        assertEquals(squeak , d.performQuack());

        d = new MallardDuck();
        assertEquals(quack, d.performQuack());

        d = new RedheadDuck();
        assertEquals(quack, d.performQuack());

        d = new RubberDuck();
        assertEquals(squeak, d.performQuack());
    }

}