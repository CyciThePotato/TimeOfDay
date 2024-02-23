package timeofday;
/**
 * Elke instantie van deze klasse slaat op 
 */
/**
 * Elke instantie van deze klasse slaat een tijdstip op, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur
 *
 * @invar | getMsm() == getUren() * 60 + getMin()
 * @invar | 0 <= getUren() && getUren() <= 23
 * @invar | 0 <= getMin() && getMin() <= 59
 */
public class TimeOfDay {
	/**
	 * @invar 'uren' is niet negatief of groter dan 23
	 * 	| 0 <= uren && uren <= 23
	 * @invar 'min' is niet negatief of groter dan 59
	 * 	| 0 <= min && min <= 59
	 * @invar 'min' is niet negatief of groter dan 59
	 * 	| 0 <= msm && msm <= 59
	 */
	private int uren;
	private int min;	
	private int msm;	// minuten sinds middernacht
	
	/**
	 * Initialiseer 'TimeOfDay' met de gegeven uren en minuten
	 * @throwsIllegalArgumentException 'uren' is niet negatief of groter dan 23
	 * 	| !(0 <= hours && hours <= 23)
	 * @mthrowsIllegalArgumentExceptionsm 'min' is niet negatief of groter dan 59
	 * 	| !(0 <= min && min <= 59)
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == hours
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMin() == min
	 * 
	 */
	public TimeOfDay(int hours, int min) {
		if (hours < 0)
			throw new IllegalArgumentException("`hours`is less than zero");
		if (hours > 23)
			throw new IllegalArgumentException("`hours` is greater than 59");
		if (min < 0 || min > 59)
			throw new IllegalArgumentException("`min` is out of range");
		this.uren = hours;
		this.min = min;
	}
	
	public int getUren() {
		return this.uren;
	}

	public int getMin() {
		return this.min;
	}
	
	public int getMsm() {
		return uren * 60 + min;
	}
	
	/**
	 * Stelt het aantal uren van de dag in.
	 * @pre het aantal uren ligt tussen 0 en 23
	 * 	| 0 <= uren && uren <= 23
	 * 
	 * @mutates | this
	 * 
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == uren
	 * @post | getMin() == old(getMin())
	 */
	public void setUren(int uren) {
		this.uren = uren;
	}
	/**
	 * Stel het aantal minuten sinds middernacht in.
	 * @pre het aantal minuten ligt tussen 0 en 59
	 * 	| 0 <= min && min <= 59
	 * 
	 * @mutates | this
	 * 
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMin() == min
	 * @post | getUren() == old(getUren())
	 */
	public void setMin(int min) {
		this.min = min;
	}
	
	/**
	 * Stelt de uren van dit object in op de gegeven uren.
	 * @pre | 0 <= msm && msm < 24 * 60
	 * 
	 * @mutates | this
	 * 
	 * @post | getMsm() == msm
	 * @post | getUren() == old(getUren())
	 */
	public void setMsm(int msm) {
		uren = msm / 60;
		min = msm % 60;
	}
	/**
	 * returns a new timeofday whose minutes are the given minutes
	 * 
	 * @pre | 0 <= newmin && newmin <= 59
	 * te lui om defensief (illegalarg exception) te schrijven
	 * @post | result != null
	 * @post | result.getUren() == getUren()
	 * @post | result.getMin() == newmin
	 * 
	 */
	public TimeOfDay withMinutes(int newmin) {
		throw new RuntimeException("Not yet implemented");
	}

}
