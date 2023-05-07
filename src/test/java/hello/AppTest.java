package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
  
  private App app = new App();

  @Test
  public void factSumTest1() {
    assertEquals("Resultado", app.factSum(0, 0), 2);
  }

  @Test
  public void factSumTest2() {
    assertEquals("Resultado", app.factSum(2, 0), 3);
  }

}