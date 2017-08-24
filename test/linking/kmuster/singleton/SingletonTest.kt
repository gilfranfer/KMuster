package linking.kmuster.singleton

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SingletonTest {


    @Test fun sameInstance() {

        val first = Singleton.instance
        val second = Singleton.instance
        assertEquals( first,second)
        first.value = "New Value"
        assertEquals( first.value, second.value)

    }

}