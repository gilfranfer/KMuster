package linking.kmuster.observer

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ObserverTest{
    /* OBSERVER PATTERN
     * GoF Definition:
     * Define a one-to-many dependency between objects so that when one object changes state,
     * all its dependents are notified and updated automatically.
     */

    @Test
    fun observerTest(){
        val sub1 = Subject1()
        val sub2 = Subject2()
        val ob1 = Observer1()
        val ob2 = Observer2()
        val ob3 = Observer3()

        sub1.register(ob1)
        sub1.register(ob2)
        sub1.register(ob3)
        assertEquals(sub1.observersList.size,3)

        sub2.register(ob2)
        sub2.register(ob3)
        assertEquals(sub2.observersList.size,2)

        //Observer1, Observer2 and Observer3 get updates
        sub1.myValue = 50
        println()

        //Observer2 and Observer3 get notification
        sub2.myValue = 250
        println()

        sub1.unregister(ob2)
        sub1.unregister(ob3)
        assertEquals(sub1.observersList.size,1)

        //Observer1 is notified
        sub1.myValue = (550)
        println()

        //ob2 and ob3 can still notice change in Subject 2
        sub2.myValue = (750)
        assertEquals(sub2.observersList.size,2)
    }

}