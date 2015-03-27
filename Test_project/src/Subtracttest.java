

import org.testng.Assert;
import org.testng.annotations.Test;

public class Subtracttest {
  @Test
  public void sub() {
	  
	  Calculator calc = new Calculator();
	  
	  Assert.assertEquals(calc.sub(21, 5), 16);
  }
}
