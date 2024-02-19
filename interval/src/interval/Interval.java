package interval;

/**
 * Elke instantie van deze klasse slaat een interval op de gehele as op. (slaat op want kan gewijzigd worden)
 * 
 * @invar De lengte is niet negatief
 * 	| 0 <= this.getLengte()
 * @invar De bovengrens is gelijk aan de ondergrens plus de lengte
 * 	| this.getBovengrens() == this.getOndergrens() + this.getLengte()
 */
public class Interval {
	/**
	 * @invar Het veld 'lengte' is niet negatief (Concrete toestandsinvar).
	 * 	| 0 <= lengte
	 */
	private int ondergrens;		// zo kan de klant niet rechtstreeks aan de representatie
	private int lengte;
	
	
	public int getOndergrens() {
		return ondergrens;		// je mag this.ondergrens omitten als geen verwarring mogelijk is
	}
	
	public int getBovengrens() {
		return this.getLengte() - this.getOndergrens();
	}
	
	public int getLengte() {
		return this.lengte;
	}
//	public static int getLengte(Interval interval) {
//		return interval.lengte;
//	}
	
	
	/**
	 * Initialiseer dit object met de gegeven ondergrens en bovengrens.
	 * @pre De gegeven bovengrens is niet kleiner dan de gegeven ondergrens.
	 * 	| beginOnder <= beginBoven
	 * @post De ondergrens van gegeven object is gelijk aan de gegeven ondergrens.
	 *	| getOndergrens() == beginOnder
	 * @post De bovengrens van het nieuwe object is gelijk aan de gegeven bovengrens.
	 *	| getBovengrens() == beginBoven
	 */
	public Interval(int beginOnder, int beginBoven) {
		this.ondergrens = beginOnder;
		this.lengte = beginBoven - beginOnder;
	}
	
	
	/**
	 * Stelt de ondergrens van dit object in op de gegeven waarde.
	 * @pre De gegeven ondergrens is niet goter dan de bovengrens van dit object.
	 * 	| nieuweOndergrens <= getBovengrens()
	 * @mutates | this
	 * @post De ondergrens van dit object is gelijk aan de gegeven ondergrens.
	 * 	| this.getOndergrens() == nieuweOndergrens
	 * @post De Lengte blijft ongewijzigd.
	 * 	| getLengte() == old(getLengte())
	 */
	public void setOndergrens(int nieuweOndergrens) {
		this.ondergrens = nieuweOndergrens;
	}
	
	/**
	 * Stelt de bovengrens van dit object in op de gegeven waarde.
	 * @pre De gegeven bovengrens is niet kleiner dan de ondergrens van dit object.
	 * 	| nieuweBovengrens >= getOndergrens()
	 * @mutates | this
	 * @post De bovengrens van dit object is gelijk aan de gegeven bovengrens.
	 * 	| this.getBovengrens() == nieuweBovengrens
	 * @post De Lengte blijft ongewijzigd.
	 * 	| getLengte() == old(getLengte())
	 */
	public void setBovengrens(int nieuweBovengrens) {
		this.lengte = nieuweBovengrens - this.ondergrens;
	}
}
