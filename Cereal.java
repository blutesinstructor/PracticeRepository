import java.io.Serializable;

/**
 * 
 */

/**
 * @author Bradley
 *
 */
public class Cereal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cerealName;
	private int Qty;
	private String yuckOrYummy;
	private int rating;
	private boolean sugary;
	
	public Cereal(String cerealName, int qty, String yuckOrYummy, int rating, boolean sugary) {
		this.cerealName = cerealName;
		Qty = qty;
		this.yuckOrYummy = yuckOrYummy;
		this.rating = rating;
		this.sugary = sugary;
	}

	/**
	 * @return the cerealName
	 */
	public String getCerealName() {
		return cerealName;
	}

	/**
	 * @param cerealName the cerealName to set
	 */
	public void setCerealName(String cerealName) {
		this.cerealName = cerealName;
	}

	/**
	 * @return the qty
	 */
	public int getQty() {
		return Qty;
	}

	/**
	 * @param qty the qty to set
	 */
	public void setQty(int qty) {
		Qty = qty;
	}

	/**
	 * @return the yuckOrYummy
	 */
	public String getYuckOrYummy() {
		return yuckOrYummy;
	}

	/**
	 * @param yuckOrYummy the yuckOrYummy to set
	 */
	public void setYuckOrYummy(String yuckOrYummy) {
		this.yuckOrYummy = yuckOrYummy;
	}

	/**
	 * @return the rating
	 */
	public int getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(int rating) {
		this.rating = rating;
	}

	/**
	 * @return the sugary
	 */
	public boolean isSugary() {
		return sugary;
	}

	/**
	 * @param sugary the sugary to set
	 */
	public void setSugary(boolean sugary) {
		this.sugary = sugary;
	}
	
	public String toString(){
		String str;
		str = "***New Cereal Item***\n" +
				"Cereal Name: " + this.cerealName + "\n" +
				"Qty: " + this.Qty + "\n" +
				"Flavor: " + this.yuckOrYummy + "\n" +
				"Sugary: " + this.sugary + "\n" +
				"Customer Rating: " + this.rating;
		return str;
	}
	
	

}
