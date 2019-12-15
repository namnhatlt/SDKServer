package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarouselContent {
	@JsonProperty("carousel_cards")
	private ArrayList<CarouselCard> carouselCards;

	/**
	 * Get carousel cards
	 * @return carousel cards
	 */
	public ArrayList<CarouselCard> getCarouselCards() {
		return carouselCards;
	}

	/**
	 * Set carousel cards
	 * @param carouselCards
	 */
	public void setCarouselCards(ArrayList<CarouselCard> carouselCards) {
		this.carouselCards = carouselCards;
	}
}
