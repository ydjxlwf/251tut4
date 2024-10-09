package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 1)); // 故意写错，期望的结果应该是 2，但实际结果应该是 3
    }

}
