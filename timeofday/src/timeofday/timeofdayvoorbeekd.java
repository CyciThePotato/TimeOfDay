package timeofday;

// Hoe ontwikkel ik een data-abstractie?
// 1. de API deinieren: hoe kunnen & moeten de klanten de abstractie gebruiken
//	a. Korte informele documentatie bij klasse zelf: wat slaat een instantie (mutable abstraction) of stelt een instantie voor (immutable abstraction)
//	b. de rauwe abstractietoestandensruimte definieren: de inspectoren (=getters) declareren
//	c. geldige abstractietoestandsruimte definieren: toestandsinvariabelen
//	d. de constructoren en mutatoren declareren
//	e. de constructoren en mutatoren documenteren: precondities en postcondities (resultaat van neveneffecten (= nieuwe toestand gewijzigde objecten))
// 2. de abstractie implementeren in termen van java constructies: velden en method/constructor bodies toevoegen
//	a. een representatie kiezen
//		i. rauwe concrete toestandsruimte definieren = velden introduceren
//		ii. geldige concretetoestandsruimte definieren = concretetoestandsinvarianten noteren (= @invar-clausules bij de velden)
//	b. implementeren van de constructoren en mutatoren
/**
 * Elke instantie van deze klasse slaat een tijdstip op, gegeven door een aantal uren sinds middernacht en een aantal minuten binnen het uur
 *
 * @invar | getMinutesSinceMidnight() == getHours() * 60 + getMinutes()
 * @invar | 0 <= getHours() && getHours() <= 23
 * @invar | 0 <= getMinutes() && getMinutes() <= 59
 */
public class timeofdayvoorbeekd {
	/**
	 * @invar | 0 <= hours && hours <= 23
	 * @invarr | 0 <= minutes && minutes <= 59
	 */
	private int hours;
	private int minutes;
	
	public int getHours() {
		return 0;
	}
	
	public int getMinutes() {
		return 0;
	}
	
	public int getMinutesSinceMidnight() {
		return 0;
	}
	
	/**
	 * Initialiseer 'TimeOfDay' met de gegeven uren en minuten
	 * @throwsIllegalArgumentException 'uren' is niet negatief of groter dan 23
	 * 	| !(0 <= hours && hours <= 23)
	 * @mthrowsIllegalArgumentExceptionsm 'min' is niet negatief of groter dan 59
	 * 	| !(0 <= min && min <= 59)
	 * @post de msm is gelijk aan de gegeven msm
	 * 	| getHours() == hours
	 * @post de uren zijn gelijk aan de gegeven uren
	 * 	| getMinutes() == min
	 * 
	 */                                        
	public timeofdayvoorbeekd(int hours, int min) {
		if (hours < 0)
			throw new IllegalArgumentException("`hours`is less than zero");
		if (hours > 23)
			throw new IllegalArgumentException("`hours` is greater than 59");
		if (min < 0 || min > 59)
			throw new IllegalArgumentException("`min` is out of range");
		this.hours = hours;
		this.minutes = min;
	}
	
	/**
	 * Stelt de uren van dit object in op de gegeven uren.
	 * @pre | 0 <= hours && hours <= 23
	 * 
	 * @mutates | this
	 * 
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		
	}
	public void setMinutes(int minutes) {
		
	}
	/**
	 * Stelt de uren van dit object in op de gegeven uren.
	 * @pre | 0 <= msm && msm < 24 * 60
	 * 
	 * @mutates | this
	 * 
	 * @post | getMinutesSinceMidnight() == msm
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutesSinceMidnight(int msm) {
		hours = msm / 60;
		minutes = msm % 60;
	}
}
