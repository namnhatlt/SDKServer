package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CarouselContent {
	@JsonProperty("carousel_cards")
	private ArrayList<CarouselCard> carouselCards;

	public ArrayList<CarouselCard> getCarouselCards() {
		return carouselCards;
	}

	public void setCarouselCards(ArrayList<CarouselCard> carouselCards) {
		this.carouselCards = carouselCards;
	}
}
