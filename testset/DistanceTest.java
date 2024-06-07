import static org.junit.Assert.*;

import org.junit.Test;

public class DistanceTest {

	@Test(expected=IllegalArgumentException.class)
	public void testX1TooSmall() {
		Distance.distance(-100, 75.1652, 21.3069, 157.8583);
	}

}
