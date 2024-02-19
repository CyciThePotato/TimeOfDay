package timeofday;

public class TimeOfDay {
	/**
	 * @invar uren zijn geldig
	 * 	| 0 <= getUren() && getUren() <= 23
	 * @invar msm zijn geldig
	 * 	| 0 <= getMsm() && getMsm() <= 59
	 */
	private int uren;
	private int msm;	// minutes sinds midnight
	
	/**
	 * Initialiseer 'TimeOfDay' met de gegeven uren en minuten
	 * @pre het aantal uren ligt tussen 0 en 23
	 * 	| 0 <= this.getUren() && this.getUren() <= 23
	 * @pre het aantal minuten ligt tussen 0 en 59
	 * 	| 0 <= this.getMsm() && this.getMsm() <= 59
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == uren
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMsm() == msm
	 * 
	 */
	public TimeOfDay(int uren, int msm) {
		this.uren = uren;
		this.msm = msm;
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
	 * 	| 0 <= this.getUren() && this.getUren() <= 23
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getUren() == uren
	 */
	public void setUren(int uren) {
		this.uren = uren;
	}
	/**
	 * @pre het aantal minuten ligt tussen 0 en 59
	 * 	| 0 <= this.getMsm() && this.getMsm() <= 59
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMsm() == msm
	 */
	public void setMsm(int msm) {
		this.msm = msm;
	}
	
}
