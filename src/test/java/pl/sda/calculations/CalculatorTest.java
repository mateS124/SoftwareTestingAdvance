package pl.sda.calculations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  @Test
   void  shouldAddTwoNumbers(){

      // given
      double valueA = 5.2;
      double valueB = 3.1;
      Calculator calculator = new Calculator();
      double expectedValue = 8.3;

      //when
      double actualValue = calculator.add(valueA, valueB);

      //then
      assertEquals(expectedValue, actualValue );
   }
}