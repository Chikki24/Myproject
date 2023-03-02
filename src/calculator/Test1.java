package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import calculator.Calmethod2;
class Test1 {

	@Test
	public void Caltestadd() {
		assertEquals(15, Calmethod2.Sum(10,5));
	}
	@Test
	public void Caltestsub() {
		assertEquals(5, Calmethod2.Subtract(10,5));
	}
	@Test
	public void Caltestmul() {
		assertEquals(50, Calmethod2.Multiple(10,5));
	}
	@Test
	public void Caltestdiv() {
		assertEquals(2, Calmethod2.Divide(10, 5));
	}

}
