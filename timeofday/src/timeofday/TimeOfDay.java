package timeofday;
/**
 * Elke instantie van deze klasse slaat op 
 */
public class TimeOfDay {
	/**
	 * @invar 'uren' is niet negatief of groter dan 23
	 * 	| 0 <= uren && uren <= 23
	 * @invar 'msm' is niet negatief of groter dan 59
	 * 	| 0 <= msm && msm <= 59
	 */
	private int uren;
	private int msm;	// minuten sinds middernacht
	
	/**
	 * Initialiseer 'TimeOfDay' met de gegeven uren en minuten
	 * @pre 'uren' is niet negatief of groter dan 23
	 * 	| 0 <= hours && hours <= 23
	 * @pre 'msm' (minuten sinds middernacht) is niet negatief of groter dan 59
	 * 	| 0 <= min && min <= 59
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == hours
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMsm() == min
	 * 
	 */
	public TimeOfDay(int hours, int min) {
		System.out.println("OK");
		this.uren = hours;
		System.out.println("OK");

		this.msm = min;
	}
	
	public int getUren() {
		return this.uren;
	}

	public int getMsm() {
		return this.msm;
	}
	
	/**
	 * Stelt het aantal uren van de dag in.
	 * @pre het aantal uren ligt tussen 0 en 23
	 * 	| 0 <= uren && uren <= 23
	 * @mutates | uren
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == uren
	 */
	public void setUren(int uren) {
		this.uren = uren;
	}
	/**
	 * Stel het aantal minuten sinds middernacht in.
	 * @pre het aantal minuten ligt tussen 0 en 59
	 * 	| 0 <= msm && msm <= 59
	 * @mutates | msm
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMsm() == msm
	 */
	public void setMsm(int msm) {
		this.msm = msm;
	}

}
