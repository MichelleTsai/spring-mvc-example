package jenkins.test;

import org.junit.Assert;
import org.junit.Test;

public class HolidayTest {

	Holiday holiday = new Holiday();

	@Test
	public void testFriNotHoliday() {
		Assert.assertFalse("Fri not Friday", holiday.isHoliday("Fri"));
	}

	@Test
	public void testSatNotHoliday() {
		Assert.assertTrue("Sat not Friday", holiday.isHoliday("Sat"));
	}

	@Test
	public void testSunNotHoliday() {
		Assert.assertTrue("Sun not Friday", holiday.isHoliday("Sun"));
	}
}
