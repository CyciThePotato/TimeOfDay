package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay ochtend = new TimeOfDay(1, 1);
		assertEquals(ochtend.getUren(), 1);
		assertEquals(ochtend.getMsm(), 1);
		ochtend.setUren(23);
		ochtend.setMsm(0);
		assertEquals(23, ochtend.getUren());
		assertEquals(0, ochtend.getMsm());
		int hours = ochtend.getUren();
		int min = ochtend.getMsm();
		ochtend.setUren(0);
		ochtend.setMsm(0);
		assertNotEquals(ochtend.getUren(), hours);
		assertEquals(ochtend.getMsm(), min);
		
		
		TimeOfDay middernacht = new TimeOfDay(0, 0);
		assertEquals(middernacht.getUren(), 0);
		assertEquals(middernacht.getMsm(), 0);
		int uren = middernacht.getUren();
		int msm = middernacht.getMsm();
		middernacht.setUren(0);
		middernacht.setMsm(0);
		assertEquals(middernacht.getUren(), uren);
		assertEquals(middernacht.getMsm(), msm);
		
		TimeOfDay nearly = new TimeOfDay(23, 59);
		assertEquals(nearly.getUren(), 23);
		assertEquals(nearly.getMsm(), 59);
		
		
		
	}

}
