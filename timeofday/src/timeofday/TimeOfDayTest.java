package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay ochtend = new TimeOfDay(1, 1);
		assertEquals(ochtend.getUren(), 1);
		assertEquals(ochtend.getMin(), 1);
		ochtend.setUren(23);
		ochtend.setMin(0);
		assertEquals(23, ochtend.getUren());
		assertEquals(0, ochtend.getMin());
		int hours = ochtend.getUren();
		int min = ochtend.getMin();
		ochtend.setUren(0);
		ochtend.setMin(0);
		assertNotEquals(ochtend.getUren(), hours);
		assertEquals(ochtend.getMin(), min);
		
		
		TimeOfDay middernacht = new TimeOfDay(0, 0);
		assertEquals(middernacht.getUren(), 0);
		assertEquals(middernacht.getMin(), 0);
		int uren = middernacht.getUren();
		int msm = middernacht.getMin();
		middernacht.setUren(0);
		middernacht.setMin(0);
		assertEquals(middernacht.getUren(), uren);
		assertEquals(middernacht.getMin(), msm);
		
		TimeOfDay nearly = new TimeOfDay(23, 59);
		assertEquals(nearly.getUren(), 23);
		assertEquals(nearly.getMin(), 59);
		
		
		
	}

}
