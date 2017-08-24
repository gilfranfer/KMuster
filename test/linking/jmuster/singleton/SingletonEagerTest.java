package linking.jmuster.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerTest {
    @Test
    void getInsatnce() {
        SingletonEager s1 = SingletonEager.getInsatnce();
        SingletonEager s2 = SingletonEager.getInsatnce();

        assertEquals( s1, s2);
    }

}