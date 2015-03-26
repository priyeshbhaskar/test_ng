

import org.testng.annotations.Test;
import org.testng.Assert;

public class NewTest {
  @Test
  public void f() {
	  
	  Calculator calc = new Calculator();
	  
	  Assert.assertEquals(calc.add(6, 5), 11);
  }
}
