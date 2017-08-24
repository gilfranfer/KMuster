package linking.jmuster.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {
    @Test
    void getInsatnce() {
        SingletonLazy s1 = SingletonLazy.getInsatnce();
        SingletonLazy s2 = SingletonLazy.getInsatnce();

        assertEquals( s1, s2);
    }

}