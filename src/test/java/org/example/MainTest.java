package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    A a = new A();
    B b = new B();

    @Test
    void testF1() {
        int result = A.f1(0);
        Assertions.assertEquals(1, result);
    }

    @Test
    void testF2() {
        int result = A.f2(0);
        Assertions.assertEquals(2, result);
    }


    @Test
    void testF5() {
        double result1 = A.f5(6, 2);
        Assertions.assertEquals(3, result1);
        double result2 = A.f5(-6, 2);
        Assertions.assertEquals(-3, result2);
        double result3 = A.f5(-6, -2);
        Assertions.assertEquals(3, result3);
        double result4 = A.f5(6, -2);
        Assertions.assertEquals(-3, result4);

        Assertions.assertTrue(Double.isInfinite(A.f5(5.0, 0.0)));
        Assertions.assertTrue(Double.isNaN(A.f5(0.0, 0.0)));
    }

    @Test
    void testF6() {
        int result = A.f6(0);
        Assertions.assertEquals(5, result);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            A.f6(-1);
        });
    }

    @Test
    void testF7() {
        String result = A.f7("s");
        Assertions.assertEquals("s more stuff", result);
    }

    @Test
    void testF8() {
        int result = a.f8(2);
        Assertions.assertEquals(10, result);
    }


    @Test
    void testB() {
        int result = b.g1(2,a);
        Assertions.assertEquals(10, result);
    }
}
